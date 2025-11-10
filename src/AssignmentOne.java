/**
 * Student Name : Zhiming Wei
 * ID:24832847
 * Video link:  1.OneDrive： https://scuonline-my.sharepoint.com/:v:/g/personal/z_wei_16_student_scu_edu_au/EWTd5hmS_NtEsUynWQafPq0ByWyyXw65WJbOjg-_ZeHgUw
 *              2.Tencent Meeting： https://meeting.tencent.com/cw/Km6a8D3J52
 * Github link: https://github.com/Ehoc-Walden/Zhiming-Wei-A1
 */

import java.util.ArrayList;

/**
 * Main program class - demonstrates complete functionality of Health Service Appointment System
 * Contains implementations for Part 3 and Part 5
 * Shows object-oriented programming concepts: inheritance, polymorphism, encapsulation
 */
public class AssignmentOne {

    // Using ArrayList to store appointment collection - meets Part 5 requirements
    private static ArrayList<Appointment> appointments = new ArrayList<>();

    /**
     * Main method - program entry point
     * Demonstrates all functional parts: class and object usage, appointment collection management
     * @param args Command line arguments (not used)
     */
    public static void main(String[] args) {

        System.out.println("🚀 Starting Health Service Appointment System");
        System.out.println("==============================================\n");

        // Part 3 -- Using Classes and Objects
        demonstrateClassesAndObjects();

        System.out.println("----------------------------------------");

        // Part 5 -- Appointment Collection
        demonstrateAppointmentCollection();

        System.out.println("----------------------------------------");

        System.out.println("✅ Health Service Appointment System Demo Completed");
    }

    /**
     * Part 3 Demonstration - Using Classes and Objects
     * Creates health professional objects and displays their details
     */
    private static void demonstrateClassesAndObjects() {
        System.out.println("// Part 3 -- We handle classes and objects\n");

        // Create three General Practitioner objects
        System.out.println("📋 Creating General Practitioner Objects:");
        GeneralPractitioner gp1 = new GeneralPractitioner(101, "Dr. Alice Smith", "General Practice", 25, true);
        GeneralPractitioner gp2 = new GeneralPractitioner(102, "Dr. Bob Johnson", "Family Medicine", 30, false);
        GeneralPractitioner gp3 = new GeneralPractitioner(103, "Dr. Carol Williams", "Primary Care", 20, true);

        // Create two other types of health professional objects (Cardiologists)
        System.out.println("📋 Creating Cardiologist Objects:");
        Cardiologist card1 = new Cardiologist(201, "Dr. David Brown", "Cardiology", "Interventional Cardiology", true);
        Cardiologist card2 = new Cardiologist(202, "Dr. Eva Davis", "Cardiology", "Electrophysiology", false);

        // Print details of all health professionals
        System.out.println("\n👨‍⚕️ Printing Health Professional Details:");
        System.out.println("======================================");

        gp1.printDetails();
        gp2.printDetails();
        gp3.printDetails();
        card1.printDetails();
        card2.printDetails();
    }

    /**
     * Part 5 Demonstration - Appointment Collection Management
     * Complete workflow of creating, printing, and canceling appointments
     */
    private static void demonstrateAppointmentCollection() {
        System.out.println("// Part 5 -- Appointment Collection\n");

        // Create health professionals for appointments
        GeneralPractitioner gp = new GeneralPractitioner(101, "Dr. Alice Smith", "General Practice", 25, true);
        Cardiologist cardiologist = new Cardiologist(201, "Dr. David Brown", "Cardiology", "Interventional Cardiology", true);

        // Create appointments
        System.out.println("📅 Creating Appointments:");
        System.out.println("=========================");

        // Create 2 appointments with General Practitioner
        createAppointment("John Doe", "0412345678", "09:00", gp);
        createAppointment("Jane Smith", "0498765432", "10:30", gp);

        // Create 2 appointments with Cardiologist
        createAppointment("Mike Wilson", "0411222333", "14:00", cardiologist);
        createAppointment("Sarah Brown", "0444555666", "15:30", cardiologist);

        // Print existing appointments
        System.out.println("\n📋 Printing Existing Appointments:");
        System.out.println("=================================");
        printExistingAppointments();

        // Cancel an appointment
        System.out.println("❌ Cancelling an Appointment:");
        System.out.println("============================");
        cancelBooking("0498765432");

        // Print appointments again to show updated collection
        System.out.println("\n📋 Updated Appointment List:");
        System.out.println("===========================");
        printExistingAppointments();
    }

    /**
     * Creates a new appointment and adds it to the ArrayList
     * Uses polymorphism to handle different types of health professionals
     * @param patientName Patient name
     * @param mobile Patient mobile number
     * @param timeSlot Appointment time slot
     * @param doctor Selected doctor (can be any HealthProfessional subclass)
     */
    public static void createAppointment(String patientName, String mobile,
                                         String timeSlot, HealthProfessional doctor) {
        // Create new appointment object
        Appointment newAppointment = new Appointment(patientName, mobile, timeSlot, doctor);

        // Validate appointment information is complete
        if (newAppointment.isValidAppointment()) {
            appointments.add(newAppointment);
            System.out.println("✅ Appointment created successfully:");
            System.out.println("   Patient: " + patientName);
            System.out.println("   Time: " + timeSlot);
            System.out.println("   Doctor: " + doctor.getName() + " (" + doctor.getProfessionalType() + ")");
        } else {
            System.out.println("❌ Failed to create appointment: Missing required information");
        }
    }

    /**
     * Prints all existing appointments in the ArrayList
     * Shows appropriate message if no appointments exist
     */
    public static void printExistingAppointments() {
        if (appointments.isEmpty()) {
            System.out.println("ℹ️ No existing appointments found.");
        } else {
            System.out.println("Found " + appointments.size() + " appointment(s):");
            System.out.println("================================================");
            for (int i = 0; i < appointments.size(); i++) {
                System.out.println("Appointment #" + (i + 1) + ":");
                appointments.get(i).printAppointmentDetails();
            }
        }
    }

    /**
     * Cancels an appointment using patient's mobile number
     * Demonstrates collection removal operations
     * @param mobile Patient mobile number
     */
    public static void cancelBooking(String mobile) {
        boolean found = false;

        // Iterate through appointments to find the one with matching mobile
        for (int i = 0; i < appointments.size(); i++) {
            Appointment appointment = appointments.get(i);
            if (appointment.getPatientMobile().equals(mobile)) {
                System.out.println("✅ Cancelling appointment for mobile: " + mobile);
                System.out.println("   Patient: " + appointment.getPatientName());
                System.out.println("   Time: " + appointment.getPreferredTimeSlot());
                appointments.remove(i);
                found = true;
                break; // Exit loop after finding and removing
            }
        }

        if (!found) {
            System.out.println("❌ Error: No appointment found with mobile: " + mobile);
        }
    }

    /**
     * Gets the current number of appointments
     * @return Number of appointments in the collection
     */
    public static int getAppointmentCount() {
        return appointments.size();
    }

    /**
     * Clears all appointments (for testing purposes)
     */
    public static void clearAllAppointments() {
        appointments.clear();
        System.out.println("All appointments have been cleared.");
    }
}
