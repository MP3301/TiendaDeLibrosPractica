import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        /**

         Se solicita capturar la siguiente información de una tienda de libros:

         nombre (String)

         id (int)

         precio (double)

         envioGratuito (boolean)

         Tu tarea es imprimir un mensaje en el siguiente formato:

         Proporciona el nombre:
         Proporciona el id:
         Proporciona el precio:
         Proporciona el envio gratuito:
         <nombre> #<id>
         Precio: <simbolo><precio>
         Envio Gratuito: <envioGratuito>
         Por ejemplo:

         Proporciona el nombre:
         Programacion con Java
         Proporciona el id:
         1520
         Proporciona el precio:
         899
         Proporciona el envio gratuito:
         true
         Programacion con Java #1520
         Precio: $899.00
         Envio Gratuito: true

         **/

        String nombre;
        String enviogratuito;
        int id;
        Double precio;
        Boolean envioGratis = null;
        Scanner sc = new Scanner(System.in);


        System.out.println("Proporciona el nombre del libro");
        nombre = sc.nextLine();

        System.out.println("Proporciona el id del libro");
        id = Integer.parseInt(sc.nextLine());

        System.out.println("Proporciona el precio del libro");
        precio = Double.valueOf(sc.nextLine());

        System.out.println("Proporciona el envio gratuito (escribe si o no)");
        if (sc.nextLine().equals("si")){
            envioGratis = true;
        } else if (sc.nextLine().equals("no")) {
            envioGratis = false;
        } else {
            System.out.println("Error debe escribir si o no");
        }

        if (envioGratis){
            enviogratuito = "Si";
        }  else {

            enviogratuito = "No";
        }

        System.out.println("Nombre del libro "+ nombre);
        System.out.println("id del libro "+ id);
        System.out.println("precio del libro $"+ precio);
        System.out.println("envio gratuito? "+ enviogratuito);



    }
}
