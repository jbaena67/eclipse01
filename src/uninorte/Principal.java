package uninorte;

import java.util.LinkedList;
import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       Persona persona1 = new Persona("Juan","Baena Ribón ");
       Persona persona2 = new Persona("Heidy","Pupo");
       Persona persona3 = new Persona("Julia Carolina","Baena");
       Persona persona4 = new Persona("Angie Paola","Baena");
       Persona persona5 = new Persona("Ivonne Lucía","Baena");
       LinkedList<Persona> listaAuxiliar = new LinkedList<Persona>();
       listaAuxiliar.add(persona1); 
       listaAuxiliar.add(persona2);
       listaAuxiliar.add(persona3);
       listaAuxiliar.add(persona4);
       listaAuxiliar.add(persona5);
       Scanner sc = new Scanner(System.in);
       
       for(Persona p:listaAuxiliar) {
    	   System.out.println("\n\rDe ");
    	   System.out.println(p.getNombreCompleto());
    	   System.out.println("Digite la Dirección ");
    	   p.setDireccion(sc.nextLine());
    	   System.out.println("Digite el Teléfono ");
    	   p.setTelefono(sc.nextLine());
    	   System.out.println("Digite El Correo ");
    	   p.setCorreo(sc.nextLine());
       }
       sc.close();
       for(Persona p:listaAuxiliar) {
    	   System.out.println(p.getNombreCompleto()+ " | "+p.getDireccion()+" | "+p.getTelefono()+" | "+p.getCorreo());
       }
	}
}
