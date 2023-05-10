package org.book;

public class Libro {
	private String libro;
	private int numPag;
	private String autore;
	private String editore;
	
	public Libro(String libro, int numPag, String autore, String editore) throws Exception {
		setLibro(libro);
		setNumPag(numPag);
		setAutore(autore);
		setEditore(editore);
	}

	public String getLibro() {
		return libro;
	}
	public void setLibro(String libro) throws Exception {
		if(libro.length() == 0) {
			throw new Exception("Il libro deve avere un titolo");
		}
		this.libro = libro;
	}
	public int getNumPag() {
		return numPag;
	}
	public void setNumPag(int numPag) throws Exception {
		if(numPag <= 0) {
			throw new Exception("Il numero di pagine non e' definito");
		}
		this.numPag = numPag;
	}
	public String getAutore() {
		return autore;
	}
	public void setAutore(String autore) throws Exception {
		if(autore.length() == 0) {
			throw new Exception("Il libro deve avere un titolo");
		}
		this.autore = autore;
	}
	public String getEditore() {
		return editore;
	}
	public void setEditore(String editore) {
		this.editore = editore;
	}
	public String getFullName() {
		return "libro: " + getLibro() + "autore: " + getAutore();
	}
	
	@Override
	public String toString() {
		return "libro: " + getLibro()
		 		+ "\nnumero di pagine: " + getNumPag()
		 		+ "\nautore: " + getAutore()
		 		+ "\neditore: " + getEditore();
	}
}
