package learnInnerClass;
public class Driver {
    public static void main(String[] args) {
        // Membuat sebuah object class dan innner-class
        Company perusahaan1 = new Company("Indonesia");
        perusahaan1.setName("Telkom");
        System.out.println("Nama perusahaan "+perusahaan1.getName());
        
        Company.Employee karyawan1 = perusahaan1.new Employee();
        karyawan1.setName("Dadang");
        System.out.println("Karyawan dari perusahaan1 "+karyawan1.getName());
        System.out.println("Akses private dari inner-class "+karyawan1.getCompanyName());
        System.out.println(karyawan1.getCountryOfCompany());
    }
}
