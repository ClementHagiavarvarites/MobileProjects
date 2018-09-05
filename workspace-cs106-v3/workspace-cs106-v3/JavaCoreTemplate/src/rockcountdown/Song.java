package rockcountdown;

import static sbcc.Core.*;
import static java.lang.System.*;
import static org.apache.commons.lang3.StringUtils.*;

public class Song {
	int rank;
	String title;
	String artist;


	public Song(int ranking, String name, String writer) {
		rank = ranking;
		title = name;
		artist = writer;
	}


	public Song(String song) {
		rank = Integer.parseInt(song.split("\t")[0]);
		title = song.split("\t")[1];
		artist = song.split("\t")[2];
	}


	public int getRank() {
		return rank;
	}


	public void setRank(int rank) {
		this.rank = rank;
	}


	public String getTitle() {
		return title;
	}


	public void setTitle(String title) {
		this.title = title;
	}


	public String getArtist() {
		return artist;
	}


	public void setArtist(String artist) {
		this.artist = artist;
	}
}