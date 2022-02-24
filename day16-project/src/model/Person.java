package model;

import java.util.Objects;

public class Person implements Entity{
    private final long id;
    private final String name;

    public Person(long id, String name){
        this.id= id;
        this.name= name;
    }

    public String getName() {
        return name;
    }

    public long getId() {
        return id;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Person)) return false;
        Person person = (Person) o;
        return name.equals(person.name);
    }

    @Override
    public int hashCode() {
        return (int)id*26;
    }

    @Override
    public String sayHello() {
        return name+" says Hello.";
    }

    @Override
    public String toString() {
        return "Person{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}
