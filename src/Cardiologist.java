/**
 * Student Name : Zhiming Wei
 * ID:24832847
 * Video link: https://scuonline-my.sharepoint.com/:v:/g/personal/z_wei_16_student_scu_edu_au/EWTd5hmS_NtEsUynWQafPq0ByWyyXw65WJbOjg-_ZeHgUw
 * Github link:https://github.com/Ehoc-Walden/Zhiming-Wei-A1
 */

/**
 * Cardiologist subclass
 * Extends HealthProfessional and adds cardiologist-specific attributes
 * Shows differentiation in the inheritance hierarchy for different specialties
 */
public class Cardiologist extends HealthProfessional {
    // Cardiologist-specific attributes
    private String specializationArea;
    private boolean performsSurgeries;

    /**
     * Default constructor
     */
    public Cardiologist() {
        super();
        this.specializationArea = "General Cardiology";
        this.performsSurgeries = false;
    }

    /**
     * Parameterized constructor - initializes all variables
     * @param id Specialist ID
     * @param name Specialist name
     * @param department Department
     * @param specializationArea Area of specialization
     * @param performsSurgeries Whether the cardiologist performs surgeries
     */
    public Cardiologist(int id, String name, String department,
                        String specializationArea, boolean performsSurgeries) {
        super(id, name, department);
        this.specializationArea = specializationArea;
        this.performsSurgeries = performsSurgeries;
    }

    /**
     * Overrides the printDetails method - shows complete cardiologist information
     */
    @Override
    public void printDetails() {
        System.out.println("=== Cardiologist Details ===");
        super.printDetails();
        System.out.println("Specialization Area: " + specializationArea);
        System.out.println("Performs Surgeries: " + (performsSurgeries ? "Yes" : "No"));
        System.out.println("Professional Type: " + getProfessionalType());
        System.out.println("=============================");
    }

    /**
     * Overrides the getProfessionalType method
     * @return Professional type description
     */
    @Override
    public String getProfessionalType() {
        return "Cardiologist";
    }

    /**
     * Cardiologist-specific method to get specialization information
     * @return Formatted specialization information
     */
    public String getSpecializationInfo() {
        return "Specializes in: " + specializationArea +
                (performsSurgeries ? " with surgical expertise" : " (non-surgical)");
    }

    // Getter and Setter methods for cardiologist-specific fields

    /**
     * @return Area of specialization
     */
    public String getSpecializationArea() {
        return specializationArea;
    }

    /**
     * @param specializationArea Area of specialization to set
     */
    public void setSpecializationArea(String specializationArea) {
        this.specializationArea = specializationArea;
    }

    /**
     * @return Whether the cardiologist performs surgeries
     */
    public boolean isPerformsSurgeries() {
        return performsSurgeries;
    }

    /**
     * @param performsSurgeries Whether surgeries are performed
     */
    public void setPerformsSurgeries(boolean performsSurgeries) {
        this.performsSurgeries = performsSurgeries;
    }
}
