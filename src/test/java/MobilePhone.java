import java.util.ArrayList;

public class MobilePhone {


    private String myNumber;
    private ArrayList<Contact> myContacts;


    public static void main(String[] args) {

        MobilePhone firstNumber = new MobilePhone("07037605581");
       Contact firstContact= Contact.createContact("Lade","08138662737");
        Contact secondContact= Contact.createContact("Dearie","08138177447");
        //firstNumber.removeContact(firstContact);
firstNumber.printContacts();



    }

    public MobilePhone(String myNumber) {
        this.myNumber = myNumber;
        this.myContacts = new ArrayList<Contact>();
    }

    public boolean addNewContact(Contact contact) {

        if (findContact(contact.getName()) >= 0) {
            System.out.println("Contact is already on file");
            return false;
        }
        myContacts.add(contact);
        System.out.println(this.myContacts);
        return true;
    }

    public boolean updateContact(Contact oldContact, Contact newContact) {

        int foundPosition = findContact(oldContact);
        if (foundPosition < 0) {
            System.out.println(oldContact.getName() + ", was not found.");
            return false;
        } else if (findContact(newContact.getName()) != -1) {
            System.out.println("Contact with name " + newContact.getName() +
                    " already exists.  Update was not successful.");
            return false;
        }

        this.myContacts.set(foundPosition, newContact);
        System.out.println(oldContact.getName() + ", was replaced with " + newContact.getName());
        return true;
    }

    public boolean removeContact(Contact contact) {

        int foundPosition = findContact(contact);
        if (foundPosition < 0) {
            System.out.println(contact.getName() + ", was not found.");
            return false;
        }

        this.myContacts.remove(foundPosition);
        System.out.println(contact.getName() + ", was deleted.");
        return true;
    }

    private int findContact(Contact contact) {
        return myContacts.indexOf(contact);
    }

    private int findContact(String contactName) {

        for (int i = 0; i < myContacts.size(); i++) {
            Contact contact = myContacts.get(i);
            if (contact.getName().equals(contactName)) {
                return i;
            }
        }
        return -1;
    }

    public Contact queryContact(String name) {

        int position = findContact(name);
        if (position >= 0) {
            return this.myContacts.get(position);
        }
        return null;
    }

    public  void printContacts() {

        System.out.println("Contact List:");
        for (int i = 0; i < this.myContacts.size(); i++) {
            System.out.println((i + 1) + ". " +
                    this.myContacts.get(i).getName() + " -> " +
                    this.myContacts.get(i).getPhoneNumber());
        }

    }
}


 class Contact {
    // write code here

    private static String name;
    private static String phoneNumber;


    public Contact (String name, String phoneNumber){


        this.name= name;
        this.phoneNumber=phoneNumber;
    }


    public  String getName(){


        return name ;
    }


    public  String getPhoneNumber(){


        return phoneNumber;
    }


    public static Contact createContact(String name, String phoneNumber){
   Contact newContact =     new Contact(name,phoneNumber);
  return  newContact;
    }
}
