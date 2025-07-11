package projeto_4.entities;

public class Employee {

    public String name;
    public double grossSalary;
    public double tax;

    public double netSalary() {
        return grossSalary - tax;
    }

    public void increaseSalary(double percentage) {
        this.grossSalary *= (100 + percentage) / 100;
    }

    public String toString(){
        return "Employee: "
                + name
                + ", $"
                + String.format("%.2f", netSalary());

    }
}
