package interfaces;

import java.util.ArrayList;
import java.util.Collections;

public class OrdenarPoligono {
	//lista estática con los polígonos que guardaremos
	static ArrayList<Poligono> listaPoligonos=new ArrayList<>();
	
	
	
	//método para rellenar la lista
	static void rellenarLista() {
		listaPoligonos.add(new Poligono(5,20));
		listaPoligonos.add(new Poligono(8,30));
		listaPoligonos.add(new Poligono(3,50));
		listaPoligonos.add(new Poligono(3,20));
		listaPoligonos.add(new Poligono(8,45));
		listaPoligonos.add(new Poligono(5,45));
		listaPoligonos.add(new Poligono(8,20));
	}
	
	//método para imprimir la lista
	static void mostrarLista() {
		for (Poligono poli: listaPoligonos) {
			System.out.println(poli.toString());
		}
	}

	public static void main(String[] args) {
		rellenarLista();
		
//		Poligono p1,p2,p3;
//		p1 = new Poligono (5, 50);
//		p2 = new Poligono (5, 49.9);
//		p3 = new Poligono (5, 50.0);
//		
//		p1.equals(p3);
		
		//ordenamos la lista antes de mostrarla
		Collections.sort(listaPoligonos);
		mostrarLista();

	}
	
	

}
