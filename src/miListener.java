import java.io.File;
import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;



public class miListener extends grammBaseListener {

    private File XMLfile;
    private File EPLfile;

    public miListener(File XMLfile, File EPLfile) {
        this.XMLfile = XMLfile;
        this.EPLfile = EPLfile;
    }
    //main XML & EPL
    public ArrayList<String> XML = new ArrayList<>();
    public ArrayList<String> EPL = new ArrayList<>();

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

    //id of properties, resets every test group
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
    ArrayList<String> numberRelopArray = new ArrayList<>();
    //aux var
    boolean relopBool = false;

    //time aux
    int numberAux = 0;
    //units aux
    String unitAux = "";

    //main cycle
    int mainOperatorCount = 0;

    //relopTime
    String relopTime = "";

    @Override
    public void exitCorrule(grammParser.CorruleContext ctx) {

        fillXML();
        fillEPL();

        try {
            Files.write(Paths.get(XMLfile.getName()), XML, Charset.forName("UTF-8"));
            XMLfile.createNewFile();

            Files.write(Paths.get(EPLfile.getName()), EPL, Charset.forName("UTF-8"));
            EPLfile.createNewFile();
        }
        catch (IOException e) {
            e.printStackTrace();
        }
        printXML();
        printEPL();
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
            numberRelopArray.add("");
        }
        relopBool = false;
    }

    @Override
    public void enterValue(grammParser.ValueContext ctx) {
        valueArray.add(ctx.getText());
    }

    @Override
    public void enterNumberRelop(grammParser.NumberRelopContext ctx) {
        numberRelopArray.add(ctx.getText());
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
    public void enterRelopTime(grammParser.RelopTimeContext ctx) {
        relopTime = ctx.getText();
    }

    @Override
    public void exitMainBodyOperator(grammParser.MainBodyOperatorContext ctx) {
        mainOperatorCount++;
    }

    public void printXML(){
        for(int i = 0; i<XML.size(); i++){
            System.out.println(XML.get(i));
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
                aux = "win";
                break;
        }

        if(numberRelopArray.get(i) == "")
            return("<property id=\"" + (i+1) + "\" name=\"" + objectArray.get(i) + "\" value=\"" + valueArray.get(i).toUpperCase() + "\"/>");
        else
            return("<property count=\"&" + aux + ";" + numberRelopArray.get(i) + "\" id=\"" + (i+1) + "\" name=\"" + objectArray.get(i) + "\" value=\"" + valueArray.get(i).toUpperCase() + "\"/>");
    }

    public String operatorChanger(String operator){
        String aux = "";
        switch (operator){
            case "greater than":
                aux = ">=";
                break;
            case "less than":
                aux = "<=";
                break;
            case "equals to":
                aux = "=";
                break;
            case "greater than or equals to":
                aux = ">=";
                break;
            case "less than or equals to":
                aux = "<=";
                break;
        }
        return aux;
    }

    public String win(String win){
        String aux = "";
        switch (win){
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
                aux = "win";
                break;
        }
        return aux;
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
    public void printEPL(){
        for(int i = 0; i<EPL.size(); i++){
            System.out.println(EPL.get(i));
        }
    }
    public void fillEPL() {
        String auxString =subcheck.replace(" ", "_");

        EPL.add("@Name'"+id + " "+ruleGroup+"::" + "Authentication Rule " + id +"'"  );
        EPL.add("select *from eParser eventStream." + win(relopTime) +":time batch(" +numberAux+ " "+unitAux+")");
        EPL.add("where (execute_"+ auxString.replace("-", "'")+"_"+status+"')");
        EPL.add("group by " + objectArray.get(objectArray.size() - 1) + " having count(*) " + operatorChanger(relopArray.get(0)) +
                numberRelopArray.get(0) + " and count(" + valueArray.get(0) + " " + objectArray.get(0) + ")" +
                operatorChanger(relopArray.get(0)) + numberRelopArray.get(0));
    }
}