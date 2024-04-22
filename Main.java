import java.io.File;
import java.io.IOException;
import java.io.PrintStream;
import java.lang.reflect.Array;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        /*// Carga de archivo config.csv
        if (args.length != 1) {
            System.out.println("Usage: java Stage1 <config.csv>");
            System.exit(-1);
        }

        Scanner in = new Scanner(new File(args[0]));
        Main stage1 = new Main();
        // Lectura de archivo config.csv
        stage1.readConfiguration(in);

        stage1.executeAction(new Scanner(System.in), System.out);*/
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
    }

    ///--------------------- AYUDAS ----------------------------///

    public void readConfiguration(Scanner in){
        // Creación de mascota
        String nombre_mascota = in.nextLine();
        mascota = new Mascota(nombre_mascota);
        // Creación de inventario vacío


        //inventario = new Inventario();


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
        }
    }
    
    public void executeAction(Scanner in, PrintStream out){
        /* Completar código con manejo de acciones y menú en las etapas que corresponda
        e incremento del tiempo dependiendo de la etapa */
        /*mascota.printAttributes();*/
    
    }

    public void printEstado(float step, PrintStream out){
        /* Completar método que muestra el estado de la Mascota y del inventario
        dependiendo de la etapa */
        
    }

    ///--------------------- AYUDAS ----------------------------///

    public static void printAttributes(Inventario inventario, Mascota e){
        float tiempo = 0;
        while(true){ // Condición de constante iteración
        tiempo = tiempo + 0.5f; // Tiempo por cada iteración
        e.edad = e.edad + 0.5f; // Aumento de edad, !!!!!!revisar!!!
        e.salud = e.salud - 5;
        e.energia= e.energia - 5;
        e.felicidad = e.felicidad - 5;
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
        //-------- Mostramos atributos -----------------------//
        System.out.println("Tiempo simulado : " + tiempo);
        System.out.println("Atributos");
        System.out.println("----------------");
        System.out.println("Nombre: " + e.nombre);
        System.out.println("Edad: " + Float.toString(e.edad));
        System.out.println("Salud: " + Integer.toString(e.salud));
        System.out.println("Energía: " + Integer.toString(e.energia));
        System.out.println("Felicidad: " + Integer.toString(e.felicidad));
        if (e.felicidad>=60){e.estado = Estado.Feliz;}
        else if (e.felicidad<=20){e.estado=Estado.Triste;}
        else if ((e.edad <=5 & e.salud<=20) || (e.edad>=5 & e.edad<=10 & e.salud<=50)){e.estado=Estado.Hambriento;}
        else if (e.edad>5 & e.salud<=30 & e.energia<=30){e.estado=Estado.Enojado;}
        else if (e.energia<=15){e.estado=Estado.Cansado;}
        else if ((e.salud<=0 & e.energia<=0)||(e.edad>=15)){e.estado=Estado.Muerto;}
        else {e.estado=Estado.Neutro;}
        System.out.println("Estado: " + e.estado.getPhrase()+"\n");
        //-------- Lógica del menú encargado de seleccionar objeto a entregar --------// 
        inventario.printinv();
        int teclado = 0;
        Scanner id = new Scanner(System.in);
        System.out.print("Seleccione un elemento del inventario: ");
        teclado = id.nextInt();
        System.out.print("\n");
        inventario.buscaID(teclado,e);
        }}

    

    

    

    private Mascota mascota;
    // private Inventario inventario; // Descomentar cuando se haya creado el inventario
}

