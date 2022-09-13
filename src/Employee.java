public class Employee {
    private String name;
    private String forename;
    private String birthdate;
    private char gender;
    private int age;
    private double weight;
    private String department;
    private double salary;
    private int yearsOfService;
    private String particularities;


    public Employee(String name, String forename, String birthday) {
        yearsOfService = 0;
        this.salary = 1500;
        this.department = "A38";
        this.name = name;
        this.forename = forename;
        this.birthdate = birthdate;
        this.yearsOfService = 0;
        this.salary = 1500;
    }

    public String getName() {
        return name;
    }

    public double getWeight() {
        return weight;
    }

    public java.lang.String getDepartment() {
        return department;
    }

    public double getSalary() {
        return salary;
    }

    public int getYearsOfService() {
        return yearsOfService;
    }

    public java.lang.String getParticularities() {
        return particularities;
    }

    public java.lang.String getBirthday() {
        return birthdate;
    }

    public String getForename() {
        return forename;
    }

    private String getBirthdate() {
        return birthdate;
    }

    private char getGender() {
        return gender;
    }

    public int getAge() {
        return this.age;
    }

    private double GetWeight() {
        return weight;
    }

    private String GetDepartment() {
        return "A38";
    }

    public String GetProfit() {
        return "1500€+";
    }

    public String GetYearsService() {
        return "0";
    }

    private String GetParticularities() {
        return "this particularities";
    }
}

