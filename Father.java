package zaniatija.project_Family;

public class Father extends Persons {

    public Father (String statusFam, String name, int age) {super(statusFam, name, age);}
    @Override
    public boolean isSlushaetsa() {return super.isSlushaetsa();}

    public Father father;

    public void Vitannia() {
        System.out.println("Vsem privet!");
    }
    public boolean zloj (){return true;}

    public String Zaletel (Mother mother){
        mother.mamaZlaja();
        return "Nochuet w garazhe...";
    }
    public String reakciaSisterDush(Daughter daughter){
        daughter.PoetVDushe();
        return "Blin, Pevica!";
    }


}



