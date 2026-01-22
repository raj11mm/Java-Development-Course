import java.util.*;

class MergeArrays {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s1 = scan.nextLine().trim();

        String s2 = scan.nextLine().trim();

        s1=s1.replaceAll("[\\[\\],]", "");

        s2=s2.replaceAll("[\\[\\],]", "");

        String str1[]=s1.split(" ");

        String str2[] = s2.split(" ");
        int arr[] = new int[str1.length + str2.length];
        int j=0;
        for(int i=0;i<=str1.length-1;i++) {
            arr[j]=Integer.parseInt(str1[i]);
            j++;

        }
        for(int i=0;i<=str2.length-1;i++) {
            arr[j]=Integer.parseInt(str2[i]);
            j++;
        }

        bubbleSort(arr);

        System.out.println(Arrays.toString(arr));


    }



    public static void bubbleSort(int arr[]) {

        for(int i=0;i<=arr.length-2;i++) {

            for(int j=0;j<=arr.length-2-i;j++) {

                if(arr[j]>arr[j+1] ) {

                    int temp = arr[j];

                    arr[j]=arr[j+1];

                    arr[j+1]=temp;

                }
            }
        }
    }
}