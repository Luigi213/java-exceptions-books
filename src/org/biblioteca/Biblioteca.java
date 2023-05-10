package org.biblioteca;

import java.io.File;
import java.io.FileWriter;
import java.util.Scanner;

import org.book.Libro;

public class Biblioteca {
	private static final String FILENAME = "C:\\Users\\reyes\\tmp\\text.txt";
	public static void main(String[] args) {
		setLibroFile();
		getFile();
		
		System.out.println("The end");
	}	
	public static void setLibroFile() {
		Scanner in = new Scanner(System.in);
		
		System.out.println("Inserire il numero di libri");
		int num = in.nextInt();
		
		Libro[] libArr = new Libro[num];
		
		in.nextLine();
		for(int i=0; i<num; i++) {
			
			System.out.println("Nome del libro?");
			String nome = in.nextLine();
			System.out.println("Numero di pagine del libro?");
			int numPag = in.nextInt();
			in.nextLine();
			System.out.println("Nome dell'autore del libro?");
			String autore = in.nextLine();
			System.out.println("Editoria del libro?");
			String editoria = in.nextLine();
			try {
				Libro libro = new Libro(nome, numPag, autore, editoria);
				libArr[i] = libro;
			} catch (Exception e) {
				i--;
				System.err.println("Errore nella lettura del libro, " + e.getMessage());
			}
		}
		
		
		
		try {
			FileWriter myWriter = new FileWriter(FILENAME);
			for(int i=0; i<libArr.length; i++) {
				
				Libro l = libArr[i];
				
				myWriter.write("[" + i + "]" + l + "\n" + "\n");
				
			}
			
			myWriter.close();
			
			
		} catch (Exception e ) {
			System.err.println("Errore nella creazione di Libro\n" + e.getMessage());
		}
	}
	public static void getFile() {
		try {
			
			File mioFile = new File(FILENAME);
			Scanner reader = new Scanner(mioFile);
			 
			while (reader.hasNextLine()) {
				
			   String data = reader.nextLine();
			   
			   
			   System.out.println("----------------------");
			   System.out.println(data);
			}

			reader.close();
		} catch (Exception e) {
			
			System.err.println("Errore nella lettura di nominativi.txt\n" + e.getMessage());
		}
	}
}
