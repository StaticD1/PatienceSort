import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] first = {10,9,8,7,6,5,4,3,2,1,0};
        PatienceSort.patienceSort(first);
        System.out.println(Arrays.toString(first));
        int[] second = {-10000000,1000000,0, -5, -1, 10, 2};
        PatienceSort.patienceSort(second);
        System.out.println(Arrays.toString(second));
    }
}
