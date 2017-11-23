import java.util.HashMap;


public class CoffeeMachine extends StateMachine
{
    public CoffeeMachine()
    {
        table=new HashMap<String,HashMap<String, String>>();
        HashMap<String, String> stare_curenta_tabela;
        stare_curenta_tabela=new HashMap<String, String>();
        stare_curenta_tabela.put("5", "S1");
        stare_curenta_tabela.put("10", "S2");
        table.put("S0",stare_curenta_tabela);


        stare_curenta_tabela=new HashMap<String,String>();
        stare_curenta_tabela.put("5", "S2");
        stare_curenta_tabela.put("10", "S3");
        table.put("S1",stare_curenta_tabela);


        stare_curenta_tabela=new HashMap<String,String>();
        stare_curenta_tabela.put("5"," S3");
        stare_curenta_tabela.put("C10"," S0");
        table.put("S2",stare_curenta_tabela);

        stare_curenta_tabela=new HashMap<String,String>();
        stare_curenta_tabela.put("C10"," S1");
        stare_curenta_tabela.put("C15"," S0");
        table.put("S3",stare_curenta_tabela);

        stare_curenta_tabela= new HashMap<String,String>();
        stare_curenta_tabela.put("C10"," S2");
        stare_curenta_tabela.put("C15"," S1");
        table.put("S4",stare_curenta_tabela);

        stare_curenta="S0";


    }


    public void transition(String action) {

       if(table.get(stare_curenta) != null && table.get(stare_curenta).get(action) != null)
            stare_curenta = table.get(stare_curenta).get(action);

        System.out.println(stare_curenta);
    }


    public String Afis()
    {
        if(stare_curenta.equals("S0"))
            return "0";
        if(stare_curenta.equals("S1"))
            return "5";
        if(stare_curenta.equals("S2"))
            return "10";
        if(stare_curenta.equals("S3"))
            return "15";
        return null;
    }
}