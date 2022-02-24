package model;

public class Person implements Entity{

    String firstName;
    String lastName;

    public Person(String firstName,String lastName){
        this.firstName=firstName;
        this.lastName=lastName;
    }

    public String sayHello() {

        return "Haaj";
    }
}
