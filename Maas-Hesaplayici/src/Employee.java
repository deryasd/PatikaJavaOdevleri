public class Employee {
    String name;
    double salary;
    double workHours;
    int hireYear;

    Employee(String name, double salary,double workHours, int hireYear){
        this.name = name;
        this.salary = salary;
        this.workHours = workHours;
        this.hireYear = hireYear;
    }

    public double tax(double salary){
        if (salary <= 1000){
            System.out.println("Vergi ödeme yükümlülüğü yoktur.");
            return salary;
        }else{
            return salary * 0.03;
        }
    }

    public double bonus(double workHours){
        if(this.workHours > 40)
            return (this.workHours - 40) * 30;
        else
            return 0;
    }

    public double raiseSalary(int hireYear){
        int year = 2021 - this.hireYear;
        if(year < 10){
            return this.salary * 0.05;
        } else if (year > 9 && year < 20) {
            return this.salary * 0.10;
        }else{
            return this.salary * 0.15;
        }
    }

    public void print(Employee employee){
        /*
        * Adı : kemal
        Maaşı : 2000.0
        Çalışma Saati : 45
        Başlangıç Yılı : 1985
        Vergi : 60.0
        Bonus : 150.0
        Maaş Artışı : 300.0
        Vergi ve Bonuslar ile birlikte maaş : 2090.0
        Toplam Maaş : 2300.0
        *
        * */
        System.out.println("Adı :" + employee.name +
                "\nMaaşı :" + employee.salary +
                "\nÇalışma Saati :" + employee.workHours+
                "\nBaşlangıç Yılı :" + employee.hireYear+
                "\nVergi :"+ employee.tax(employee.salary)+
                "\nBonus :"+ employee.bonus(employee.workHours)+
                "\nMaaş Artışı :" + employee.raiseSalary(employee.hireYear)+
                "\nVergi ve Bonuslar ile Birlikte Toplam Maaş:" + (employee.salary+employee.bonus(employee.workHours)+employee.tax(employee.salary))+
                "\nToplam Maaş : "+ (employee.salary+employee.bonus(employee.workHours)+employee.tax(employee.salary)+employee.raiseSalary(employee.hireYear)));
    }
}
