import User.User;
import PhoneBook.PhoneBook;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Main {
    static public void main (String[] args) {
        HashMap<User, List<Long>> map = new HashMap<>();

        PhoneBook phoneBook = new PhoneBook(map);

        phoneBook.addContact(map, new User("Иван"), 1234567890L);
        phoneBook.addContact(map, new User("Мария"), 9876543210L);
        phoneBook.addContact(map, new User("Иван"), 5555555555L);

        phoneBook.addContact(map, new User("Денис"), 1234567890L);
        phoneBook.addContact(map, new User("Денис"), 9876543210L);
        phoneBook.addContact(map, new User("Денис"), 5555555555L);
        phoneBook.addContact(map, new User("Денис"), 4365474576L);


        //Удаление телефонов только через получение соответствия User - телефон
        ArrayList<User> searchUsers = phoneBook.searchUserByPhone(map, 4365474576L);
        System.out.println(searchUsers);
        for (User entry : searchUsers) {
            phoneBook.removePhone(map, entry,4365474576L);
        }


        PhoneBook.printPhoneBook(map);

    }
}