import java.lang.reflect.Array;
import java.util.Vector;

public class Mascota {
        /**
        * @param nombre -> Nombre de la mascota
        * @param edad -> Edad de la mascota
        * @param salud -> Salud de la mascota [0-100]
        * @param energia -> Energia de la mascota [0-100]
        * @param felicidad -> Felicidad de la mascota [0-100]
        * @param estado -> Estado de animo/situacion de la mascota
        **/
        //Atributos
        public String nombre;
        public float edad;
        public int salud;
        public int energia;
        public int felicidad;
        public Estado estado;
        
        
        public Mascota(String nombre){
            this.nombre = nombre;
            this.edad = 0;
            this.salud = 100;
            this.energia = 100;
            this.felicidad = 50;
            if (this.felicidad>=60){this.estado = Estado.Feliz;}
            else if (this.felicidad<=20){this.estado=Estado.Triste;}
            else if ((this.edad <=5 & this.salud<=20) || (this.edad>=5 & this.edad<=10 & this.salud<=50)){this.estado=Estado.Hambriento;}
            else if (this.edad>5 & this.salud<=30 & this.energia<=30){this.estado=Estado.Enojado;}
            else if (this.energia<=15){this.estado=Estado.Cansado;}
            else if ((this.salud<=0 & this.energia<=0)||(edad>=15)){this.estado=Estado.Muerto;}
            else {this.estado=Estado.Neutro;}
        }

        public Mascota(String nombre, float edad, int salud, int energia, int felicidad){
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
