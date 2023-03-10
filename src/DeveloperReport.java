public class DeveloperReport {
    private final String name;
    private final String level;
    private int workingHours;
    private double hourlyRate;

    public DeveloperReport(String name, String level, double hourlyRate, int workingHours){
        this.name = name;
        this.level = level;
        this.hourlyRate = hourlyRate;
        this.workingHours = workingHours;
    }

    public double getHourlyRate(){
        return hourlyRate;
    }

    public int getWorkingHours(){
        return workingHours;
    }

    public String getLevel(){
        return level;
    }
}
