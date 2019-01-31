package code;

public class Calculadora {
	private int a;
	private int b;
	
	public Calculadora(int a, int b) {
		this.a = a;
		this.b = b;
	}
	
	public int suma() {
		return a+b;
	}
	
	public int resta() {
		return a - b;
	}
	
	public int producto() {
		return a*b;
	}
	
	public float division() {
		return (float)a/b;
	}
}
