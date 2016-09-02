package module3.homework.task4;

public class User {
    private String name;
    private int balance;
    private int monthOfEmployment;
    private String companyName;
    private int salary;
    private String currency;

    public User(String name, int balance, int monthOfEmployment, String companyName, int salary, String currency) {
        this.name = name;
        this.balance = balance;
        this.monthOfEmployment = monthOfEmployment;
        this.companyName = companyName;
        this.salary = salary;
        this.currency = currency;
    }

    private void paySalary() {
        balance = balance + salary;
    }

    private int withdraw(int summ) {
        if(summ < 1000) {
            balance = balance - (summ + summ * 5 / 100);
        } else {
            balance = balance - (summ + summ * 10 / 100);
        }
        return balance;
    }

    private int companyNameLength() {
        int nameLength;
        for (nameLength = 0; nameLength < companyName.length(); nameLength++) {
        }
        return nameLength;
    }

    private void monthIncreaser(int addMonth) {
        monthOfEmployment = monthOfEmployment + addMonth;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

    public int getMonthOfEmployment() {
        return monthOfEmployment;
    }

    public void setMonthOfEmployment(int monthOfEmployment) {
        this.monthOfEmployment = monthOfEmployment;
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public String getCurrency() {
        return currency;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }

}
