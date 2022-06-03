import java.util.*;

public class PatienceSort {
    public static void patienceSort (int [] n)  {
        List piles = new ArrayList<>();

        // 1 шаг - раскладываем по стопкам
        for (int x : n) {
            Pile newPile = new Pile();
            newPile.push(x);
            int i = Collections.binarySearch(piles, newPile);
            if (i < 0) {
                i = -(i+1);
            }
            if (i != piles.size()) {
                Pile pile = (Pile) piles.get(i);
                pile.push(x);
            } else {
                piles.add(newPile);
            }
        }

        // 2 шаг - извлекаем элементы с минимальной вершиной, используя приоритетную очередь
        PriorityQueue<Pile> heap = new PriorityQueue<>(piles);
        for (int c = 0; c < n.length; c++) {
            Pile smallPile = heap.poll();
            n[c] = (int) smallPile.pop();
            if (!smallPile.isEmpty()) {
                heap.offer(smallPile);
            }
        }
        assert(heap.isEmpty());
    }
}
