package hust.soict.dsai.test.disc.TestPassingParameter;

import hust.soict.dsai.aims.media.DigitalVideoDisc;

public class TestPassingParameter {
	public static void main(String[] args) {
		DigitalVideoDisc jungleDVD = new DigitalVideoDisc("jungle", "animation", "roger", 87, 19.95f);
		DigitalVideoDisc cinderellaDVD = new DigitalVideoDisc("cinderella", "animation", "leona", 87, 19.95f);
		swap(jungleDVD, cinderellaDVD);
		System.out.println("jungle dvd title" + jungleDVD.getTitle());
		System.out.println("cinderalla dvd title " + cinderellaDVD.getTitle());
		changeTitle(jungleDVD, cinderellaDVD.getTitle());
		System.out.println("jungle dvd title " + jungleDVD.getTitle());
	}

	public static void swap(DigitalVideoDisc obj1, DigitalVideoDisc obj2) {
		DigitalVideoDisc tmp = obj1;
		obj1 = obj2;
		obj2 = tmp;
	}

	public static void changeTitle(DigitalVideoDisc dvd, String title) {
		String oldTitle = dvd.getTitle();
		dvd.setTitle(title);
	}

}
