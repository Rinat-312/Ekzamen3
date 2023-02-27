package Domashka3;


public class Contact implements PhoneInterface {

    private int phoneNumber;
    private String fullName;


    public Contact(int phoneNumber, String fullName) {
        this.phoneNumber = phoneNumber;
        this.fullName = fullName;
    }

    public int getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(int phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    @Override
    public void turnOn() {
//        System.out.println("VVedite parol: ");
//        String p = scanner.nextLine();
//        if (p == password) {
//            System.out.println("Telefon jandy");
//        } else {
//            System.out.println("Password ne pravilnyi");pravilnyi
    }

    @Override
    public int call() {
        return 0;
    }

    @Override
    public String coll() {
        return null;
    }

    @Override
    public String searchContact() {
        return null;
    }

    public Contact[] getAllContacts() {


        return new Contact[0];
    }

}








