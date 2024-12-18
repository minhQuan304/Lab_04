package hust.soict.dsai.aims.media;

import java.util.ArrayList;

public class CompactDisc extends Disc implements Playable {
	private String artist;
	private ArrayList<Track> tracks;

	public CompactDisc(String title, String category, float cost, int length, String director, String artist) {
		super(title, category, cost, length, director);
		this.artist = artist;
		this.tracks = new ArrayList<>();
	}

	public String getArtist() {
		return artist;
	}

	public void setArtist(String artist) {
		this.artist = artist;
	}

	public ArrayList<Track> getTracks() {
		return tracks;
	}

	public void addTrack(Track track) {
		if (!tracks.contains(track)) {
			tracks.add(track);
			System.out.println("Track '" + track.getTitle() + "' has been added.");
		} else {
			System.out.println("Track '" + track.getTitle() + "' is already in the CD.");
		}
	}

	public void removeTrack(Track track) {
		if (tracks.remove(track)) {
			System.out.println("Track " + track.getTitle() + " has been removed.");
		} else {
			System.out.println("Track " + track.getTitle() + " not found in the CD.");
		}
	}

	@Override
	public boolean isMatch(String title) {
		return this.getTitle().equalsIgnoreCase(title);
	}

	@Override
	public String toString() {
		return "CD - " + getTitle() + " - " + getCategory() + " - " + getArtist() + " - " + getLength() + " mins: "
				+ getCost() + " $";
	}

	@Override
	public void play() {
		System.out.println("Playing CD: " + this.getTitle());
		System.out.println("CD length: " + this.getLength() + " mins");

		// Phát từng track trong danh sách
		for (Track track : tracks) {
			track.play();
		}
	}
}
