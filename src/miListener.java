import java.util.ArrayList;

public class miListener extends grammBaseListener {

    //main XML
    public ArrayList<String> XML = new ArrayList<>();

    //main rule
    String ruleGroup = "";
    //main id
    int id = 1;

    //id of group
    int groupID = 1;

    //main group name
    String subcheck = "";
    //main operator
    String operator1 = "";

    //id of properties, resets every test grop
    int propertyID = 1;

    //main qualifier
    String qualifier = "";

    //auxiliar
    String status = "";

    //array for second test group
    ArrayList<String> objectArray = new ArrayList<>();

    //to know how many properties are
    int propertiesCounter = 0;
    //to store properties
    ArrayList<String> propertiesArray = new ArrayList<>();
    //goes linked with properties
    ArrayList<String> valueArray = new ArrayList<>();

    //to help save relational operators inside properties
    ArrayList<String> relopArray = new ArrayList<>();
    //linked with relop array
    ArrayList<String> numbrerRelopArray = new ArrayList<>();
    //aux var
    boolean relopBool = false;

    //time aux
    int numberAux = 0;
    //units aux
    String unitAux = "";

    //main cycle
    int mainOperatorCount = 0;




    @Override
    public void exitCorrule(grammParser.CorruleContext ctx) {
        fillXML();
        printXML();
    }

    @Override
    public void enterName(grammParser.NameContext ctx) {
        if (ruleGroup != "")
            ruleGroup += " ";
        ruleGroup += ctx.getText();

    }

    @Override
    public void enterMainConditionName(grammParser.MainConditionNameContext ctx) {
        subcheck = ctx.getText();
    }

    @Override
    public void enterMainBodyOperator(grammParser.MainBodyOperatorContext ctx) {
        operator1 = ctx.getText();
    }

    @Override
    public void enterStatus(grammParser.StatusContext ctx) {
        ruleGroup += ctx.getText();
    }

    @Override
    public void enterQualifier(grammParser.QualifierContext ctx) {
        qualifier = ctx.getText();
    }

    @Override
    public void enterStatusAux(grammParser.StatusAuxContext ctx) {
        status = ctx.getText();
    }

    @Override
    public void enterPropertiesOperator(grammParser.PropertiesOperatorContext ctx) {
        propertiesCounter++;
        propertiesArray.add(ctx.getText());
    }

    @Override
    public void enterObject(grammParser.ObjectContext ctx) {
        objectArray.add(ctx.getText());
        if(!relopBool){
            relopArray.add("");
            numbrerRelopArray.add("");
        }
        relopBool = false;
    }

    @Override
    public void enterValue(grammParser.ValueContext ctx) {
        valueArray.add(ctx.getText());
    }

    @Override
    public void enterNumberRelop(grammParser.NumberRelopContext ctx) {
        numbrerRelopArray.add(ctx.getText());
        relopBool = true;
    }

    @Override
    public void enterRelop(grammParser.RelopContext ctx) {
        relopArray.add(ctx.getText());
    }

    @Override
    public void enterNumber(grammParser.NumberContext ctx) {
        numberAux = Integer.parseInt(ctx.getText());
    }

    @Override
    public void enterUnits(grammParser.UnitsContext ctx) {
        unitAux = ctx.getText();
    }

    @Override
    public void exitMainBodyOperator(grammParser.MainBodyOperatorContext ctx) {
        mainOperatorCount++;
    }

    public void printXML(){
        for(int i = 0; i<XML.size(); i++){
            System.out.println((i+1) + ". " + XML.get(i));
        }
    }

    public String concatenateObjects(){
        String auxObjects = "";
        for (int i = 0; i<objectArray.size(); i++){
            if(auxObjects != ""){
                auxObjects += " and ";
            }
            auxObjects += objectArray.get(i);
        }
        return auxObjects;
    }

    public String relopAux(int i){
        String aux = "";

        switch (relopArray.get(i)){
            case "less than":
                aux = "lt";
                break;
            case "greater than":
                aux = "gt";
                break;
            case "equals to":
                aux = "et";
                break;
            case "within":
                aux = "wt";
                break;
        }

        if(numbrerRelopArray.get(i) == "")
            return("<property id=\"" + (i+1) + "\" name=\"" + objectArray.get(i) + "\" value=\"" + valueArray.get(i).toUpperCase() + "\"/>");
        else
            return("<property count=\"&" + aux + ";" + numbrerRelopArray.get(i) + "\" id=\"" + (i+1) + "\" name=\"" + objectArray.get(i) + "\" value=\"" + valueArray.get(i).toUpperCase() + "\"/>");
    }

    public void fillXML(){
        int i = 0;
        XML.add("\t<rule group=\"" + ruleGroup + "\" id =\"" + id + "\" name =\"Authentication Rule " + id + "\">");
        XML.add("\t\t<test group=\"" + subcheck + "\" id=\"" + groupID + "\" operator=\"" + operator1.toUpperCase() + "\">");
        XML.add("\t\t\t<properties>");
        XML.add("\t\t\t\t<property id=\"" + propertyID + "\" name=\"" + subcheck + "\" qualifier=\"" + qualifier.toUpperCase() + "\" value=\""+ subcheck + " " + status + "\"/>");
        XML.add("\t\t\t</properties>");
        XML.add("\t\t</test>");
        //------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
        XML.add("\t\t<test group=\"" + concatenateObjects() + "\" id=\"" + (groupID+1) + "\" operator=\"" + propertiesArray.get(groupID-1).toUpperCase() + "\">");
        XML.add("\t\t\t<properties>");
        for (; i<propertiesCounter + 1; i++){
            XML.add("\t\t\t\t" + relopAux(i));
        }
        XML.add("\t\t\t\t<property id=\"" + (i+1) + "\" name=\"time\" unit=\"" + unitAux + "\" value=\"" + numberAux + "\"/>");
        XML.add("\t\t\t</properties>");
        XML.add("\t\t</test>");
        //------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
        XML.add("\t</rule>");
    }
}

