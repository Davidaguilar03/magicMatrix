package view;

import java.util.*;

import javax.swing.JOptionPane;

public class IoManager {
	private Scanner sc;

	public IoManager() {
		sc = new Scanner(System.in);
	}
	public void showGraficMessage(String message) {
		JOptionPane.showMessageDialog(null, message);
	}
	public short readGraficShort(String message) {
		return Short.parseShort(JOptionPane.showInputDialog(message));
	}
	
	public void showMessage(String message) {
		System.out.println(message);
	}

	public short readShort(String message) {
		System.out.println(message);
		short s = this.sc.nextShort();
		return s;
	}

	public int readInt(String message) {
		System.out.println(message);
		int i = this.sc.nextInt();
		return i;
	}

	public double readDouble(String message) {
		System.out.println(message);
		double d = this.sc.nextDouble();
		return d;
	}

	public String readString(String message) {
		System.out.println(message);
		return sc.next();
	}
	public String readStringLine(String message) {
		System.out.println(message);
		sc.nextLine();
		return sc.nextLine();
	}

	public byte readByte(String message) {
		System.out.println(message);
		return sc.nextByte();
	}

	public long readLong(String message) {
		System.out.println(message);
		return sc.nextLong();
	}

	public float readFloat(String message) {
		System.out.println(message);
		return sc.nextFloat();
	}

	public boolean readBoolean(String message) {
		System.out.println(message);
		return sc.nextBoolean();
	}
}
