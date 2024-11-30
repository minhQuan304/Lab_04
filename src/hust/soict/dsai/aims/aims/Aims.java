package hust.soict.dsai.aims.aims;

import java.util.ArrayList;

import hust.soict.dsai.aims.media.Book;
import hust.soict.dsai.aims.media.DigitalVideoDisc;
import hust.soict.dsai.aims.media.Media;

public class Aims {
	public static void main(String[] args) {

		ArrayList<Media> mediaList = new ArrayList<>();

		// Thêm Book và DigitalVideoDisc vào danh sách
		Media book1 = new Book("Clean Code", "Programming", 39.99f);
		Media book2 = new Book("The Pragmatic Programmer", "Programming", 45.0f);
		Media dvd = new DigitalVideoDisc("Inception", "Science Fiction", "Christopher Nolan", 148, 19.99f);

		mediaList.add(book1);
		mediaList.add(book2);
		mediaList.add(dvd);

		// Duyệt qua danh sách và in thông tin của từng Media
		for (Media media : mediaList) {
			System.out.println(media.toString());
		}
	}
}
