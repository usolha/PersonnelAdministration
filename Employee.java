public class Employee {
    private final String bithdate;
    private String name;
    private String surname;
    private String birthdate;
    private String male;
    public String age;
    public String weight;
    private String department;
    public String profit;
    public String yearsService;
    private String particularities;
    private String getMale;

    public Employee(String n, String s, String b, String m, String a, String w, String d, String p, String y, String part) {
        this.name = n;
        this.surname = s;
        this.bithdate = b;
        this.male = m;
        this.age = a;
        this.weight = w;
        this.department = d;
        this.profit = p;
        this.yearsService = y;
        this.particularities = part;
    }

    public String getName() {
        return this.name;
    }

    public String getSurname() {
        return this.surname;
    }

    public String getBirthdate() {
        return this.bithdate;
    }

    public String getMale() {
        return this.getMale;
    }

    public String getAge() {
        return this.age;
    }

    public String GetWeight() {
        return this.weight;
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
