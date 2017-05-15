import java.util.*;

public class Lab5_732 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the size of the list: ");
        int[] list = new int[scanner.nextInt()];
       
        System.out.print("Enter the list: ");
        for (int i = 0; i < list.length; i++) {
            list[i] = scanner.nextInt();
        }
        partition(list);
        System.out.print("After the partition, the list is "+ Arrays.toString(list));
        
    }

    public static int[] partition(int[] list) {
        int i = 0;
        for (int j = 1; j < list.length; j++) {
            if (list[j] < list[i]){
                int temp = list[j];
                System.arraycopy(list, i, list, i + 1, j - i);
                list[i] = temp;
                i++;
            }
        }
        return i;
    }
}