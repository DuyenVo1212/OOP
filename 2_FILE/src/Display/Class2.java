package Display;

public class Class2 {
    private String name;
    private char gender;
    public void Student(){
        name = "Unknown";
		gender = 'u';
    }
    public void Student(String name){
        this.name = name;
        this.gender = 'u';
    }
    public void Student(char gender){
        this.gender = gender;
        this.name = "Unknown";
    }
    public void Student(String name, char gender){
        this.name = name;
        this.gender = gender;
    }
    public void display(){
        System.out.println("Name: "+name);
        if(gender == 'm'){
            System.out.println("Gender: Male");
        }
        if(gender == 'f'){
            System.out.println("Gender: Female");
        }
        if(gender == 'u'){
            System.out.println("Gender: Unknown");
        }
    }
}
