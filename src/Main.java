import User.User;
import PhoneBook.PhoneBook;
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


        PhoneBook.printPhoneBook(map);

    }
}