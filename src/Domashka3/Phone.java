package Domashka3;

import java.util.Scanner;

public class Phone implements PhoneInterface {
    private String brand;
    private String name;
    private String password;
    private Contact[] contacts;
    Scanner sc = new Scanner(System.in);

    public Phone(String brand, String name, String password, Contact[] contacts) {
        this.brand = brand;
        this.name = name;
        this.password = password;
        this.contacts = contacts;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Contact[] getContacts() {
        return contacts;
    }

    public void setContacts(Contact[] contacts) {
        this.contacts = contacts;
    }

    @Override
    public void turnOn() {
        System.out.print("VVedite parol: ");
        String p = sc.nextLine();
        if (p == password) {
            System.out.println("Telefon jandy");
        } else {
            System.out.println("Password ne pravilnyi");

        }
    }

    @Override
    public int call() {
        System.out.print("Vvedite nomer telefona: ");
        int number = sc.nextInt();
        for (int i = 0; i < contacts.length; i++) {

            if (number == contacts[i].getPhoneNumber()) {
                System.out.println(contacts[i].getPhoneNumber() + " Chalyp jatasyz");
            } else {
                System.out.println("null");

            }
        }

        return number;
    }

    @Override
    public String coll() {
        System.out.println("Vvedite name: ");
        String name = sc.nextLine();
        for (int i = 0; i < contacts.length; i++) {
            if (name == contacts[i].getFullName()) {
                System.out.println(contacts[i].getFullName()+contacts[i].getPhoneNumber());
            } else {
                System.out.println("null");

            }
        }
        return name;
    }

    @Override
    public String searchContact() {
        System.out.println("Vvedite contact ");
        String con = sc.nextLine();
        for (int i = 0; i < contacts.length; i++) {
            if (con == contacts[i].getFullName()) {
                System.out.println(contacts[i].getFullName());
            } else {
                System.out.println("null");
            }

        }
        return con;
    }



    @Override
    public Contact[] getAllContacts() {
        Contact[]contacts;

        return  getContacts();
    }


}



















