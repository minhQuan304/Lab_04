package hust.soict.dsai.aims.aims;

import hust.soict.dsai.aims.cart.Cart.Cart;
import hust.soict.dsai.aims.media.Book;
import hust.soict.dsai.aims.media.DigitalVideoDisc;
import hust.soict.dsai.aims.media.Media;

public class Aims {
	public static void main(String[] args) {

		Cart cart = new Cart();

		Media book1 = new Book("Java Programming", "Programming", 50.0f);
		Media book2 = new Book("Python Programming", "Programming", 45.0f);
		Media dvd = new DigitalVideoDisc("Java Programming", "Education", "Author A", 120, 30.0f);

		cart.addMedia(book1);
		cart.addMedia(book2);
		cart.addMedia(dvd);

		System.out.println("Before sorting:");
		cart.printCartDetails();

		// Sắp xếp theo tiêu đề và giá
		cart.sortByTitleCost();
		System.out.println("\nAfter sorting by title then cost:");
		cart.printCartDetails();

		// Sắp xếp theo giá và tiêu đề
		cart.sortByCostTitle();
		System.out.println("\nAfter sorting by cost then title:");
		cart.printCartDetails();
	}
}
