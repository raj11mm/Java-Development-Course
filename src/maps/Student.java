package maps;

class Student {
    int roll;
    String name;

    Student(int roll, String name) {
        this.roll =roll;
        this.name = name;
    }


    public String toString() {
        return roll + " " + name;
    }

}
