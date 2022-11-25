package learnInnerClass;
/**
 *
 * @author rizky
 */
public class Company extends Country 
{
    private String name;
    public Company(String countryName)
    {
        super(countryName);
    }
    public void setName(String nameCompany)
    {
        name=nameCompany;
    }
    public String getName()
    {
        return name;
    }
    // Membuat sebuah inner class
    public class Employee 
    {
        private String name;
        
        public void setName(String nameEmployee)
        {
            name=nameEmployee;
        }
        public String getName()
        {
            return name;
        }
        /*
        Inner-class dapat mengakses atribut private dari outer-class-nya
        */
        public String getCompanyName()
        {
            // contoh hak akses spesial dari inner-class Employee
            return Company.this.name;
        }
        public String getCountryOfCompany()
        {
            // Mengakses super dari outer-class
            return Company.super.getCountry();
        }
    }
}
