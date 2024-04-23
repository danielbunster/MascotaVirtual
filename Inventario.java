import java.io.File;
import java.io.IOException;
import java.io.PrintStream;
import java.lang.reflect.Array;
import java.util.Scanner;
import java.util.ArrayList; 

public class Inventario{
    private ArrayList<Item> inventario;  // Se crea un nuevo tipo de variable, el cual se encarga de almacenar los objetos, la lista.
    
    public Inventario(){
        this.inventario = new ArrayList<>(); // creación de una lista.
    }

    public void additem(Item item){ // Método para agregar items al inventario 
        inventario.add(item); 
    }

    public void printinv(){ // Se encarga de imprimir el contenido del inventario
        System.out.println("Acciones");
        System.out.println("---------");
        System.out.println("0:  dormir");
        for(Item item : inventario){
            System.out.println(item.getId() + ":  " + item.getNombre() + ", cantidad " + item.getCantidad());
        }
    }

    public void buscaID(int id,Mascota e){  // Método encargado de buscar el objeto seleccionado en el menu, y removiendo si se acaba.
        int i=0;
        int remove =-1; 
        for(Item item : inventario){ 
            i = i + 1;
            if(id == (item.id)){
                e.darItem(item);
                item.cantidad = item.cantidad - 1;
                if(item.cantidad == 0){
                    remove = i - 1;
                }    
            } 
        } 

        if(remove != -1){ // Se encarga de eliminar el objeto una vez se acaba su cantidad.
            inventario.remove(remove);
            remove = -1;
        }

        if(id == 0){e.dormir();}

    } 
}