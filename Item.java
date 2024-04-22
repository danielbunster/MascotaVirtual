public abstract class Item {

    /*public abstract void printItemAplicado();*/

    /* Completar código de la clase */
    protected int id;
    protected int cantidad;
    protected String nombre;

    public Item(int id, int cantidad, String nombre){
        this.id =id;
        this.cantidad=cantidad;
        this.nombre=nombre;
    }

    public String getNombre(){
        return nombre;
    }

}

class Comida extends Item{
    public Comida (int id, int cantidad, String nombre){
        super(id, cantidad, nombre);
    }

    public String getNombre(){
        return nombre;
    }
}

class Medicina extends Item{
    public Medicina(int id, int cantidad, String nombre){
        super(id, cantidad, nombre);
    }

    public String getNombre(){
        return nombre;
    }

}

class Juguete extends Item{
    public Juguete(int id, int cantidad, String nombre){
        super(id, cantidad, nombre);
    }

    public String getNombre(){
        return nombre;
    }
}

/*atributos */


