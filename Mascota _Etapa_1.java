import java.lang.reflect.Array;
import java.util.Vector;

public class Mascota {
        private String nombre;
        private int edad;
        private int salud;
        private int energia;
        private int felicidad;
        private Estado estado;

        public Mascota(String nombre){
            this.nombre = nombre;
            this.edad = 0;
            this.salud = 100;
            this.energia = 100;
            this.felicidad = 50;
            this.estado = Estado.Neutro;
        }

        public Mascota(String nombre, int edad, int salud, int energia, int felicidad){
            this.nombre = nombre;
            this.edad = edad;
            this.salud = salud;
            this.energia = energia;
            this.felicidad = felicidad;
        }

        public void printAttributes(){
            System.out.println("Atributos \n");
            System.out.println("----------------");
            System.out.println("Nombre: " + this.nombre);
            System.out.println("Edad: " + Integer.toString(this.edad));
            System.out.println("Salud: " + Integer.toString(this.salud));
            System.out.println("Energía: " + Integer.toString(this.energia));
            System.out.println("Felicidad: " + Integer.toString(this.felicidad));
            System.out.println("Estado: " + this.estado.getPhrase());
        }

}
