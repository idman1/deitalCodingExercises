package chapterThree.examples;

public class AccountExample {
    private String name = "your name";
    public AccountExample(String name){
        this.name = name;
    }

    public void setName(String name){
        this.name = name;
    }
    public String getName(){
        return name;
    }

}
