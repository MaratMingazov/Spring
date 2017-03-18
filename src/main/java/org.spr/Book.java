package org.spr;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

import java.util.List;


public class Person {



    @Id
    private  String id;
    private String name;
    private String email;
    private int age;
    private List<Person> friends;


    public List<Person> getFriends() {
        return friends;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setFriends(List<Person> friend) {
        this.friends = friend;
    }


    public  String getId() {
        return id;
    }

    public final String getName() {
        return name;
    }

    public final void setName(final String pName) {
        this.name = pName;
    }

    public final String getEmail() {
        return email;
    }

    public final void setEmail(final String pEmail) {
        this.email = pEmail;
    }

    public final int getAge() {
        return age;
    }

    public final void setAge(final int pAge) {
        this.age = pAge;
    }

    public String toString() {
        return id+"/"+name;
    }

}
