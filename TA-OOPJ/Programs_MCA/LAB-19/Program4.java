// Library Management System: Membership types demonstrating Dynamic Method Dispatch.[C]

class LibraryMembership {
    public void printPrivileges() {
        System.out.println("Basic guest reading privileges.");
    }
}

class StudentMembership extends LibraryMembership {
    @Override
    public void printPrivileges() {
        System.out.println("Student Membership: Can borrow up to 3 books for 14 days. Free access.");
    }
}

class FacultyMembership extends LibraryMembership {
    @Override
    public void printPrivileges() {
        System.out.println("Faculty Membership: Can borrow up to 10 books and journals for semester.");
    }
}

class PremiumMembership extends LibraryMembership {
    @Override
    public void printPrivileges() {
        System.out.println("Premium Member: Unlimited access, digital library and conference room access.");
    }
}

public class Program4 {
    public static void main(String[] args) {
        LibraryMembership mem;

        mem = new StudentMembership();
        mem.printPrivileges();

        mem = new FacultyMembership();
        mem.printPrivileges();

        mem = new PremiumMembership();
        mem.printPrivileges();
    }
}
