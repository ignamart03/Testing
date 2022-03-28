package interfaces;

import java.util.Objects;

public class Poligono {

	// propiedades
	private int num_lados;
	private double lado;

	// constructores
	public Poligono(int num_lados, double lado) {
		this.setLado(lado);
		this.setNum_lados(num_lados);
	}

	public void setNum_lados(int num_lados) {
		if (num_lados < 3) {
			throw new IllegalArgumentException("El poligono debe tener al menos 3 lados");
		}
		this.num_lados = num_lados;
	}

	public int getNum_lados() {
		return num_lados;
	}

	public double getLado() {
		return lado;
	}

	public void setLado(double lado) {
		if (lado <= 0.0) {
			throw new IllegalArgumentException("El lado debe ser mayor de 0");
		}
		this.lado = lado;
	}

	public double damePerimetro() {
		return this.getNum_lados() * this.getLado();
	}

	@Override
	public String toString() {
		return " [Lados: " + this.getNum_lados() + " * Perimetro: " + this.damePerimetro() + "]";
	}
//
//	public boolean equals (Object o) {
//		boolean sonIguales = false;
//		
//		if(o instanceof Poligono) {
//			Poligono otroP=(Poligono)o
//		}
//	}
	

	public int compareTo(Poligono o) {
		int resultado = 0;
		if (this.getNum_lados() < o.getNum_lados()) {
			resultado = -1;

		} else if (this.getNum_lados() > o.getNum_lados()) {
			resultado = +1;
		} else {
			if (this.getLado() > o.getLado()) {
				resultado = -1;
			} else if (this.getLado() > o.getLado()) {
				resultado = +1;
			} else {
				resultado = 0;
			}

		}
		return resultado;
	}

	@Override
	public int hashCode() {
		return Objects.hash(lado, num_lados);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!(obj instanceof Poligono))
			return false;
		Poligono other = (Poligono) obj;
		return Double.doubleToLongBits(lado) == Double.doubleToLongBits(other.lado) && num_lados == other.num_lados;
	}

} // fin de la clase
