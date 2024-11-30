package hust.soict.dsai.aims.media;

public abstract class Media {
	private static int nbMedia = 0; // Static counter to track the number of media (including discs)
	private int id;
	private String title;
	private String category;
	private float cost;

	public Media(String title, String category, float cost) {
		this.id = ++nbMedia; // Increment the counter and assign it to the new media item
		this.title = title;
		this.category = category;
		this.cost = cost;
	}

	// Getter and Setter methods
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
}
