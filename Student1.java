package labsession7;

public class Student1 implements Comparable<Student1>{
    public int id;
    public String name;
    public int age;
    public String address;
    public double gpa;

    public static int sortBy =0;

    @Override
    public int compareTo(Student1 o) {
        if(Student1.sortBy == 0){
            if(this.getGpa() < o.getGpa()){
                return -1;
            }
            return 0;
        }else{
            return this.getName().compareTo(o.getName());
        }

    }

    public Student1() {
    }

    public Student1(int id, String name, int age, String address, double gpa) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.address = address;
        this.gpa = gpa;
    }



    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public double getGpa() {
        return gpa;
    }

    public void setGpa(double gpa) {
        this.gpa = gpa;
    }
}