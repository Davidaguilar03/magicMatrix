package controller;

import model.*;
import view.IoManager;

public class Control {
	private IoManager io;

	public Control() {
		io = new IoManager();
	}

	public void init() {
		Matrix matrix = new Matrix();
		io.showMessage(matrix.showMatrix());
		io.showMessage(matrix.isMagicMatrix() ? "Si es una matriz magica" : "No es una matriz magica");
	}
}
