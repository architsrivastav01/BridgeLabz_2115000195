abstract class Patient {
    private int patientId;
    private String name;
    private int age;

    public Patient(int patientId, String name, int age) {
        this.patientId = patientId;
        this.name = name;
        this.age = age;
    }

    public int getPatientId() {
        return patientId;
    }

    public void setPatientId(int patientId) {
        if (patientId > 0) {
            this.patientId = patientId;
        } else {
            throw new IllegalArgumentException("Patient ID must be positive.");
        }
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (name != null && !name.trim().isEmpty()) {
            this.name = name;
        } else {
            throw new IllegalArgumentException("Name cannot be null or empty.");
        }
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age > 0) {
            this.age = age;
        } else {
            throw new IllegalArgumentException("Age must be positive.");
        }
    }

    public abstract double calculateBill();

    public void getPatientDetails() {
        System.out.println("Patient ID: " + patientId);
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }
}

interface MedicalRecord {
    void addRecord(String record);
    void viewRecords();
}

class InPatient extends Patient implements MedicalRecord {
    private double roomCharges;
    private double treatmentCost;
    private String diagnosis;

    public InPatient(int patientId, String name, int age, double roomCharges, double treatmentCost, String diagnosis) {
        super(patientId, name, age);
        this.roomCharges = roomCharges;
        this.treatmentCost = treatmentCost;
        this.diagnosis = diagnosis;
    }

    @Override
    public double calculateBill() {
        return roomCharges + treatmentCost;
    }

    @Override
    public void addRecord(String record) {
        if (record != null && !record.trim().isEmpty()) {
            this.diagnosis = record;
        } else {
            throw new IllegalArgumentException("Record cannot be null or empty.");
        }
    }

    @Override
    public void viewRecords() {
        System.out.println("Diagnosis: " + diagnosis);
    }
}

class OutPatient extends Patient implements MedicalRecord {
    private double consultationFee;
    private String medicalHistory;

    public OutPatient(int patientId, String name, int age, double consultationFee, String medicalHistory) {
        super(patientId, name, age);
        this.consultationFee = consultationFee;
        this.medicalHistory = medicalHistory;
    }

    @Override
    public double calculateBill() {
        return consultationFee;
    }

    @Override
    public void addRecord(String record) {
        if (record != null && !record.trim().isEmpty()) {
            this.medicalHistory = record;
        } else {
            throw new IllegalArgumentException("Record cannot be null or empty.");
        }
    }

    @Override
    public void viewRecords() {
        System.out.println("Medical History: " + medicalHistory);
    }
}

public class HospitalManagementSystem {
    public static void main(String[] args) {
        InPatient inPatient = new InPatient(1, "John Doe", 45, 3000, 15000, "Fracture");
        OutPatient outPatient = new OutPatient(2, "Jane Smith", 30, 500, "Regular Checkup");

        System.out.println("In-Patient Details:");
        inPatient.getPatientDetails();
        inPatient.viewRecords();
        System.out.println("Bill: " + inPatient.calculateBill());
        System.out.println("---------------------------");

        System.out.println("Out-Patient Details:");
        outPatient.getPatientDetails();
        outPatient.viewRecords();
        System.out.println("Bill: " + outPatient.calculateBill());
    }
}

