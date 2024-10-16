package Generic;

public class Pair <T,U> {
    T first;
    U second;

    Pair(T first, U second) {
        this.first = first;
        this.second = second;
    }

    public T getFirst() {
        return first;
    }

    public U getSecond() {
        return second;
    }

    @Override
    public String toString() {
        return "Pair:\n" +
                "\t\tfirst = " + first +
                "\n\t\tsecond = " + second;
    }
}
