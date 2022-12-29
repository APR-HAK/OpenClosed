public class SystemArchitectCalculator extends BaseSalaryCalculator{
    public SystemArchitectCalculator(DeveloperReport developerReports) {
        super(developerReports);
    }

    public double calculateSalary(){
        return developerReports.getHourlyRate() * developerReports.getWorkingHours() * 1.4;
    }
}
