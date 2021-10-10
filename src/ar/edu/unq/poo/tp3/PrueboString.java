package ar.edu.unq.poo.tp3;

import java.util.ArrayList;

public class PrueboString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String a = "abc";
		String s= a;
		String t;
		int n=0;
	    ArrayList<Integer> v= new ArrayList<Integer>();
		
		System.out.println( s.length());// devuelve la longitud de la cadena de caracteres 3//
		//System.out.println( t.length()); da error porque t no esta inicializada
		System.out.println( 1 + a); // devuelve la concatenacion 1abc
		System.out.println( a.toUpperCase()); // devuelve la cadena en mayuscula ABC
		System.out.println( "Libertad".indexOf("r")); //devuelve el lugar donde esta la "r" contando desde cero... 4
		System.out.println( "Universidad".lastIndexOf('i')); // devuelve la posicion de la ultima 'i' , 7
		System.out.println( "Quilmes".substring(2,4)); // devuelve il, toma las primeras 4 letras y de ese substring devuelve lo que estan a partir de la 2da letra 
		System.out.println(( a.length() + a).startsWith("a")); // devuelve false, la primera parte es 3abc y al aplicar la funcion startswith no es "a"
		System.out.println( s== a); // devuelve true porque son el mismo objeto
		System.out.println( a.substring(1,3).equals("bc")); //devuelve true porque el valor de ese substring es "bc"
		System.out.println(n);
		System.out.println( v);
		

	}

}
