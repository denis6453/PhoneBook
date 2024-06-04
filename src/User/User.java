package User;

import PhoneBook.PhoneBook;

import java.util.*;

public class User {
    private int id;
    private static int nextId = 1;
    private String name;


    public User(String name) {
        this.id = nextId();
        this.name = name;
    }

    public String getName() {
        return name;
    }


    private static int nextId () {
        return nextId++;
    }


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
