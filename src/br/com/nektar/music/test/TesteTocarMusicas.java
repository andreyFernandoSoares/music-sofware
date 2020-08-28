package br.com.nektar.music.test;

import java.util.List;

import br.com.nektar.music.app.MusicalNotes;
import br.com.nektar.music.app.Note;
import br.com.nektar.music.app.pianoroll.PianoRoll;

public class TesteTocarMusicas {
	
	public static void main(String[] args) {
		
		MusicalNotes notes = new MusicalNotes();
		
		List<Note> music = List.of(notes.getNote("C"),
				notes.getNote("D"),
				notes.getNote("E"),
				notes.getNote("F"),
				notes.getNote("F"),
				notes.getNote("F"),
				
				notes.getNote("C"),
				notes.getNote("D"),
				notes.getNote("C"),
				notes.getNote("D"),
				notes.getNote("D"),
				notes.getNote("D"),
				
				notes.getNote("C"),
				notes.getNote("G"),
				notes.getNote("F"),
				notes.getNote("E"),
				notes.getNote("E"),
				notes.getNote("E"),
				
				notes.getNote("C"),
				notes.getNote("D"),
				notes.getNote("E"),
				notes.getNote("F"),
				notes.getNote("F"),
				notes.getNote("F"));
		
		PianoRoll piano = new PianoRoll();
		piano.play(music);
	}
}
