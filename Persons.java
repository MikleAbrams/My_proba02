package zaniatija.project_Family;

public class Persons {

    private String statusFam;
    private String name;
    private int age;
    private String powedenie;
    private boolean slushaetsa;

    public Persons(String statusFam, String name, int age) {
    }

    public void setParamrtry(String myStatusFam, String myName, int myAge, boolean Slushaetsa) {
        this.statusFam = myStatusFam;
        this.name = myName;
        this.age = myAge;
        this.slushaetsa = true;
    }

    public String getParametry() {
        String myStatusFam = "В семье я - " + statusFam;
        String myName = "Имя :" + name;
        String myAge = "Возраст -" + age;
        if (slushaetsa) {
            String powedenie = "Он послушный (-ая)";
        } else {
            String powedenie = "Он не послушный (-ая)";
        }
        return myStatusFam + "\n" + myName + "\n" + myAge + "\n" + powedenie;
    }

    public String getStatusFam() {return statusFam;}
    public void setStatusFam(String statusFam) {this.statusFam = statusFam;}

    public String getName() {return name;}
    public void setName(String name) {this.name = name;}

    public int getAge() {return age;}
    public void setAge(int age) {this.age = age;}

    public boolean isSlushaetsa() {return slushaetsa;}
    public void setSlushaetsa(boolean slushaetsa) {this.slushaetsa = slushaetsa;}

}








