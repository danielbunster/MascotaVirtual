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
        private String nombre;
        private int edad;
        private int salud;
        private int energia;
        private int felicidad;
        private Estado estado;

        //Constructor
        public Mascota(String nombre){
            this.nombre = nombre;
            this.edad = 0;
            this.salud = 50;
            this.energia = 50;
            this.felicidad = 50;
            if (this.felicidad>=60){this.estado = Estado.Feliz;}
            else if (this.felicidad<=20){this.estado=Estado.Triste;}
            else if ((this.edad <=5 & this.salud<=20) || (this.edad>=5 & this.edad<=10 & this.salud<=50)){this.estado=Estado.Hambriento;}
            else if (this.edad>5 & this.salud<=30 & this.energia<=30){this.estado=Estado.Enojado;}
            else if (this.energia<=15){this.estado=Estado.Cansado;}
            else if ((this.salud<=0 & this.energia<=0)||(edad>=15)){this.estado=Estado.Muerto;}
            else {this.estado=Estado.Neutro;}
        }

        public Mascota(String nombre, int edad, int salud, int energia, int felicidad){
            this.nombre = nombre;
            this.edad = edad;
            this.salud = salud;
            this.energia = energia;
            this.felicidad = felicidad;
        }

        //Metodos
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

        public void printAttributes(){
            System.out.println("Atributos");
            System.out.println("----------------");
            System.out.println("Nombre: " + this.nombre);
            System.out.println("Edad: " + Integer.toString(this.edad));
            System.out.println("Salud: " + Integer.toString(this.salud));
            System.out.println("Energía: " + Integer.toString(this.energia));
            System.out.println("Felicidad: " + Integer.toString(this.felicidad));
            if (this.felicidad>=60){this.estado = Estado.Feliz;}
            else if (this.felicidad<=20){this.estado=Estado.Triste;}
            else if ((this.edad <=5 & this.salud<=20) || (this.edad>=5 & this.edad<=10 & this.salud<=50)){this.estado=Estado.Hambriento;}
            else if (this.edad>5 & this.salud<=30 & this.energia<=30){this.estado=Estado.Enojado;}
            else if (this.energia<=15){this.estado=Estado.Cansado;}
            else if ((this.salud<=0 & this.energia<=0)||(edad>=15)){this.estado=Estado.Muerto;}
            else {this.estado=Estado.Neutro;}
            System.out.println("Estado: " + this.estado.getPhrase()+"\n");
        }


}
