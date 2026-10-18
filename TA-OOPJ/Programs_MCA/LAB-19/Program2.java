// Hospital Management System: Departments demonstrating Dynamic Method Dispatch.[B]

class DeptService {
    public void handlePatient() {
        System.out.println("General medical consultation.");
    }
}

class Cardiology extends DeptService {
    @Override
    public void handlePatient() {
        System.out.println("Cardiology Department: Performing ECG and cardiac examination.");
    }
}

class Neurology extends DeptService {
    @Override
    public void handlePatient() {
        System.out.println("Neurology Department: Performing brain MRI review and reflex tests.");
    }
}

class Pediatrics extends DeptService {
    @Override
    public void handlePatient() {
        System.out.println("Pediatrics Department: Performing child health and vaccination checkup.");
    }
}

public class Program2 {
    public static void main(String[] args) {
        DeptService service;

        service = new Cardiology();
        service.handlePatient();

        service = new Neurology();
        service.handlePatient();

        service = new Pediatrics();
        service.handlePatient();
    }
}
