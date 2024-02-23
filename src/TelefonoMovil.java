import java.util.ArrayList;

public class TelefonoMovil {

    private String myNumber;

    private ArrayList<Contactos> myContacts = new ArrayList<Contactos>();


    public TelefonoMovil() {
        this.myNumber = myNumber;
        this.myContacts = myContacts;
    }


    private int findContact(Contactos contactos) {


        return myContacts.indexOf(contactos);
    }

    private int findContact(String buscarContacto) {

        for (int i = 0; i < myContacts.size(); i++) {

            if (myContacts.get(i).getName().equalsIgnoreCase(buscarContacto)) {
                return i;
            }
        }
        return -1;
    }


    public boolean addNewContact(Contactos contactos) {


        if (findContact(contactos) >= 0) {
            return false;
        } else {
            myContacts.add(contactos);
            return true;
        }

    }

    public boolean updateContact(Contactos contactos, Contactos contactosNuevos) {

        if(findContact(contactos) !=-1){

            myContacts.set(findContact(contactos),contactosNuevos);

            return true;
        }else{
            return false;
        }



    }

    public boolean removeContact(Contactos contactos) {

        int index = findContact(contactos);
        if (index >= 0) {
            myContacts.remove(index);
            return true;
        }
        return false;

    }

    public Contactos queryContact(String nombreContacto){

        for(Contactos contactos : myContacts){
            if(contactos.getName().equalsIgnoreCase(nombreContacto)){
                return contactos;
            }
        }

    return null;}


public void printContacts(){

    System.out.println("Lista de contactos:");


    for(int i = 0; i < myContacts.size(); i++) {
        System.out.println((i+1) + " Nombre: " + myContacts.get(i).getName() + ", Numero: " + myContacts.get(i).getPhoneNumber());

    }
    }


}
