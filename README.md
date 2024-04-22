# Mascota Virtual
## ¿Qué es Mascota Virtual?
Mascota virtual es un programa escrito en **Java** que permite que el usuario pueda interactuar con una mascota a través de un menú interactivo, que permite que el usuario realice distintas acciones, como jugar con ella, alimentarla, entregarle medicamentos, entre otros. Mientras el usuario interactue con la mascota, esta irá modificando diferentes atributos(que a su vez modificará su estado de ánimo), que se irán imprimiendo en la pantalla, de manera que el usuario sepa del estado de su mascota y sepa que acciones realizar para un correcto cuidado.
# Instalación y ejecución del programa
Para ejecutar **Mascota Virtual** es necesario contar con 6 archivos: 
* Main.java
* Mascota.java
* Estado.java
* Item.java
* Inventario.java
* config.csv

Como la entrega de la tarea se compone de 4 etapas, se procederá a explicar como ejecutar cada una de ellas:
### Etapa 1 
En la etapa 1 se crea la clase "Mascota", la cuál nos sirve para entregar métodos para mostrar los atributo y el estado anímico de la mascota, esta etapa sólo imprime los atributos y el estado anímico.

Para ejecutar la etapa 1, es necesario que en la carpeta estén lo siguientes archivos:
* Main.java
* Mascota.java
* Estado.java

Una vez ubicados los archivos, es necesario compilarlos con el comando:
```gnu
   javac Main.java
   java Main
```
No es necesario agregar valores en el argumento.

### Etapa 2
En esta etapa, se crea la clase "Item" la cuál nos entregará métodos para que la mascota pueda utilizar 3 tipos de objetos distintos: Comida, Juguetes y Medicamentos. Lo cuál modifican los atributos de la mascota. Además, se incorpora un método que permite que la mascota duerma, que modifica de igual forma sus atributos. El programa al inicializar muestra los atributos de la mascota a medida que consume un item, para luego dormir.

Para ejecutar la etapa 2, es necesario que en la carpeta se encuentre los siguientes archivos:
	
* Main.java
* Mascota.java
* Estado.java
* Item.java

Es necesario compilar el Main:
```
javac Main.java
java Main 
```
No es necesario entregar parámetros en los argumentos.

### Etapa 3
En la etapa 3 se crea la clase "Inventario" la cual se encarga de almacenar los item que la mascota tiene disponible, y que puede usar. Para que el usuario interactue con la mascota, se incorpora un menú que se imprime
cada vez que la mascota realiza una acción, que nos indica los item que tenemos en el inventario y , además, un espacio para que el usuario ingrese el ID del item disponible, y la mascota lo consuma. Finalmente, se incorpora el paso del tiempo, ya que cada acción que la mascota realiza aumenta el tiempo que pasa, y aumenta su edad de igual manera, entregándose esta información junto a los atributos de la mascota.

Para ejecutar la etapa 3, es necesario tener los archivos:

* Main.java
* Mascota.java
* Estado.java
* Item.java
* Inventario.java

Es necesario compilar el Main:
```
javac Main.java
java Main 
```
No es necesario entregar parámetros en los argumentos.

### Etapa 4
En la etapa 4, la cual es la final del programa, se incorporarán los datos de la mascota a través de un archivo "config.csv", de esta manera se puede modificar este archivo para probar diversas configuraciones de la mascota. Además, el menú con el que puede el usuario interactuar con la mascota incorporan 3 opciones más, ingresar "c" para continuar el paso del tiempo sin consumir ningún item, ingresar "0" y la mascota duerme, y "x" para que termine el juego.

Para ejecutar la etapa 4, es necesario tener los archivos:

* Main.java
* Mascota.java
* Estado.java
* Item.java
* Inventario.java
* config.csv

Es necesario compilar el Main:
```
javac Main.java
java Main config.csv
```




