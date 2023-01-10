public class SeniorSalaryCalculator extends BaseSalaryCalculator{
    public SeniorSalaryCalculator(DeveloperReport developerReports) {
        super(developerReports);
    }

    public double calculateSalary(){
        return (developerReports.getHourlyRate() * developerReports.getWorkingHours()) * 1.2;
    }
}
