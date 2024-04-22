public abstract class Item {
    /**
    * @param id: id el item
    * @param cantidad: cantidad del mismo item
    * @param nombre: nombre del item
    **/
    
    //Atributos
    protected int id;
    protected int cantidad;
    protected String nombre;

    //Constructor
    public Item(int id, int cantidad, String nombre){
        this.id =id;
        this.cantidad=cantidad;
        this.nombre=nombre;
    }

    //Metodos
    public String getNombre(){
        return nombre;
    }
}

class Comida extends Item{
    //Constructor
    public Comida (int id, int cantidad, String nombre){
        super(id, cantidad, nombre);
    }
}

class Medicina extends Item{
    //Constructor
    public Medicina(int id, int cantidad, String nombre){
        super(id, cantidad, nombre);
    }
}

class Juguete extends Item{
    //Constructor
    public Juguete(int id, int cantidad, String nombre){
        super(id, cantidad, nombre);
    }
}

