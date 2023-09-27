package model;


public class Chess {
	public final static int TAM=8; 
	private int[][] board;
	private Cell [] moves;
	
	public Chess() {
		board= new int[TAM][TAM];
	
		for (int i = 0; i < board.length; i++) {
			for (int j = 0; j < board.length; j++) {
				board[i][j]='B';
 			}
		}
	}
	public String showBoard() {
		String outBoard= "   A|B|C|D|E|F|G|H\n";
		board[3][4]='C';
		board[7][2]='A';
		for (int i = 0; i < board.length; i++) {
			outBoard+=(TAM-i)+" ";
			for (int j = 0; j < board.length; j++) {
				outBoard+= (char)board[i][j]+"|";
			}
			outBoard+="\n";
		}
		return outBoard;
	}
	
	public int getRandom(int min,int max) {
		return (int)(Math.random()*(max+1)- min)+min;
	}

	public int[][] getBoard() {
		return board;
	}

	public void setBoard(int[][] board) {
		this.board = board;
	}

	

}
