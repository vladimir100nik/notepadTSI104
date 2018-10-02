package notepad;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    static Scanner scanner = new Scanner(System.in);
    static List<Person> personList = new ArrayList<>();

    public static void main(String[] args) {
        while (true) {
            System.out.println("Enter command ('help' for help):");
            String cmd = scanner.next();
            switch (cmd) {
                case "create":
                    create();
                    break;
                case "list":
                    printList();
                    break;
                case "remove":
                    removeById();
                    break;
                case "help":
                    showHelp();
                    break;
                case "exit":
                    return;
                default:
                    System.out.println("It isn't a command");
            }
        }
    }

    private static void showHelp() {
        System.out.println("create - bla bla bla bla");
        System.out.println("remove - bla bla bla bla");
        System.out.println("bla bla bla bla");
        System.out.println("bla bla bla bla");
    }

    private static void removeById() {
        System.out.println("Enter ID to remove:");
        int id = scanner.nextInt();
        for (int i = 0; i < personList.size(); i++) {
            Person p = personList.get(i);
            if (id == p.getId()) {
                personList.remove(i);
                break;
            }
        }
    }

//    private static void removeById() {
//        System.out.println("Enter ID to remove:");
//        int id = scanner.nextInt();
//        for (Person p : personList) {
//            if (id == p.getId()) {
//                personList.remove(p); // not very optimal
//                break;
//            }
//        }
//    }

    private static void printList() {
        for (Person p : personList) {
            System.out.println(p);
        }
    }

    private static void create() {
        System.out.println("Enter name:");
        String name = askString();

        System.out.println("Enter surname:");
        String surname = askString();

        System.out.println("Enter phone:");
        String phone = askString();

        System.out.println("Enter email:");
        String email = askString();

        Person p = new Person();
        p.setName(name);
        p.setSurname(surname);
        p.setPhone(phone);
        p.setEmail(email);

        personList.add(p);

        System.out.println(p);
    }

    private static String askString() {
        var result = new ArrayList<String>();
        var word = scanner.next();
        if (word.startsWith("\"")) {

            do {
                result.add(word);
                if (word.endsWith("\"")) {
                    return String.join(" ", result);
                }
            } while(true);

        } else {
            return word;
        }

    }
}
