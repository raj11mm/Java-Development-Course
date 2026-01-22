import java.util.*;
public class MaximumMeetingInOneRoom {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] start = new int[n];
        int[] end = new int[n];

        for(int i = 0; i < n; i++) {
            start[i] = sc.nextInt();
        }

        for(int i = 0; i < n; i++) {
            end[i] = sc.nextInt();
        }
        System.out.println(maxMeeting(start, end));
    }

    static int maxMeeting(int[] start, int[] end) {
        int count = 1;
        int endTime = end[0];
        for(int i = 1; i < start.length; i++) {
            if(start[i] >= endTime) {
                count++;
                endTime = end[i];
            }
        }
        return count;
    }
}
