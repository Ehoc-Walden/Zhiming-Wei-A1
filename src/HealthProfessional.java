/**
 * Student Name : Zhiming Wei
 * ID:24832847
 * Video link:  1.OneDrive： https://scuonline-my.sharepoint.com/:v:/g/personal/z_wei_16_student_scu_edu_au/EWTd5hmS_NtEsUynWQafPq0ByWyyXw65WJbOjg-_ZeHgUw
 *              2.Tencent Meeting： https://meeting.tencent.com/cw/Km6a8D3J52
 * Github link: https://github.com/Ehoc-Walden/Zhiming-Wei-A1
 */

/**
 * Base class for all health professionals
 * Represents common attributes and behaviors of all healthcare workers
 * Demonstrates encapsulation principles with private fields and public methods
 */
public class HealthProfessional {
    // Instance variables - using private for encapsulation
    private int id;
    private String name;
    private String department;

    /**
     * Default constructor
     * Initializes with default values
     */
    public HealthProfessional() {
        this.id = 0;
        this.name = "Unknown";
        this.department = "General";
    }

    /**
     * Parameterized constructor - initializes all instance variables
     * @param id Health professional ID (numeric only)
     * @param name Health professional name
     * @param department Department where the professional works
     */
    public HealthProfessional(int id, String name, String department) {
        this.id = id;
        this.name = name;
        this.department = department;
    }

    /**
     * Prints all instance variable information
     * Displays basic information about the health professional
     */
    public void printDetails() {
        System.out.println("Health Professional Details:");
        System.out.println("ID: " + id);
        System.out.println("Name: " + name);
        System.out.println("Department: " + department);
    }

    /**
     * Gets the type of health professional
     * This method will be overridden in subclasses to demonstrate polymorphism
     * @return Description of the professional type
     */
    public String getProfessionalType() {
        return "General Health Professional";
    }

    // Getter and Setter methods - provide controlled access to private fields

    /**
     * @return The health professional's ID
     */
    public int getId() {
        return id;
    }

    /**
     * @param id The health professional's ID to set
     */
    public void setId(int id) {
        this.id = id;
    }

    /**
     * @return The health professional's name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name The health professional's name to set
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * @return The department where the professional works
     */
    public String getDepartment() {
        return department;
    }

    /**
     * @param department The department to set
     */
    public void setDepartment(String department) {
        this.department = department;
    }
}
