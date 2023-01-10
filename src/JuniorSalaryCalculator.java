public class JuniorSalaryCalculator extends BaseSalaryCalculator{
    public JuniorSalaryCalculator(DeveloperReport developerReports) {
        super(developerReports);
    }

    public double calculateSalary(){
        return (developerReports.getHourlyRate() * developerReports.getWorkingHours());
    }
}
