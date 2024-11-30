package hust.soict.dsai.aims.aims;

import hust.soict.dsai.aims.media.CompactDisc;
import hust.soict.dsai.aims.media.Track;

public class Aims {
	public static void main(String[] args) {

		// Tạo 2 đối tượng Track với cùng tiêu đề và độ dài
		Track track1 = new Track("Java Programming Track", 10);
		Track track2 = new Track("Java Programming Track", 10);

		// Tạo một CompactDisc và thêm track vào
		CompactDisc cd = new CompactDisc("Java Programming CD", "Programming", 50.0f, 120, "John Doe", "Artist1");
		cd.addTrack(track1); // Được thêm vào CD
		cd.addTrack(track2); // Không được thêm vào vì equals sẽ trả về true (cùng title và length)

		// In chi tiết của CompactDisc
		System.out.println(cd.toString());
		System.out.println("Tracks on the CD:");
		for (Track track : cd.getTracks()) {
			System.out.println(track.getTitle() + " (" + track.getLength() + " mins)");
		}
	}
}
