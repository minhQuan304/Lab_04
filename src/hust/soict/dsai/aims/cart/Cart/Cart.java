package hust.soict.dsai.aims.cart.Cart;

import java.util.ArrayList;

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
			itemsOrdered.add(media);
			System.out.println("The media has been added.");
		}
	}

	public void addMedia(Media[] mediaList) {
		for (Media media : mediaList) {
			if (itemsOrdered.size() == MAX_NUM_ORDERED) {
				System.out.println("The cart is full.");
				break;
			}
			itemsOrdered.add(media);
			System.out.println("The media has been added.");
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
