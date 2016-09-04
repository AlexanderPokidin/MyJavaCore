package module4;

public abstract class Bank {
    public Bank() {
    }

    private long id;
    private String bankCountry;
    private Currency currency;
    private int numberOfEmployees;
    private double salaryOfEmployee;
    private long raiting;
    private long totalCapital;

    public Bank(long id, String bankCountry, Currency currency, int numberOfEmployees, double salaryOfEmployee, long raiting, long totalCapital) {
        this.id = id;
        this.bankCountry = bankCountry;
        this.currency = currency;
        this.numberOfEmployees = numberOfEmployees;
        this.salaryOfEmployee = salaryOfEmployee;
        this.raiting = raiting;
        this.totalCapital = totalCapital;
    }

    abstract int getLimitOfWithdrawAll();
    abstract int getLimitOfFunding();
    abstract int getMonthluRate();
    abstract int getCommission();

    double moneyPaidMonthlyForSalary() {};



    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getBankCountry() {
        return bankCountry;
    }

    public void setBankCountry(String bankCountry) {
        this.bankCountry = bankCountry;
    }

    public Currency getCurrency() {
        return currency;
    }

    public void setCurrency(Currency currency) {
        this.currency = currency;
    }

    public int getNumberOfEmployees() {
        return numberOfEmployees;
    }

    public void setNumberOfEmployees(int numberOfEmployees) {
        this.numberOfEmployees = numberOfEmployees;
    }

    public double getSalaryOfEmployee() {
        return salaryOfEmployee;
    }

    public void setSalaryOfEmployee(double salaryOfEmployee) {
        this.salaryOfEmployee = salaryOfEmployee;
    }

    public long getRaiting() {
        return raiting;
    }

    public void setRaiting(long raiting) {
        this.raiting = raiting;
    }

    public long getTotalCapital() {
        return totalCapital;
    }

    public void setTotalCapital(long totalCapital) {
        this.totalCapital = totalCapital;
    }
}
