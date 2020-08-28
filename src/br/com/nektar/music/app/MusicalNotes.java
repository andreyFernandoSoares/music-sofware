package br.com.nektar.music.app;

import java.util.HashMap;
import java.util.Map;

import br.com.nektar.music.app.notes.*;

public class MusicalNotes {
	
	private static Map<String, Note> notes = new HashMap<>();
	
	static {
		//Not #
		notes.put("C", new C()); //DO
		notes.put("D", new D()); //RE
		notes.put("E", new E()); //MI
		notes.put("F", new F()); //FA
		notes.put("G", new G()); //SOL
		notes.put("A", new A()); //LA
		notes.put("B", new B()); //SI 
		
		//#
		notes.put("C#", new CSharp()); //DO Sustenido
		notes.put("D#", new DSharp()); //RE Sustenido
		notes.put("E#", new ESharp()); //MI Sustenido
		notes.put("F#", new FSharp()); //FA Sustenido
		notes.put("G#", new GSharp()); //SOL Sustenido
		notes.put("A#", new ASharp()); //LA Sustenido
		notes.put("B#", new BSharp()); //SI Sustenido
	}
	
	public Note getNote(String note) {
		return notes.get(note);
	}
}
