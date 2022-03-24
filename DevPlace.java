
package devplace;
import java.util.Scanner;
import java.util.Random;
public class DevPlace {

    
    // Funciones del challenge
    static void Primos(){
        //pongo un limite de elementos en el arreglo por cuestiones
        //practicas
        int[] valPrim = new int [100];
        int[] valNoPrim = new int[1000];
        
        Scanner sc = new Scanner(System.in);
        int val1, val2, posPrim = 0, posNoprim = 0;
        System.out.println("Ingrese un valor");
        val1 = sc.nextInt();
        System.out.println("Ingrese otro valor");
        val2 = sc.nextInt();
        for (int x = val1; x < val2; x++){
            //hago una funcio for para recorrer cada intervalo
            //dependiendo si uno de los valores de ese intervalo
            //es primo o no, se almacena en un arreglo temporal
            if(esPrimo(x)){
                valPrim[posPrim] = x;
                posPrim++;
            }else{
                valNoPrim[posNoprim] = x;
                posNoprim++;
            }
        }
        System.out.println("Numeros primos encontrados en ese intervalo");
        mostrarArray(valPrim, posPrim);
        System.out.println();
        System.out.println("Numeros no primos encontrados en ese intervalo");
        mostrarArray(valNoPrim, posNoprim);
        System.out.println();
    }
      
    static void peticionNumbers(){
        //Se le pide al usuario que cargue 5 numeros, los cuales
        //se almacenaran en un arreglo, se sumaran a parte
        // y luego se mostrar dicho arreglo de forma inversa
        
        Scanner sc = new Scanner (System.in);
        int[] numeros = new int [5];
        int cont = 0, sum = 0, val;
        System.out.println("Ingrese numeros");
        do{
            val = sc.nextInt();
            sum = sum + val;
            numeros[cont] = val;
            cont++;
        }while (cont != numeros.length);
        System.out.println("El arreglo quedo de la siguiente forma");
        mostrarArray(numeros, cont);
        System.out.println();
        System.out.println ("La sumatoria de todos los numeros es de: "
        + sum);
        System.out.println("Los numeros ingresados en orden inverso");
        mostrarArrayInv(numeros);
        System.out.println();
    }  
    
    static void ordenamientoArrays(){
        //Uso el mismo sistema que el anterior para crear un array propio
        
        Scanner sc = new Scanner (System.in);
        int[] numeros = new int [10];
        int cont = 0, sum = 0, val;
        System.out.println("Ingrese 10 numeros");
        do{
            val = sc.nextInt();
            sum = sum + val;
            numeros[cont] = val;
            cont++;
        }while (cont != numeros.length);
        System.out.println("Usted ingreso este arreglo");
        mostrarArray(numeros, numeros.length);
        System.out.println("Y asi quedaria ordenado de menor a mayor");
        insercion(numeros);
        mostrarArray(numeros, numeros.length);
        elementosRepetidos(numeros);
    }
    
    static void PiedraPapelTijera(){
        Scanner sc = new Scanner (System.in);
        String jug1, jug2;
        System.out.println("Jugador 1, elija "
                + "'P' para piedra, 'A' para Papel o 'T' para Tijera'");
        jug1 = sc.nextLine().toLowerCase();  
        while (jug1.compareTo("p") != 0 
                && jug1.compareTo("a") != 0 
                && jug1.compareTo("t") != 0){
            System.out.println("No es una jugada valida, vuelva a ingresar");
            jug1 = sc.nextLine().toLowerCase();
        }
        System.out.println("Jugador 2, elija "
                + "'P' para piedra, 'A' para papel, o 'T' para tijera'");
        jug2 = sc.nextLine().toLowerCase();
        while (jug2.compareTo("p") != 0 
                && jug2.compareTo("a") != 0 
                && jug2.compareTo("t") != 0){
            System.out.println("No es una jugada valida, vuelva a ingresar");
            jug2 = sc.nextLine().toLowerCase();
        }
        if (jug1.compareTo(jug2) == 0){
            System.out.println("Empate");
        }else {
            if (jug1.equals("p") && jug2.equals("a")){
                System.out.println("Gano Jugador 2");
            }else {
                if (jug1.equals("a") && jug2.equals("t")){
                    System.out.println("Gano Jugador 2");
                } else {
                    if (jug1.equals("t") && jug2.equals("p")){
                        System.out.println("Gano Jugador 2");
                    }else{
                        System.out.println("Gano Jugador 1");
                    }
                }
            }
        }
        
    }
    
