public class Contactos {

    public String name;
    public String phoneNumber;

    public Contactos(String name, String phoneNumber) {
        this.name = name;
        this.phoneNumber = phoneNumber;
    }

    public String getName() {
        return name;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }


    public static Contactos createContact(String name, String phoneNumber) {


        Contactos contacto = new Contactos(name, phoneNumber);

        return contacto;

    }

}
