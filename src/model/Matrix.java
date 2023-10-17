package model;

public class Matrix {
	private int matrix[][];

	// Crear la matriz
	public Matrix() {
		int[][] matrix={{2,7,6},{9,5,1},{4,3,8}};
		this.matrix=matrix;
	}

	// Mostrar la matriz
	public String showMatrix() {
		
		//Parte Superior
		String showMatrix = "╔";
		for (int k = 0; k < matrix.length - 1; k++) {
			showMatrix += "═══╦";
		}
		showMatrix += "═══╗\n║";

		//Numeros
		for (int i = 0; i < this.matrix.length; i++) {
			for (int j = 0; j < this.matrix.length; j++) {
				showMatrix +=" "+matrix[i][j]+" ║";
			}
			if(i<this.matrix.length-1) {
			showMatrix +="\n╠";
			for (int j = 0; j < matrix.length-1; j++) {
				showMatrix+="═══╬";
			}
			showMatrix+="═══╣\n║";
			}
		}
		//Parte inferior
		showMatrix+="\n╚";
		for (int a = 0; a < matrix.length - 1; a++) {
			showMatrix += "═══╩";
		}
		showMatrix += "═══╝";

		return showMatrix;
	}

	// Comprobar si es magica
	public boolean isMagicMatrix() {
		boolean isMagicMatrix = false;
		int a = 0;
		int b = 0;
		int c = 0;
		int d = 0;

		for (int j = 0; j < matrix.length; j++) {
			a += matrix[0][j];
		}
		for (int i = 0; i < matrix.length; i++) {
			b += matrix[i][0];
		}
		for (int i = 0; i < matrix.length; i++) {
			c += matrix[i][i];
		}
		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix.length; j++) {
				if (i + j == matrix.length - 1) {
					d += matrix[i][j];
				}
			}
		}
		if (a == b && b == c && c == d) {
			isMagicMatrix = true;
		}
		return isMagicMatrix;
	}

}