    static void salario (){
        Scanner sc = new Scanner(System.in);
        String nombre, ape;
        int edad, salario, total;
        System.out.println("Ingrese su nombre");
        nombre = sc.nextLine();
        System.out.println("Ingrese su apellido");
        ape = sc.nextLine();
        System.out.println("Ingrese su edad");
        edad = sc.nextInt();
        if (edad <= 16){
            System.out.println ("Usted no tiene edad para trabajar");
        } else {
            System.out.println("Ingrese su salario");
            salario = sc.nextInt();
            if (edad > 19 && edad < 51){
                System.out.println(nombre + " " + ape + ": Su salario aumento un 5%");
                total = ((salario*5)/100);
                salario += total;
                System.out.println("Su nuevo total es de: " + salario);
            }else{
                if (edad >=51 && edad < 61){
                    System.out.println(nombre + " " + ape + ": Su salario aumento un 10%");
                     total = ((salario*10)/100);
                     salario+= total;
                     System.out.println("Su nuevo total es de: " + salario);
                } else {
                    if (edad >= 61){
                        System.out.println(nombre + " " + ape + ": Su salario aumento un 15%");
                        total = ((salario*15)/100);
                        salario += total;
                        System.out.println("Su nuevo total es de: " + salario);
                    }
                }
            }
        }
        
    }
    
    static void numerosAzar(){
        boolean condicion = false;
        int count = 0;
        Random rd = new Random();
        do{
            int num1 = rd.nextInt(1000);
            int num2 = rd.nextInt(1000);
            int num3 = rd.nextInt(1000);
            System.out.println(num1 + " " + num2 + " " + num3);
            if (esPar(num1) && esPar(num2) && !esPar(num3)){
                condicion = true;
            } else {
                count++;
            }
            
        }while (condicion == false);
        
        System.out.println("En total se necesito repetir: " + count + " veces para que"
                + "se cumpliera la condicion (par, par, impar)");
    }
    
    //Funciones Auxiliares    
    static boolean esPrimo(int num){
        boolean primo = true;
        for (int x = 2; x < num; x++){
            if (num % x == 0){
                return false;
            }
        } 
        return primo;
    }
    
    static void mostrarArray (int[] array, int pos){
        for (int x = 0; x < pos; x++){
            System.out.print(array[x] + " ");
        }
        System.out.println();
    }
    
    static void mostrarArrayInv(int[] array){
        for (int x = array.length -1; x > -1;x--){
            System.out.print(array[x] + " ");
        }
    }
    
    static boolean esPar(int num){
        if (num % 2 == 0){
            return true;
        }else{
            return false;
        }
    }
    
    static void insercion(int[] array) {
        //Metodo de ordenamiento por insersion
        for (int i = 1; i < array.length; i++) {
            int aux = array[i];
            int j = i - 1;
            while (j >= 0 && array[j] > aux) {
                array[j + 1] = array[j];
                j--;
            }
            array[j + 1] = aux;
        }
    }
    
    static void elementosRepetidos(int[] array){
        //Esta funcion se encarga de buscar numeros repetidos
        //Y mostrar cuantas veces se repite tal numero
        
        int count = 0, aux = array[0];
        for (int x = 0; x < array.length -1; x++){
            if(aux == array[x]){
                count++;
            }else{
                if (count > 1){
                System.out.println("El numero " + aux +
                        " se repite unas: " + count + " veces.");                              
              }
                count = 1;
                aux = array[x];
            }               
            }
    }
    
    //Funcion Main
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        int opcion;
        do{
            //Hago un menu en consola para acceder mas facil a cada
            //challenge que se me encomendo, es una forma mas practica
            //para mi de hacerlo sin tener que crear varios .java
            System.out.println("Elija una opcion para acceder a un challenge"
                    + "en especifico");
            System.out.println("1 - Verificacion de primos mediante intervalos");
            System.out.println("2 - Ingreso de numeros a un arreglo");
            System.out.println("3 - Ordenar Array");
            System.out.println("4 - Piedra, Papel o Tijera");
            System.out.println("5 - Calculo salarial");
            System.out.println("6 - Numeros al azar");
            System.out.println("0 - Salir");
            opcion = sc.nextInt();
            switch(opcion){
                case 1 : Primos(); break;
                case 2 : peticionNumbers(); break;
                case 3 : ordenamientoArrays(); break;
                case 4 : PiedraPapelTijera(); break;
                case 5 : salario(); break;
                case 6 : numerosAzar(); break;
                default : break;
                }               
            
                       
        }while (opcion != 0);        
    }
    
  
}
