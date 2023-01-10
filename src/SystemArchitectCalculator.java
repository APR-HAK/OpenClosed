public class SystemArchitectCalculator extends BaseSalaryCalculator{
    public SystemArchitectCalculator(DeveloperReport developerReports) {
        super(developerReports);
    }

    public double calculateSalary(){
        return 2000 + (developerReports.getHourlyRate() * developerReports.getWorkingHours()) * 1.5;
    }
}
