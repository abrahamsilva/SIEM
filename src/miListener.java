import java.util.ArrayList;

public class miListener extends grammBaseListener {

    public ArrayList<String> XML = new ArrayList<>();

    //linea 1
    String ruleGroup = "";
    int id = 1;

    //linea 2
    String subcheck = "";
    String operator1 = "";

    int propertyID = 1;

    String qualifier = "";

    String status = "";

    ArrayList<String> objectArray = new ArrayList<>();


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

    public void printXML(){
        for(int i = 0; i<XML.size(); i++){
            System.out.println((i+1) + ". " + XML.get(i));
        }
    }

    public void fillXML(){
        XML.add("<rule group=\"" + ruleGroup + "\" id =\"" + id + "\" name =\"Authentication Rule " + id + "\">");
        XML.add("\t<test group=\"" + subcheck + "\" id=\"" + id + "\" operator=\"" + operator1.toUpperCase() + "\">");
        XML.add("\t\t<properties>");
        XML.add("\t\t\t<property id=\"" + propertyID + "\" name=\"" + subcheck + "\" qualifier=\"" + qualifier.toUpperCase() + "\" value=\""+ subcheck + " " + status + "\"/>");
        XML.add("\t\t</properties>");
        XML.add("\t</test>");
        XML.add("\t<test group=\"");
        XML.add("</rule>");
    }
}