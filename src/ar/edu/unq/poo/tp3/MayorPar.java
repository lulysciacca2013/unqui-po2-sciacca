package ar.edu.unq.poo.tp3;

import java.util.ArrayList;


public class MayorPar {
	private ArrayList<Integer> mayor = new ArrayList<Integer>();
	

	public MayorPar() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public void addNumero(int valor) {
		mayor.add(valor);
	}

	
	public int mayorDigitosPares() {
	    int numero=0;
	    int cantidad=0;
	    int elMayor=0;
	    int elNumero=0;
	    	    
	    for (int i=0; i< mayor.size(); i++) {
	    		    	
	       cantidad = desarmoNumero(mayor.get(i));
	       elNumero = mayor.get(i);
	       if(cantidad> elMayor) {
	    		elMayor= cantidad;
	    		numero = elNumero;
	    	}
	    }
	    return numero;
	}
	
	public int desarmoNumero(int num) {
	   ArrayList<Integer> auxiliar = new ArrayList<Integer>();	
		while (num !=0) {
			auxiliar.add(num%10);
			num= num/10;
		}
		return contadorPares(auxiliar);
	}
	
	public int contadorPares (ArrayList<Integer> aux) { /// metodo para contar los elementos pares
		int cant_pares=0; 
		
		for (int i=0; i< aux.size(); i++) {
			if(aux.get(i)%2 == 0) {
				cant_pares ++;
			}
			
		}
		return cant_pares;
	
	}
}
