import java.io.File;
import java.io.IOException;
import java.io.PrintStream;
import java.lang.reflect.Array;
import java.util.Scanner;

public class Main {
    private Mascota mascota;
    private Inventario inventario;  // Descomentar cuando se haya creado el inventario

    
    public static void main(String[] args) throws IOException {
        // ENTRADA CON ARCHIVO config.csv //
        if (args.length != 1) {
            System.out.println("Usage: java Stage1 <config.csv>");
            System.exit(-1);
        }

        Scanner in = new Scanner(new File(args[0]));
        Main stage1 = new Main();
        // Lectura de archivo config.csv
        stage1.readConfiguration(in);

        stage1.executeAction(new Scanner(System.in), System.out);


        //  ENTRADA MANUAL //
        /*
        Mascota e = new Mascota("Pollita"); // Creamos al animal
        Inventario inventario = new Inventario(); // Creamos su inventario
        Juguete pelota = new Juguete(1,4,"Pelota");
        Comida queso = new Comida(2,5,"Queso");
        Comida pan =new Comida(3,3,"Pan");
        Medicina jarabe = new Medicina(4,4,"Jarabe");
        inventario.additem(pelota);
        inventario.additem(queso); 
        inventario.additem(pan); 
        inventario.additem(jarabe);  
        printAttributes(inventario,e); // Comienzo del programa en bucle.
        */
    }

    ///--------------------- AYUDAS ----------------------------///

    public void readConfiguration(Scanner in){
        // Creación de mascota
        String nombre_mascota = in.nextLine();
        this.mascota = new Mascota(nombre_mascota);


        // Creación de inventario vacío
        this.inventario = new Inventario();


        // Llenando inventario
        while (in.hasNextLine()) {
            String linea = in.nextLine();
            String[] item_csv = linea.split(";");
            int id = Integer.parseInt(item_csv[0]);
            String tipoItem = item_csv[1];
            String nombreItem = item_csv[2];
            int cantidad = Integer.parseInt(item_csv[3]);
            
            /* Completar código para inicialización de inventario en la etapa
            que corresponda */

            if ("Juguete".equals(tipoItem)){inventario.additem(new Juguete(id,cantidad,nombreItem));}
            else if ("Medicina".equals(tipoItem)){inventario.additem(new Medicina(id,cantidad,nombreItem));}
            else if ("Comida".equals(tipoItem)){inventario.additem(new Comida(id,cantidad,nombreItem));}
        }
    }
    
    public void executeAction(Scanner in, PrintStream out){
        /* Completar código con manejo de acciones y menú en las etapas que corresponda
        e incremento del tiempo dependiendo de la etapa */
        printAttributes(inventario, mascota);
    
    }

    public void printEstado(float step, PrintStream out){
        /* Completar método que muestra el estado de la Mascota y del inventario
        dependiendo de la etapa */
        
    }


    public static void printAttributes(Inventario inventario, Mascota e){
        float tiempo = 0;
        Scanner id = new Scanner(System.in);
        while(true){ // Condición de constante iteración
            tiempo = tiempo + 0.5f; // Tiempo por cada iteracion
            e.edad = e.edad + 0.5f;
            if (e.salud <=0){e.salud=0;} else if (e.salud <= 100) {e.salud = e.salud - 5;}
            if (e.energia <=0){e.energia=0;} else if (e.energia <= 100) {e.energia = e.energia - 5;}
            if (e.felicidad <=0){e.felicidad=0;} else if (e.felicidad <= 100) {e.felicidad = e.felicidad - 5;}
            //------------- Efecto del paso del tiempo en el animal----------//
            if(e.edad <= 5 & e.salud <= 10){
                e.felicidad = e.felicidad - 20;
            }
            else if((e.edad > 5 & e.edad <=10) & e.salud <= 50){
                e.felicidad = e.felicidad - 20;
                e.energia = e.energia -10;
            }
            else if(e.edad > 10 & e.salud <= 50){
                e.felicidad = e.felicidad - 30;
                e.energia = e.energia - 20;
            }

            if (e.felicidad <=0){e.felicidad=0;}
            if (e.energia <=0){e.energia=0;}
            if (e.salud <=0){e.salud=0;}

            //-------- Mostramos atributos -----------------------//
            System.out.print("\n");
            System.out.println("Tiempo simulado : " + tiempo);
            System.out.println("Atributos");
            System.out.println("----------------");
            System.out.println("Nombre: " + e.nombre);
            System.out.println("Edad: " + Float.toString(e.edad));
            System.out.println("Salud: " + Integer.toString(e.salud));
            System.out.println("Energía: " + Integer.toString(e.energia));
            System.out.println("Felicidad: " + Integer.toString(e.felicidad));
            if (e.felicidad>=60){e.estado = Estado.Feliz;}
            else if ((e.salud<=0 & e.energia<=0)||(e.edad>=15)){e.estado=Estado.Muerto;}
            else if (e.felicidad<=20){e.estado=Estado.Triste;}
            else if ((e.edad <=5 & e.salud<=20) || (e.edad>=5 & e.edad<=10 & e.salud<=50)){e.estado=Estado.Hambriento;}
            else if (e.edad>5 & e.salud<=30 & e.energia<=30){e.estado=Estado.Enojado;}
            else if (e.energia<=15){e.estado=Estado.Cansado;}
            else {e.estado=Estado.Neutro;}
            System.out.println("Estado: " + e.estado.getPhrase()+"\n");
            //-------- Lógica del menú encargado de seleccionar objeto a entregar --------// 
            inventario.printinv();
            System.out.print("Seleccione un elemento del inventario, 'c' para continuar, y 'x' para salir: ");
            String input = id.next();
            if (input.equals("x")){break;}
            else if (input.equals("c")){continue;}
            int teclado = Integer.parseInt(input);
            System.out.print("\n");
            inventario.buscaID(teclado,e);
        }
        System.out.print("\n");
        System.out.print("Fin de la simulacion");
    }

}

