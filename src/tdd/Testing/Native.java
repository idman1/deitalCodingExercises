package tdd.Testing;

public class Native {
    private String name;
    private int age;
    private String chorhot;

    public Native(String name, int age, String chorhot) {

        this.name = name;
        this.age = age;
        this.chorhot = chorhot;
    }

    public void setName(String name) {
    this.name = name;
    }

    public String getName() {
    return name;
    }

    public void setAge(int age){
        this.age = age;
    }
    public int getAge(){
    return age;
    }

    public void setChorhot(String chorhot) {
    this.chorhot = chorhot;
    }
    public String getChorhot() {
    return chorhot;
    }
}











