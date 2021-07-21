import java.util.Scanner;

public class HolaMundo {

    public static void main(String[] args) {
      /*  
        //Tipos primitivos en Java byte, short, int, long
        byte byteVar = 127;
        System.out.println("byteVar = "+byteVar);
        
        System.out.println("bits tipo byte: "+Byte.SIZE);
        System.out.println("bytes tipo byte: "+Byte.BYTES);
        System.out.println("valor minimo tipo byte: "+Byte.MIN_VALUE);
        System.out.println("valor maximo tipo byte: "+Byte.MAX_VALUE);
        
        
        short shortVar = 32767;
        System.out.println("shortVar = "+shortVar);
        
        System.out.println("bits tipo short: "+Short.SIZE);
        System.out.println("bytes tipo short: "+Short.BYTES);
        System.out.println("valor minimo tipo short: "+Short.MIN_VALUE);
        System.out.println("valor maximo tipo short: "+Short.MAX_VALUE);
        
        int intVar = 2147483647;
        System.out.println("intVar = "+intVar);
        
        System.out.println("bits tipo int: "+Integer.SIZE);
        System.out.println("bytes tipo int: "+Integer.BYTES);
        System.out.println("valor minimo tipo int: "+Integer.MIN_VALUE);
        System.out.println("valor maximo tipo int: "+Integer.MAX_VALUE);
        
        long longVar = 9223372036854775807L;
        
        System.out.println("longVar = "+longVar);
        
        System.out.println("bits tipo long: "+Long.SIZE);
        System.out.println("bytes tipo long: "+Long.BYTES);
        System.out.println("valor minimo tipo long: "+Long.MIN_VALUE);
        System.out.println("valor maximo tipo long: "+Long.MAX_VALUE);
     */
      
      /*
        int numeroDecimal = 10;
        System.out.println("numeroDecimal = "+ numeroDecimal);
        
        int numeroOctal = 012;
        System.out.println("numeroOctal = "+numeroOctal);
      
        int numeroHexadecimal = 0xA;
        System.out.println("numeroHexadecimal = "+numeroHexadecimal);
  
        int numeroBinario = 0b1010;
        System.out.println("numeroBinario = "+numeroBinario);
        
       */
      
        /*
      
        //floar double
      
        float floatVar = 1000.10F;
        System.out.println("floarVar = "+floatVar);
        
        System.out.println("bits tipo float: "+Float.SIZE);
        System.out.println("bytes tipo float: "+Float.BYTES);
        System.out.println("valor minimo tipo float: "+Float.MIN_VALUE);
        System.out.println("valor maximo tipo float: "+Float.MAX_VALUE);
        
        double doubleVar = 100;
        
        System.out.println("doubleVar = "+doubleVar);
        
        System.out.println("bits tipo double: "+Double.SIZE);
        System.out.println("bytes tipo double: "+Double.BYTES);
        System.out.println("valor minimo tipo double: "+Double.MIN_VALUE);
        System.out.println("valor maximo tipo double: "+Double.MAX_VALUE);
        */
        
        
        /*
        //char
        
        System.out.println("bits tipo char: "+Character.SIZE);
        System.out.println("bytes tipo char: "+Character.BYTES);
        System.out.println("valor minimo tipo char: "+Character.MIN_VALUE);
        System.out.println("valor maximo tipo char: "+Character.MAX_VALUE);
 
        //Para indicarle a java que es un valor de tipo unicode
       //los tipos char solo permiten un caracter y van con comillas simples
        char varChar ='\u0021';
        System.out.println("varChar = "+varChar);
    
        char varCharDecimal = 33;
        System.out.println("varChar = "+varCharDecimal);
        
        char varCharSimbolo = '!';
         System.out.println("varChar = "+varCharSimbolo);
         */
        
        /*
        //boolean
        System.out.println("true tipo boolean: "+Boolean.TRUE);
        System.out.println("true tipo boolean: "+Boolean.FALSE);
    
        boolean booleanVar = true;
        
        if(booleanVar){
            System.out.println("EL VALOR ES VERDADERO");
        }
        else{
            System.out.println("EL VALR ES FALSO");
        }
        
        int edad = 18;
        boolean esAdulto = edad >= 18;
        
        System.out.println("esAdulto = "+esAdulto);
        */
        
        int edad = Integer.parseInt("20");
        System.out.println("edad = "+edad);
        
        double valorPI = Double.parseDouble("3.1316");
        System.out.println("valorPi = "+valorPI);
        
        char c = "hola".charAt(3);
        System.out.println("c = "+c);
        
        
        Scanner sc = new Scanner(System.in);
        edad = Integer.parseInt(sc.nextLine());
        
        System.out.println("edad = "+edad);
        char caracter = sc.nextLine().charAt(0);
        System.out.println("caracter = "+caracter);
        
        String edadTexto = String.valueOf(25);
        System.out.println("edadTexto = "+edadTexto);
        
        short s = 10;
        byte b = (byte)s;
        System.out.println("b = "+b);
    }
}
