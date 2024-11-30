package hust.soict.dsai.test.aim.sort;

import java.util.Comparator;

import hust.soict.dsai.aims.media.Media;

public class MediaComparatorByTitleCost implements Comparator<Media> {
	@Override
	public int compare(Media m1, Media m2) {
		// So sánh theo tiêu đề trước
		int titleComparison = m1.getTitle().compareToIgnoreCase(m2.getTitle());
		if (titleComparison == 0) {
			// Nếu tiêu đề giống nhau, so sánh theo cost (giảm dần)
			return Float.compare(m2.getCost(), m1.getCost());
		}
		return titleComparison;
	}
}