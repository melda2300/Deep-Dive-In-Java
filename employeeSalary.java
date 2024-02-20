import java.util.Calendar;

public class Employee {
    // Nitelikler
    private String name;
    private double salary;
    private int workHours;
    private int hireYear;

    // Kurucu Metot
    public Employee(String name, double salary, int workHours, int hireYear) {
        this.name = name;
        this.salary = salary;
        this.workHours = workHours;
        this.hireYear = hireYear;
    }

    // Vergi Hesaplama Metodu
    public double tax() {
        if (salary > 1000) {
            return salary * 0.03;
        } else {
            return 0;
        }
    }

    // Bonus Hesaplama Metodu
    public double bonus() {
        int extraHours = Math.max(0, workHours - 40);
        return extraHours * 30;
    }

    // Maaş Artışı Hesaplama Metodu
    public double raiseSalary() {
        int currentYear = Calendar.getInstance().get(Calendar.YEAR);
        int yearsWorked = currentYear - hireYear;

        if (yearsWorked < 10) {
            return salary * 0.05;
        } else if (yearsWorked >= 10 && yearsWorked < 20) {
            return salary * 0.1;
        } else {
            return salary * 0.15;
        }
    }

    // toString Metodu
    @Override
    public String toString() {
        double totalSalary = salary - tax() + bonus() + raiseSalary();

        return "Adı: " + name +
               "\nMaaşı: " + salary +
               "\nÇalışma Saati: " + workHours +
               "\nBaşlangıç Yılı: " + hireYear +
               "\nVergi: " + tax() +
               "\nBonus: " + bonus() +
               "\nMaaş Artışı: " + raiseSalary() +
               "\nVergi ve Bonuslar ile birlikte maaş: " + (salary - tax() + bonus()) +
               "\nToplam Maaş: " + totalSalary;
    }

    public static void main(String[] args) {
        // Örnek Kullanım
        Employee employee = new Employee("kemal", 2000.0, 45, 1985);
        System.out.println(employee.toString());
    }
}
