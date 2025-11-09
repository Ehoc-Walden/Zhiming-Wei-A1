/**
 * General Practitioner subclass
 * Extends HealthProfessional and adds GP-specific attributes
 * Demonstrates inheritance and method overriding concepts
 */
public class GeneralPractitioner extends HealthProfessional {
    // GP-specific attributes - distinguishes from other health professionals
    private int maxPatientsPerDay;
    private boolean providesHomeVisits;

    /**
     * Default constructor
     * Calls parent default constructor and initializes GP-specific fields
     */
    public GeneralPractitioner() {
        super(); // Call parent default constructor
        this.maxPatientsPerDay = 20;
        this.providesHomeVisits = false;
    }

    /**
     * Parameterized constructor - initializes all variables (including inherited ones)
     * @param id Doctor ID
     * @param name Doctor name
     * @param department Department
     * @param maxPatientsPerDay Maximum number of patients per day
     * @param providesHomeVisits Whether the GP provides home visits
     */
    public GeneralPractitioner(int id, String name, String department,
                               int maxPatientsPerDay, boolean providesHomeVisits) {
        super(id, name, department); // Call parent parameterized constructor
        this.maxPatientsPerDay = maxPatientsPerDay;
        this.providesHomeVisits = providesHomeVisits;
    }

    /**
     * Overrides the printDetails method - shows complete GP information
     * Demonstrates polymorphism and method overriding
     */
    @Override
    public void printDetails() {
        System.out.println("=== General Practitioner Details ===");
        super.printDetails(); // Call parent print method
        System.out.println("Maximum Patients Per Day: " + maxPatientsPerDay);
        System.out.println("Provides Home Visits: " + (providesHomeVisits ? "Yes" : "No"));
        System.out.println("Professional Type: " + getProfessionalType());
        System.out.println("=====================================");
    }

    /**
     * Overrides the getProfessionalType method
     * @return Professional type description
     */
    @Override
    public String getProfessionalType() {
        return "General Practitioner";
    }

    /**
     * GP-specific method to check if new patients can be accepted
     * @param currentPatients Current number of patients scheduled
     * @return True if new patients can be accepted, false otherwise
     */
    public boolean canAcceptNewPatient(int currentPatients) {
        return currentPatients < maxPatientsPerDay;
    }

    // Getter and Setter methods for GP-specific fields

    /**
     * @return Maximum number of patients per day
     */
    public int getMaxPatientsPerDay() {
        return maxPatientsPerDay;
    }

    /**
     * @param maxPatientsPerDay Maximum patients per day to set
     */
    public void setMaxPatientsPerDay(int maxPatientsPerDay) {
        this.maxPatientsPerDay = maxPatientsPerDay;
    }

    /**
     * @return Whether the GP provides home visits
     */
    public boolean isProvidesHomeVisits() {
        return providesHomeVisits;
    }

    /**
     * @param providesHomeVisits Whether home visits are provided
     */
    public void setProvidesHomeVisits(boolean providesHomeVisits) {
        this.providesHomeVisits = providesHomeVisits;
    }
}