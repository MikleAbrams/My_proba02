package zaniatija.project_Family;

import zaniatija.demo_ZADANIJE.Naczalnik;

public class Sun extends Persons {

    public Sun (String statusFam, String name, int age) {super(statusFam, name, age);}
    @Override
    public boolean isSlushaetsa() {return super.isSlushaetsa();}

    public void Vitannia() {
        System.out.println("Hejka!");
    }

    public String synNakazan(Father father) {
        father.zloj();
        return  "Guliat nie idesh!";
    }

    public String reakciaSisterDush(Daughter daughter){
        daughter.PoetVDushe();
        return "Zatknis, nadoelo!";
    }

}
