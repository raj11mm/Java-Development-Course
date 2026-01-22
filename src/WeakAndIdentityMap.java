import java.util.*;
public class WeakAndIdentityMap {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        WeakHashMap<Integer, String> wm = new WeakHashMap<>();
        System.out.println("Enter the number of users: ");
        int n = sc.nextInt();

        for(int i = 0; i < n; i++) {
            int tokenId = sc.nextInt();
            String tokenValue = sc.next();
            wm.put(tokenId, tokenValue);
            System.out.println("Added Token: " + tokenId + " -> " + tokenValue);
        }
        System.out.println("All active session");
        for(Map.Entry<Integer, String> r : wm.entrySet()) {
            System.out.println(r.getKey() + " -> " + r.getValue());
        }
        System.out.println("Enter tokenId to check: ");
        int checkToken = sc.nextInt();
        System.out.println("TokenId " + checkToken + " exists: " + wm.containsKey(checkToken));

        IdentityHashMap<Integer, String> im = new IdentityHashMap<>();
        System.out.println("Enter the number of users: ");
        int m = sc.nextInt();
        for(int i = 0; i < m; i++) {
            int id = sc.nextInt();
            String name = sc.next();
            im.put(id, name);
            System.out.println("Added user: " + id + " -> " + name);

        }
        System.out.println("All active users:");
        for(Map.Entry<Integer, String> i : im.entrySet()) {
            System.out.println(i.getKey() + " -> " + i.getValue());
        }

        System.out.println("Are two users with same data identical: " + im.containsKey(1));
    }
}
