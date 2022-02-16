/*Crea una classe anomenada Base amb dos mètodes: metode1() i metode2(). En el primer mètode, invoca el segon.
Defineix una classe anomenada Derivada que hereti de l'anterior i substitueix el segon mètode.
Crea un objecte de la classe Derivada, realitza una generalització (upcasting) al tipus Base i crida al primer mètode.
Demostra el que succeeix.*/

public class s101n3exercici1 {

    public class base {
        // Method definition performing a Call to another Method
        public static void main(String[] args) {
            Metode1();
            Metode2();
        }


        public static void Metode1() {
            Metode2();
        }

        public static void Metode2()
        {
            System.out.println("Roda Món!");
        }
    }
    public class Derivada extends base{


    }
}
