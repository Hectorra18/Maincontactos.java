import java.util.Scanner;

public class Main {


    private static Scanner scan = new Scanner(System.in);
    private static TelefonoMovil telefonoMovil = new TelefonoMovil();

    public static void imprimirMenu() {
        System.out.println("0 - Para salir");
        System.out.println("1 - Para imprimir contactos");
        System.out.println("2 - Para añadir contactos");
        System.out.println("3 - Para actualizar contacto");
        System.out.println("4 - Para eliminar contacto");
        System.out.println("5 - Para buscar contacto");
        System.out.println("6 - Para imprimir la lista de opciones");
    }

    private static void additem() {

        System.out.println("Inserta el nombre: ");
        String nombre = scan.nextLine();
        System.out.println("Inserta el telefono: ");
        String telefono = scan.nextLine();
        boolean resultado = telefonoMovil.addNewContact(new Contactos(nombre, telefono));
        if (resultado == true) {
            System.out.println("Contacto insertado");
        } else {
            System.out.println("Error");
        }
    }

    public static void updateitem() {
        System.out.println("Insertar nombre antiguo: ");
        String oldnombre = scan.nextLine();

        if(telefonoMovil.queryContact(oldnombre)!=null){
            System.out.println("Introduce el nombre nuevo: " );
            String newnombre= scan.nextLine();
            System.out.println("Introduce el numero nuevo: ");
            String newnumero= scan.nextLine();
            telefonoMovil.updateContact(telefonoMovil.queryContact(oldnombre),Contactos.createContact(newnombre,newnumero));
        }
        else {
            System.out.println("Ha habido un error al crear el nuevo contacto");
        }
    }

    public static void removeItem() {

        System.out.println("Inserta el nombre del contacto");
        String nombre = scan.nextLine();

        if (telefonoMovil.queryContact(nombre)!=null) {
            telefonoMovil.removeContact(telefonoMovil.queryContact(nombre));
            System.out.println("El contacto se ha eliminado con exito");
        } else {
            System.out.println("Ha habido un error al eliminar el contacto");
        }
    }

    public static void queryitem() {
        System.out.println("Insertar contacto: ");
        String contacto = scan.nextLine();
        System.out.println("Nombre: " + telefonoMovil.queryContact(contacto).getName() + ", Telefono: " + telefonoMovil.queryContact(contacto).getPhoneNumber());


    }

    public static void main(String[] args) {
        boolean continuar = true;
        int opcion = 0;
        imprimirMenu();

        do {
            System.out.println("Elige una opción: ");
            opcion = scan.nextInt();
            scan.nextLine();

            switch (opcion) {
                case 0:
                    break;
                case 1:
                    telefonoMovil.printContacts();
                    break;
                case 2:
                    additem();
                    break;
                case 3:
                    updateitem();
                    break;
                case 4:
                    removeItem();
                    break;
                case 5:
                    queryitem();
                    break;
                case 6:
                    continuar = false;
                    break;
            }

        }
        while (opcion != 0) ;

    }

    }
