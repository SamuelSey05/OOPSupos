import java.util.Arrays;

class Main {
	public static int sum(int [] a) {
		int ans = 0;
		for (int i : a) {
			ans += i;
		}
		return ans;
	}

	public static int[] cumsum(int[] a) {
		int [] ans;
		ans = new int[a.length];
		for (int i = 0; i < a.length; i++) {
			ans[i] = sum(Arrays.copyOfRange(a, 0, i));
		}
		return ans;
	}
	public static int[] positives(int[] a) {
		int [] ans;
		ans = new int[0];
		for (int i : a) {
			if (i > 0) {
				ans = new int[ans.length + 1];
				ans[ans.length] = i;
			}
		}
		return ans;
	}
}
