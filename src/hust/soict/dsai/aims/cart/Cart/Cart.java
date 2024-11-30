package hust.soict.dsai.aims.cart.Cart;

import java.util.ArrayList;
import java.util.Collections;

import hust.soict.dsai.aims.media.Media;

public class Cart {
	private ArrayList<Media> itemsOrdered = new ArrayList<Media>(); // List chứa Media
	private final int MAX_NUM_ORDERED = 20;

	public Cart() {
	}

	public void addMedia(Media media) {
		if (itemsOrdered.size() == MAX_NUM_ORDERED) {
			System.out.println("The cart is full.");
		} else {
			if (!itemsOrdered.contains(media)) {
				itemsOrdered.add(media);
				System.out.println("The media has been added.");
			} else {
				System.out.println("The media is already in the cart.");
			}
		}
	}

	public void addMedia(Media[] mediaList) {
		for (Media media : mediaList) {
			if (itemsOrdered.size() == MAX_NUM_ORDERED) {
				System.out.println("The cart is full.");
				break;
			}
			if (!itemsOrdered.contains(media)) {
				itemsOrdered.add(media);
				System.out.println("The media has been added.");
			} else {
				System.out.println("The media is already in the cart.");
			}
		}
	}

	public void removeMedia(Media media) {
		if (itemsOrdered.remove(media)) {
			System.out.println("The media has been removed.");
		} else {
			System.out.println("The media is not found in the cart.");
		}
	}

	public float totalCost() {
		float total = 0;
		for (Media media : itemsOrdered) {
			total += media.getCost();
		}
		return total;
	}

	public void sortByTitleCost() {
		Collections.sort(itemsOrdered, Media.COMPARE_BY_TITLE_COST);
		System.out.println("Cart has been sorted by title then cost.");
	}

	public void sortByCostTitle() {
		Collections.sort(itemsOrdered, Media.COMPARE_BY_COST_TITLE);
		System.out.println("Cart has been sorted by cost then title.");
	}

	public void printCartDetails() {
		System.out.println("***********************CART***********************");
		System.out.println("Ordered Items: ");
		for (int i = 0; i < itemsOrdered.size(); i++) {
			Media media = itemsOrdered.get(i);
			System.out.println((i + 1) + ". " + media.toString());
		}
		System.out.println("Total cost: " + totalCost());
		System.out.println("***************************************************");
	}

	// Tìm kiếm theo ID
	public void searchById(int id) {
		boolean found = false;
		for (Media media : itemsOrdered) {
			if (media.getId() == id) {
				System.out.println("Found media: " + media.toString());
				found = true;
				break;
			}
		}
		if (!found) {
			System.out.println("No media found with ID: " + id);
		}
	}

	public void searchByTitle(String title) {
		boolean found = false;
		for (Media media : itemsOrdered) {
			if (media.isMatch(title)) {
				System.out.println("Found media: " + media.toString());
				found = true;
			}
		}
		if (!found) {
			System.out.println("No media found with title: " + title);
		}
	}
}
