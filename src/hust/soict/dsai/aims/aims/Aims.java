package hust.soict.dsai.aims.aims;

import hust.soict.dsai.aims.media.CompactDisc;
import hust.soict.dsai.aims.media.DigitalVideoDisc;
import hust.soict.dsai.aims.media.Track;

public class Aims {
	public static void main(String[] args) {

		Track track1 = new Track("Track 1", 3);
		Track track2 = new Track("Track 2", 4);

		CompactDisc cd = new CompactDisc("The Best of Music", "Music", 15.99f, 60, "Various Artists",
				"Various Artists");
		cd.addTrack(track1);
		cd.addTrack(track2);

		DigitalVideoDisc dvd = new DigitalVideoDisc("Inception", "Sci-Fi", "Christopher Nolan", 148, 19.99f);

		System.out.println("********** Play CompactDisc **********");
		cd.play();

		System.out.println("********** Play DigitalVideoDisc **********");
		dvd.play();
		System.out.println("********** Play Track **********");
		track1.play();

		System.out.println("\n********** Cart Contents **********");
		System.out.println(cd.toString());
		System.out.println(dvd.toString());
	}
}