package hust.soict.dsai.test.store.StoreTest;

import hust.soict.dsai.aims.media.Book;
import hust.soict.dsai.aims.media.CompactDisc;
import hust.soict.dsai.aims.media.DigitalVideoDisc;
import hust.soict.dsai.aims.media.Track;
import hust.soict.dsai.aims.store.store.Store;

public class StoreTest {
	public static void main(String[] args) {
		// Tạo các đối tượng Media
		Book book1 = new Book("Java Programming", "Programming", 30.0f);
		book1.addAuthor("John Doe");

		DigitalVideoDisc dvd1 = new DigitalVideoDisc("The Matrix", "Action", "Wachowski", 136, 15.0f);
		DigitalVideoDisc dvd2 = new DigitalVideoDisc("Inception", "Sci-Fi", "Christopher Nolan", 148, 18.0f);

		CompactDisc cd1 = new CompactDisc("Greatest Hits", "Music", 25.0f, 60, "Brian May", "Queen");
		Track track1 = new Track("Bohemian Rhapsody", 6);
		Track track2 = new Track("We Will Rock You", 3);
		cd1.addTrack(track1);
		cd1.addTrack(track2);

		// Tạo đối tượng Store
		Store store = new Store();

		// Thêm các media vào cửa hàng
		store.addMedia(book1);
		store.addMedia(dvd1);
		store.addMedia(dvd2);
		store.addMedia(cd1);

		// In chi tiết cửa hàng
		store.printStoreDetails();

		// Xóa Media khỏi cửa hàng
		store.removeMedia(dvd1);

		// In lại chi tiết cửa hàng
		store.printStoreDetails();

		// Thử xóa một media không tồn tại trong cửa hàng
		store.removeMedia(new DigitalVideoDisc("Non-existing DVD", "Action", "Unknown", 100, 10.0f));

		// Thêm nhiều media vào cửa hàng
		for (int i = 0; i < 10; i++) {
			store.addMedia(new DigitalVideoDisc("Movie " + (i + 1), "Action", "Director", 120, 10.0f));
		}

		// In lại chi tiết cửa hàng sau khi thêm nhiều media
		store.printStoreDetails();
	}

}
