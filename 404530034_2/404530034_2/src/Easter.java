
public class Easter {
	public String calculateEaster(int aYear) {
		// 這樣的寫法並沒有錯, 只是會降低程式易讀性, 對於後續maintain會有一些影響喔!
		// Math.floor(),-2
		int a = aYear % 19, b = aYear % 4, c = aYear % 7, k = (aYear / 100), p = ((13 + 8 * k) / 25), q = (k / 4),
				M = (15 - p + k - q) % 30, N = (4 + k - q) % 7, d = (19 * a + M) % 30,
				e = (2 * b + 4 * c + 6 * d + N) % 7, m1, m2;
		if (d + e <= 9) {
			m1 = d + e + 22;
			return "In" + aYear + ", Easter Sunday is: month = 3" + "and day = " + m1;
		} else {
			m2 = d + e - 9;
			
			// 缺少兩個判斷式, 實作不完全喔! -5
			// if d = 29 and e = 6, replace 26 April with 19 April
			// if d = 28, e = 6, and (11M + 11) mod 30 < 19, replace 25 April
			// with 18 April

			return "In" + aYear + ", Easter Sunday is: month = 4" + "and day = " + m2;
		}
	}

}
