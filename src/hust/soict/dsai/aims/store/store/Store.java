package hust.soict.dsai.aims.store.store;

import java.util.ArrayList;
import java.util.List;

import hust.soict.dsai.aims.media.Media;

public class Store {
	private ArrayList<Media> itemsInStore;

	public Store() {
		itemsInStore = new ArrayList<>();
	}

	public void addMedia(Media media) {
		if (!itemsInStore.contains(media)) {
			itemsInStore.add(media);
			System.out.println("Media '" + media.getTitle() + "' has been added.");
		} else {
			System.out.println("Media '" + media.getTitle() + "' is already in the store.");
		}
	}

	public void removeMedia(Media media) {
		if (itemsInStore.remove(media)) {
			System.out.println("Media '" + media.getTitle() + "' has been removed from the store.");
		} else {
			System.out.println("Media '" + media.getTitle() + "' is not found in the store.");
		}
	}

	public List<Media> getItemsInStore() {
		return itemsInStore;
	}

	public void printStoreDetails() {
		System.out.println("***********************STORE***********************");
		System.out.println("Items in Store: ");
		if (itemsInStore.isEmpty()) {
			System.out.println("No items available in the store.");
		} else {
			for (int i = 0; i < itemsInStore.size(); i++) {
				Media media = itemsInStore.get(i);
				System.out.println((i + 1) + ". " + media.toString());
			}
		}
		System.out.println("***************************************************");
	}
}
