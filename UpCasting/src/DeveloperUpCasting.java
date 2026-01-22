class Developer {
    void work() {
        System.out.println("Developer Working");
    }
    void project() {
        System.out.println("Developer doing project");
    }
}

class JavaDeveloper extends Developer {
    void work() {
        System.out.println("Java Developer is working");
    }

    void project() {
        System.out.println("Java developer doing project");
    }
}

class PythonDeveloper extends Developer {
    void work() {
        System.out.println("Python Developer is working");
    }
    void project() {
        System.out.println("Python developer is doing project");
    }
}

public class DeveloperUpCasting {
    public static void main(String[] args) {
        Developer dev = new JavaDeveloper();
        dev.work();
        dev.project();

        dev = new PythonDeveloper();
        dev.work();
        dev.project();
    }
}

