public class Main {
    
    public static void main(String[] args) {
        
        var company = new Company();
        company.setName("PT Bersama");

        var employe = company.new Employee();
        employe.setName("Eko Muliyo");

        System.out.println(employe.getName());
        System.out.println(employe.getCompany());
    }
}

class Company {

    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    class Employee {

        private String name;

        public String getCompany() {
            return Company.this.name;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }
    }
    
}
