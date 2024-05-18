package Program.ClassOOP;

public class Employee {
    protected String nama;
    protected double gaji;

    Employee() {
        System.out.println("Konstruktor pegawai running");
    }

    Employee(String n, double hr) {
        System.out.println("Konstruktor pegawai running");
        nama = n;
        gaji = hr;
    }

    void isiData(String n, double hr) {
        nama = n;
        gaji = hr;
    }

    void display() {
        System.out.println("Nama = " + nama + " Gaji = " + gaji);
    }

    public String toString() {
        return "Hasil toString Nama = " + this.nama + " Gaji = " + this.gaji + "<manager>";
    }
}

class Manager extends Employee {
    public String department;

    Manager() {
        System.out.println("Kontruktor manager runnning");
    }

    Manager(String nama, double hr, String department) {
        super(nama, hr);
        System.out.println("Kontruktor manager running");
        this.department = department;
    }

    public void isiData(String nama, double hr, String department) {
        super.isiData(nama, hr);
        this.department = department;
    }

    public void display() {
        System.out.println("Nama = " + this.nama + " Gaji = " + this.gaji + " Department = " + this.department);
    }
}
