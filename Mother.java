package zaniatija.project_Family;

public class Mother extends Persons {

    public Mother (String statusFam, String name, int age) {super(statusFam, name, age);}
    @Override
    public boolean isSlushaetsa() {return super.isSlushaetsa();}

    public Mother mother;

    public boolean dobraja(){ return true;}

    public boolean mamaZlaja (){return true;}

    public String otvetVitannja (Father father){
        father.Vitannia();
        return "Privet, dorogoj.";
    }
    public String reakciaDoughterDush(Daughter daughter){
        daughter.PoetVDushe();
        return "Sing your song, my dear!";
    }

}
