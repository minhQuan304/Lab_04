package hust.soict.dsai.aims.media;

public class DigitalVideoDisc extends Disc implements Playable {

	public DigitalVideoDisc(String title, String category, String director, int length, float cost) {
		super(title, category, cost, length, director); // Call the constructor of Disc (and Media)
	}

	@Override
	public boolean isMatch(String title) {
		return this.getTitle().equalsIgnoreCase(title);
	}

	@Override
	public String toString() {
		return "DVD - " + getTitle() + " - " + getCategory() + " - " + getDirector() + " - " + getLength() + " mins: "
				+ getCost() + " $";
	}

	@Override
	public void play() {
		System.out.println("Playing DVD: " + this.getTitle());
		System.out.println("DVD length: " + this.getLength() + " mins");
	}
}
