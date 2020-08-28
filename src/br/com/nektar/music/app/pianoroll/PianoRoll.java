package br.com.nektar.music.app.pianoroll;

import java.util.List;

import org.jfugue.player.Player;

import br.com.nektar.music.app.Note;

public class PianoRoll {
	
	public void play(List<Note> music) {
		Player player = new Player();
		StringBuilder musicNotes = new StringBuilder();
		music.forEach(n -> musicNotes.append(n.simbol() + " "));
		player.play(musicNotes.toString());
	}
}
