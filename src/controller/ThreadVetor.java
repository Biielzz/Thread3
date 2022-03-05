package controller;

public class ThreadVetor extends Thread {
	private int valor;
	private int[] vetor;
	public ThreadVetor(int[] vetor, int valor) {
		this.valor = valor;
		this.vetor = vetor;
	}
	public void run() {
		double time;
		
		if( (valor % 2) == 0 ) {
			double start_time = System.nanoTime();
			for(int i = 0; i < vetor.length; i++);
			time = (System.nanoTime() - start_time) / Math.pow(10, 9);
			System.out.printf("Número Par - Tempo: %f seg.\n", time);
		}
		else {
			double start_time = System.nanoTime();
			for(int i : vetor);
		time = (System.nanoTime() - start_time) / Math.pow(10, 9);
			System.out.printf("Número Ímpar - Tempo: %f seg.\n", time);
		}
	}
}