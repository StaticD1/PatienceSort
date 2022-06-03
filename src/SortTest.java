import org.junit.jupiter.api.Test;

import java.util.Random;

public class SortTest {
    private static final long SEED = 123123L;
    private static final long MAX_VAL = Long.MAX_VALUE;
    private static final Random RAND = new Random(SEED);
    private static long start;

    private static long rand(long max) {
        return RAND.nextLong();
    }

    @Test
    void testPatienceSort70000(){
        int n = 70000;
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) { arr[i] = (int) rand(MAX_VAL); }
        System.out.println("Test 1 - 70000 elements");
        start = System.currentTimeMillis();
        System.out.println("Time: " + (System.currentTimeMillis() - start) + " ms");
    }
    @Test
    void testPatienceSort100000(){
        int n = 100000;
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) { arr[i] = (int) rand(MAX_VAL); }
        System.out.println("Test 2 - 100000 elements");
        start = System.currentTimeMillis();
        PatienceSort.patienceSort(arr);
        System.out.println("Time: " + (System.currentTimeMillis() - start) + " ms");
    }
    @Test
    void testPatienceSort500000(){
        int n = 500000;
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) { arr[i] = (int) rand(MAX_VAL); }
        System.out.println("Test 3 - 500000 elements");
        start = System.currentTimeMillis();
        PatienceSort.patienceSort(arr);
        System.out.println("Time: " + (System.currentTimeMillis() - start) + " ms");
    }

    @Test
    void testPatienceSort1000000(){
        int n = 1000000;
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) { arr[i] = (int) rand(MAX_VAL); }
        System.out.println("Test 4 - 1000000 elements");
        start = System.currentTimeMillis();
        PatienceSort.patienceSort(arr);
        System.out.println("Time: " + (System.currentTimeMillis() - start) + " ms");
    }

    @Test
    void testPatienceSort2000000(){
        int n = 2000000;
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) { arr[i] = (int) rand(MAX_VAL); }
        System.out.println("Test 5 - 2000000 elements");
        start = System.currentTimeMillis();
        PatienceSort.patienceSort(arr);
        System.out.println("Time: " + (System.currentTimeMillis() - start) + " ms");
    }

    @Test
    void testPatienceSort5000000(){
        int n = 5000000;
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) { arr[i] = (int) rand(MAX_VAL); }
        System.out.println("Test 6 - 5000000 elements");
        start = System.currentTimeMillis();
        PatienceSort.patienceSort(arr);
        System.out.println("Time: " + (System.currentTimeMillis() - start) + " ms");
    }

    @Test
    void testPatienceSort8000000(){
        int n = 8000000;
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) { arr[i] = (int) rand(MAX_VAL); }
        System.out.println("Test 7 - 8000000 elements");
        start = System.currentTimeMillis();
        PatienceSort.patienceSort(arr);
        System.out.println("Time: " + (System.currentTimeMillis() - start) + " ms");
    }

    @Test
    void testPatienceSort10000000(){
        int n = 10000000;
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) { arr[i] = (int) rand(MAX_VAL); }
        System.out.println("Test 8 - 10000000 elements");
        start = System.currentTimeMillis();
        PatienceSort.patienceSort(arr);
        System.out.println("Time: " + (System.currentTimeMillis() - start) + " ms");
    }

    @Test
    void testPatienceSort15000000(){
        int n = 15000000;
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) { arr[i] = (int) rand(MAX_VAL); }
        System.out.println("Test 9 - 15000000 elements");
        start = System.currentTimeMillis();
        PatienceSort.patienceSort(arr);
        System.out.println("Time: " + (System.currentTimeMillis() - start) + " ms");
    }
    @Test
    void testPatienceSort20000000(){
        int n = 20000000;
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) { arr[i] = (int) rand(MAX_VAL); }
        System.out.println("Test 10 - 20000000 elements");
        start = System.currentTimeMillis();
        PatienceSort.patienceSort(arr);
        System.out.println("Time: " + (System.currentTimeMillis() - start) + " ms");
    }

}