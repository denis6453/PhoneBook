import User.User;

import PhoneBook.PhoneBook;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import PhoneBook.PhoneBook;

/*
 * Aidar - 111, 222, 000
 * Alena - 777
 * Oleg - 2222, 87987, 54546, 548, 6549
 *
 * -> 1 класс User {name, List<Integer>}, 2 class Phonebook { Map }
 *
 * -> User - переопредилить 2 метода Object : equals и hashcode
 *
 * Phonebook -> addPhone(long), removePhone(long), printAll() ->
 *
 * Oleg - 2222, 87987, 54546, 548, 6549
 * Aidar - 111, 222, 000
 * Alena - 777
 *
 *===
 * Comparator -> примеры кода с компаратором (google)
 * *//**
 * program
 */

public class Main {
    static public void main (String[] args) {
        Map<User, List<String>> map = new HashMap<>();

        PhoneBook phoneBook = new PhoneBook(map);

        phoneBook.addContact(map, new User("Иван", "1234567890"));
        phoneBook.addContact(map, new User("Мария", "9876543210"));
        phoneBook.addContact(map, new User("Иван", "5555555555"));

        // Вывод телефонной книги
        PhoneBook.printPhoneBook(map);

    }
}