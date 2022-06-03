import java.util.Stack;

class Pile<E extends Comparable<? super E>> extends Stack<E> implements Comparable<Pile<E>> {
    public int compareTo(Pile<E> y) {
        return peek().compareTo(y.peek());
    }
}
