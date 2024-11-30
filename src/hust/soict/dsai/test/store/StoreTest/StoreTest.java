package hust.soict.dsai.test.store.StoreTest;

import hust.soict.dsai.aims.media.Book;
import hust.soict.dsai.aims.media.CompactDisc;
import hust.soict.dsai.aims.media.DigitalVideoDisc;
import hust.soict.dsai.aims.store.store.Store;

public class StoreTest {
	public static void main(String[] args) {
		Book book1 = new Book("Java Programming", "Programming", 30.0f);
		book1.addAuthor("John Doe");

		DigitalVideoDisc dvd1 = new DigitalVideoDisc("The Matrix", "Action", "Wachowski", 136, 15.0f);
		DigitalVideoDisc dvd2 = new DigitalVideoDisc("The Matrix", "Action", "Wachowski", 136, 15.0f);

		CompactDisc cd1 = new CompactDisc("Greatest Hits", "Music", 25.0f, 60, "Brian May", "Queen");

		// Tạo đối tượng Store
		Store store = new Store();

		// Thêm các media vào cửa hàng
		System.out.println("Adding media to store...");
		store.addMedia(book1);
		store.addMedia(dvd1); // Thêm lần đầu tiên
		store.addMedia(dvd2); // Thêm lần thứ hai (sẽ thông báo trùng lặp)
		store.addMedia(cd1);

		// In chi tiết cửa hàng
		store.printStoreDetails();

		// Thử thêm một DVD trùng lặp
		System.out.println("\nTrying to add the same DVD again...");
		store.addMedia(dvd1); // Media đã có trong cửa hàng, sẽ không được thêm nữa

		// In lại chi tiết cửa hàng
		store.printStoreDetails();
	}

}
