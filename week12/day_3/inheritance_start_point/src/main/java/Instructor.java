public class Instructor extends Person {

    private String name;
    private String cohort;
    private String moduleTeam;

    public Instructor(String name, String cohort, String moduleTeam) {
        super(name, cohort);
        this.moduleTeam = moduleTeam;
    }

    public String getModuleTeam() {
        return moduleTeam;
    }

    public void setModuleTeam(String moduleTeam) {
        this.moduleTeam = moduleTeam;
    }

    public String talk(String language){
        return "I really love " + language;
    }
}