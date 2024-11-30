package hust.soict.dsai.aims.media;

import java.util.Comparator;

import hust.soict.dsai.test.aim.sort.MediaComparatorByCostTitle;
import hust.soict.dsai.test.aim.sort.MediaComparatorByTitleCost;

public abstract class Media {
	private static int nbMedia = 0; // Static counter to track the number of media (including discs)
	private int id;
	private String title;
	private String category;
	private float cost;

	public Media(String title, String category, float cost) {
		this.id = ++nbMedia;
		this.title = title;
		this.category = category;
		this.cost = cost;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	public float getCost() {
		return cost;
	}

	public void setCost(float cost) {
		this.cost = cost;
	}

	public boolean isMatch(String title) {
		return this.title.equalsIgnoreCase(title);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		if (obj == null || getClass() != obj.getClass()) {
			return false;
		}
		Media other = (Media) obj;
		return this.title.equalsIgnoreCase(other.title);
	}

	public static final Comparator<Media> COMPARE_BY_TITLE_COST = new MediaComparatorByTitleCost();
	public static final Comparator<Media> COMPARE_BY_COST_TITLE = new MediaComparatorByCostTitle();

}
