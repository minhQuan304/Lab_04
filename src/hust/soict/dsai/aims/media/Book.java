package hust.soict.dsai.aims.media;

import java.util.ArrayList;

public class Book extends Media {
	private ArrayList<String> authors = new ArrayList<>();

	public Book(String title, String category, float cost) {
		super(title, category, cost);
	}

	public boolean addAuthor(String authorName) {
		if (!authors.contains(authorName)) {
			authors.add(authorName);
			return true;
		}
		return false;
	}

	public boolean removeAuthor(String authorName) {
		if (authors.contains(authorName)) {
			authors.remove(authorName);
			return true;
		}
		return false;
	}

	public ArrayList<String> getAuthors() {
		return authors;
	}

	public boolean isMatch(String title) {
		return getTitle().equalsIgnoreCase(title);
	}

	@Override
	public String toString() {
		return "Book [id=" + getId() + ", title=" + getTitle() + ", category=" + getCategory() + ", cost=" + getCost()
				+ ", authors=" + authors + "]";
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		if (obj == null || getClass() != obj.getClass()) {
			return false;
		}
		if (!super.equals(obj)) {
			return false;
		}
		return true;
	}
}