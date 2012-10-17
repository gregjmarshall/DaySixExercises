public class Patient {
private String name;
private int age;
private String illness;
private Patient nextPatient;
private Patient prevPatient;

    public Patient(String name, int age, String illness) {
    this.name = name;
    this.age = age;
    this.illness = illness;
    this.nextPatient = null;
    this.prevPatient = null;
    }
    
    public void addPatient(Patient newPatient) {
      
        if (this.nextPatient == null) {
            this.nextPatient = newPatient;
            newPatient.prevPatient = this;
        } else {
            this.nextPatient.addPatient(newPatient);
        }
    }
    public boolean deletePatient(Patient patient) {
    if (this.nextPatient == null) {
        return false;
    } else if (this.nextPatient.name.equals(patient.name)) {
        this.nextPatient = nextPatient.nextPatient;
        nextPatient.nextPatient.prevPatient = this;
        return true;
    } else {
        return this.nextPatient.deletePatient(patient);
    }
}
    public void readForw(Patient patient) {
        
            if (this.nextPatient == null) {
                System.out.println("End of list.");
            }
            else { System.out.println(this.nextPatient.name);
                 this.nextPatient.readForw(patient);
        }
        
    }
    public void readBack(Patient patient) {
        if (this.nextPatient == null) {
            System.out.println(this.name);
            if (this.prevPatient == null) {
                System.out.println("Beginning of list.");
            }
        }
            else { this.prevPatient.readBack(patient);
          
            }
    }
    public static void main (String[] args) {
        Patient patientListStart = null;
        Patient patient0 = new Patient("Patient 0", 49, "flu");
        patientListStart = patient0;
        Patient patient1 = new Patient("Patient 1", 49, "flu");
        patientListStart.addPatient(patient1);
        Patient patient2 = new Patient("Patient 2", 25, "Broken leg");
        System.out.println("Adding patient2");
        patientListStart.addPatient(patient2);
        Patient patient3 = new Patient("Patient 3", 28, "Hamstring");
        System.out.println("Adding patient3");
        patientListStart.addPatient(patient3);
        Patient patient4 = new Patient("Patient 4", 25, "Gout");
        System.out.println("Adding patient4");
        patientListStart.addPatient(patient4);
        Patient patient5 = new Patient("Patient 5", 29, "Broken Arm");
        System.out.println("Adding patient5");
        patientListStart.addPatient(patient5);
        Patient patient6 = new Patient("Patient 6", 25, "Broken leg");
        System.out.println("Adding patient6");
        patientListStart.addPatient(patient6);
        Patient patient7 = new Patient("Patient 7", 14, "Toothache");
        System.out.println("Adding patient7");
        patientListStart.addPatient(patient7);
        Patient patient8 = new Patient("Patient 8", 20, "Stress");
        System.out.println("Adding patient8");
        patientListStart.addPatient(patient8);
        patientListStart.readForw(patientListStart);
        patientListStart.readBack(patientListStart);
        patientListStart.deletePatient(patient6);
        patientListStart.deletePatient(patient5);
        patientListStart.readForw(patientListStart);
        patientListStart.readBack(patientListStart);
        Patient patientx = new Patient("Patient x", 90, "Stomach upset");
        patientListStart.addPatient(patientx);
        Patient delPatient = new Patient("delPatient,", 90, "Toothache");
        patientListStart.deletePatient(delPatient);
        patientListStart.readForw(patientListStart);
        patientListStart.readBack(patientListStart);
    }
}