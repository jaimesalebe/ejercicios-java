import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Cuenta cuenta = new Cuenta();

//        Cliente cliente = new Cliente();
        Scanner teclado = new Scanner(System.in);

        System.out.println("Cantidad a ingresar: ");
        float cantidadIntroducida = teclado.nextFloat();
        cuenta.ingresar(cantidadIntroducida);

        System.out.println("Cantidad a retirar: ");
        float cantidadRetirar = teclado.nextFloat();
        cuenta.retirar(cantidadRetirar);

        cuenta.mostrar();

//        System.out.println("Ingrese su nombre:");
//        String nombre = teclado.nextLine();
//        cliente.setNombre(nombre);
//
//        System.out.println("Ingrese su edad:");
//        int edad = teclado.nextInt();
//        teclado.nextLine();
//        cliente.setEdad(edad);
//
//        DateTimeFormatter dateFormatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
//        System.out.println("Ingrese su fecha de nacimiento (yyyy-MM-dd):");
//        String fechaNacimiento = teclado.nextLine();
//        LocalDate fecha = LocalDate.parse(fechaNacimiento, dateFormatter);
//        cliente.setFechaNacimiento(fecha);
//
//        System.out.println("Ingrese su DNI:");
//        String DNI = teclado.nextLine();
//        cliente.setDNI(DNI);
//
//        System.out.println(cliente.mostrar());
    }
}
