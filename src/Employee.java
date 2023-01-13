public class Employee {
    String name;
    int workHours, hireYear, salaryAmount=0;
    double salary;

    Employee(String name, double salary, int workHours, int hireYear){
        this.name=name;
        this.salary=salary;
        this.workHours=workHours;
        this.hireYear=hireYear;

    }

    void run(){
        tax();
    }
    double tax(){
        //Çalışanın maaşı 1000 TL'den az ise vergi uygulanmayacaktır.
        //Çalışanın maaşı 1000 TL'den fazla ise maaşının %3'ü kadar vergi uygulanacaktır.
        if(this.salary>1000.0)
            return salary*0.03;

        return 0.0;
        //return (this.salary>1000 ? (this.salary*0.03) : 0.0);
    }

    double bonus(){
        //Eğer çalışan haftada 40 saatten fazla çalışmış ise fazladan çalıştığı
        //her saat başına 30 TL olacak şekilde bonus ücretleri hesaplayacaktır.
        return this.workHours>40 ? (this.workHours-40)*30 : 0.0;
    }

    double raiseSalary(){
        //Çalışanın işe başlangıç yılına göre maaş artışını hesaplayacaktır. Şuan ki yılı 2021 olarak alın.
        //Eğer çalışan 10 yıldan az bir süredir çalışıyorsa maaşına %5 zam yapılacaktır.
        //Eğer çalışan 9 yıldan fazla ve 20 yıldan az çalışıyorsa maaşına %10 zam yapılacaktır.
        //Eğer çalışan 19 yıldan fazla çalışıyorsa %15 zam yapılacaktır.
        salaryAmount=2021-hireYear;
        if(salaryAmount<10)
            return 0.05*salary;
        if(salaryAmount>=9 && salaryAmount<20)
            return 0.10*salary;
        if(salaryAmount>19)
            return 0.15*salary;
        return 0.0;
    }

    public String toString(){
        //Çalışana ait bilgileri ekrana bastıracaktır.
        System.out.println("Adı: " +this.name);
        System.out.println("Maaşı: " +this.salary);
        System.out.println("Çalışma Saati: " +this.workHours);
        System.out.println("Başlangıç Yılı: " +this.hireYear);
        System.out.println("Vergi: " +tax() + "$");
        System.out.println("Bonus: " +bonus() + "$");
        System.out.println("Maaş Artışı: " +raiseSalary() + "$");
        System.out.println("Vergi ve Bonuslar ile birlikte maaş: " +(bonus() + salary- tax()) + "$");
        System.out.println("Toplam Maaş: " + (salary+raiseSalary()) + "$");

        return null;
    }
}
