
public class SearchRotatedSortedArray {

	public int search(int a[], int l, int u, int x) {
		while (l <= u) {
			int m = (l + u) / 2;
			if (x == a[m]) {
				return m;
			} else if (a[l] <= a[m]) {
				if (x > a[m]) {
					l = m+1;
				} else if (x >=a [l]) {
					u = m-1;
				} else {
					l = m+1;
				}
			}
			else if (x < a[m]) u = m-1;
			else if (x <= a[u]) l = m+1;
			else u = m - 1;
		}
		return -1;
	}
}
