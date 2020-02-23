package Test100;

public class NumFriendRequests {
    public int numFriend(int[] ages) {
        int n = ages.length;
        int count = 1;
        for (int i = 1; i <= n; i++) {
            count *= i;
        }
        for (int a = 0; a < ages.length - 1; a++) {
            for (int b = a + 1; b < ages.length; b++) {
                if (ages[b] <= 0.5 * ages[a] + 7 &&
                        ages[b] > ages[a] && ages[b] > 100 && ages[a] < 100) {
                    count--;
                }
                if (ages[a] <= 0.5 * ages[b] + 7 &&
                        ages[a] > ages[b] && ages[a] > 100 && ages[b] < 100) {
                    count--;
                }
            }
        }
        return count;
    }
}

