package hust.soict.dsai.test.aim.sort;

import java.util.Comparator;

import hust.soict.dsai.aims.media.Media;

public class MediaComparatorByCostTitle implements Comparator<Media> {
	@Override
	public int compare(Media m1, Media m2) {
		// So sánh theo cost trước (giảm dần)
		int costComparison = Float.compare(m2.getCost(), m1.getCost());
		if (costComparison == 0) {
			// Nếu cost giống nhau, so sánh theo tiêu đề (alphabet)
			return m1.getTitle().compareToIgnoreCase(m2.getTitle());
		}
		return costComparison;
	}
}