package Tugas;

public class EncapDemo {
    private String name;
    private int age;

    public String getName(){
        return name;
    }

    public void setName(String newname){
        name = newname;
    }

    public int getAge(){
        return age;
    }

    public void setAge(int newAge){
        if (newAge < 18) {
            age = 18;
        } else if (newAge > 30) {
            age = 30;
        } else {
            age = newAge;
        }
    }
}