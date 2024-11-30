package hust.soict.dsai.aims.aims;

import hust.soict.dsai.aims.cart.Cart.Cart;
import hust.soict.dsai.aims.media.Book;
import hust.soict.dsai.aims.media.CompactDisc;
import hust.soict.dsai.aims.media.DigitalVideoDisc;
import hust.soict.dsai.aims.media.Track;

public class Testcart {
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

		// Tạo đối tượng Cart
		Cart cart = new Cart();

		// Thêm các media vào giỏ hàng
		cart.addMedia(book1);
		cart.addMedia(dvd1);
		cart.addMedia(dvd2);
		cart.addMedia(cd1);

		// In chi tiết giỏ hàng
		cart.printCartDetails();

		// Tìm kiếm theo ID
		cart.searchById(1); // Tìm Book theo ID

		// Tìm kiếm theo tên
		cart.searchByTitle("The Matrix"); // Tìm DVD theo tên

		// Xóa Media khỏi giỏ hàng
		cart.removeMedia(dvd1);

		// In lại chi tiết giỏ hàng
		cart.printCartDetails();

		// Thử thêm media khi giỏ hàng đã đầy (vì MAX_NUM_ORDERED = 20, bạn có thể thêm
		// thử một số media)
		for (int i = 0; i < 20; i++) {
			cart.addMedia(new DigitalVideoDisc("Movie " + (i + 1), "Action", "Director", 120, 10.0f));
		}
	}
}
