package PhoneBook;

import User.User;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class PhoneBook {
    private HashMap<User, List<Long>> phoneBook;


    public PhoneBook(HashMap<User, List<Long>> phoneBook) {
        this.phoneBook = phoneBook;
    }

    public  void addContact (HashMap<User, List<Long>> phoneBook, User user, Long phoneNumber){
        List<Long> numbers = phoneBook.getOrDefault(user, new ArrayList<>());
        numbers.add(phoneNumber);
        phoneBook.put(user, numbers);
    }


    public static void printPhoneBook (HashMap<User, List<Long>> phoneBook) {
        List<Map.Entry<User, List<Long>>> list = new ArrayList<>(phoneBook.entrySet());
        list.sort((o1,o2) -> Integer.compare(o2.getValue().size(), o1.getValue().size()));

        for (Map.Entry<User, List<Long>> entry : list) {
            System.out.println("Имя: " + entry.getKey().getName() + ", Телефоны: " + entry.getValue());
        }
    }
}
