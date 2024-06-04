package PhoneBook;

import User.User;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class PhoneBook {
    private Map<User, List<String>> phoneBook;


    public PhoneBook(Map<User, List<String>> phoneBook) {
        this.phoneBook = phoneBook;
    }

    public  void addContact (Map<User, List<String>> phoneBook, User user){
        List<String> numbers = phoneBook.getOrDefault(user, new ArrayList<>());
        numbers.add(user.getPhoneNumber());
        phoneBook.put(user, numbers);
    }


    public static void printPhoneBook (Map<User, List<String>> phoneBook) {
        List<Map.Entry<User, List<String>>> list = new ArrayList<>(phoneBook.entrySet());
        list.sort((o1,o2) -> Integer.compare(o2.getValue().size(), o1.getValue().size()));

        for (Map.Entry<User, List<String>> entry : list) {
            System.out.println("Имя: " + entry.getKey().getName() + ", Телефоны: " + entry.getValue());
        }
    }
}
