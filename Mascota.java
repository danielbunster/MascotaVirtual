import java.lang.reflect.Array;
import java.util.Vector;
import java.util.ArrayList; 
import java.util.Scanner;

public class Mascota {
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

        public void darItem(Item item){
            if (item instanceof Comida){
                System.out.println("Dando de comer "+item.getNombre()+"...");
                this.energia +=20;
                if(this.energia>=100){this.energia=100;}
                this.salud +=20;
                if(this.salud>=100){this.salud=100;}
            } else if (item instanceof Medicina){
                System.out.println("Aplicando medicamento "+item.getNombre()+"...");
                this.salud += 40;
                if(this.salud>=100){this.salud=100;}
            } else if (item instanceof Juguete){
                System.out.println("Usando juguete "+item.getNombre()+"...");
                this.felicidad += 30;
                if(this.felicidad>=100){this.felicidad=100;}
            }
        }

        public void dormir(){
            System.out.println(this.nombre+" ha dormido como un tronco!");
            this.energia =100;
            if(this.energia>=100){this.energia=100;}
            this.felicidad +=15;
            if(this.felicidad>=100){this.felicidad=100;}
            this.salud +=15;
            if(this.salud>=100){this.salud=100;}
        }
}
