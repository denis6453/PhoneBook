package User;

import PhoneBook.PhoneBook;

import java.util.*;

public class User {
    private int id;
    private static int nextId = 1;
    private String name;
    private String phoneNumber;


    public User(String name, String phoneNumber) {
        this.id = nextId();
        this.name = name;
        this.phoneNumber = phoneNumber;
    }

    public String getName() {
        return name;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }





    private static int nextId () {
        return nextId++;
    }

//    @Override
//    public String toString() {
//        return "User{" +
//                "id=" + id +
//                ", name='" + name + '\'' +
//                ", phones = " + phoneBook.getPhoneBookByUser(this) +
//                '}';
//    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        User user = (User) o;
        return Objects.equals(name, user.name);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(name);
    }
}
