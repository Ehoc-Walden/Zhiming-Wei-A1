/**
 * Student Name : Zhiming Wei
 * ID:24832847
 * Video link: https://scuonline-my.sharepoint.com/:v:/g/personal/z_wei_16_student_scu_edu_au/EWTd5hmS_NtEsUynWQafPq0ByWyyXw65WJbOjg-_ZeHgUw
 * Github link:
 */

/**
 * Appointment class
 * Manages patient appointment information including patient details, time slot, and selected doctor
 * Demonstrates composition relationship - contains HealthProfessional object
 */
public class Appointment {
    // Patient details
    private String patientName;
    private String patientMobile;

    // Preferred time slot (format: HH:mm)
    private String preferredTimeSlot;

    // Selected doctor - uses base class type for polymorphism
    private HealthProfessional selectedDoctor;

    /**
     * Default constructor
     */
    public Appointment() {
        this.patientName = "Unknown";
        this.patientMobile = "Unknown";
        this.preferredTimeSlot = "09:00";
        this.selectedDoctor = null;
    }

    /**
     * Parameterized constructor - initializes all instance variables
     * @param patientName Patient name
     * @param patientMobile Patient mobile number
     * @param preferredTimeSlot Preferred time slot for appointment
     * @param selectedDoctor Selected health professional
     */
    public Appointment(String patientName, String patientMobile,
                       String preferredTimeSlot, HealthProfessional selectedDoctor) {
        this.patientName = patientName;
        this.patientMobile = patientMobile;
        this.preferredTimeSlot = preferredTimeSlot;
        this.selectedDoctor = selectedDoctor;
    }

    /**
     * Prints all instance variable information
     * Displays complete appointment details
     */
    public void printAppointmentDetails() {
        System.out.println("=== Appointment Details ===");
        System.out.println("Patient Name: " + patientName);
        System.out.println("Patient Mobile: " + patientMobile);
        System.out.println("Preferred Time Slot: " + preferredTimeSlot);
        if (selectedDoctor != null) {
            System.out.println("Assigned Doctor: " + selectedDoctor.getName());
            System.out.println("Doctor Type: " + selectedDoctor.getProfessionalType());
        } else {
            System.out.println("No doctor assigned");
        }
        System.out.println("===========================");
    }

    /**
     * Validates if appointment information is complete
     * @return True if appointment information is valid, false otherwise
     */
    public boolean isValidAppointment() {
        return patientName != null && !patientName.isEmpty() &&
                patientMobile != null && !patientMobile.isEmpty() &&
                preferredTimeSlot != null && !preferredTimeSlot.isEmpty() &&
                selectedDoctor != null;
    }

    // Getter and Setter methods

    /**
     * @return Patient name
     */
    public String getPatientName() {
        return patientName;
    }

    /**
     * @param patientName Patient name to set
     */
    public void setPatientName(String patientName) {
        this.patientName = patientName;
    }

    /**
     * @return Patient mobile number
     */
    public String getPatientMobile() {
        return patientMobile;
    }

    /**
     * @param patientMobile Patient mobile number to set
     */
    public void setPatientMobile(String patientMobile) {
        this.patientMobile = patientMobile;
    }

    /**
     * @return Preferred time slot
     */
    public String getPreferredTimeSlot() {
        return preferredTimeSlot;
    }

    /**
     * @param preferredTimeSlot Preferred time slot to set
     */
    public void setPreferredTimeSlot(String preferredTimeSlot) {
        this.preferredTimeSlot = preferredTimeSlot;
    }

    /**
     * @return Selected health professional
     */
    public HealthProfessional getSelectedDoctor() {
        return selectedDoctor;
    }

    /**
     * @param selectedDoctor Health professional to set
     */
    public void setSelectedDoctor(HealthProfessional selectedDoctor) {
        this.selectedDoctor = selectedDoctor;
    }
}