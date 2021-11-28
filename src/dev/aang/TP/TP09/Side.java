package dev.aang.TP.TP09;

public class Side <T, U> {

    private T left;
    private U right;

    public Side(T left, U right) {
        setLeft(left);
        setRight(right);
    }

    public T getLeft() {
        return left;
    }

    public void setLeft(T left) {
        this.left = left;
    }

    public U getRight() {
        return right;
    }

    public void setRight(U right) {
        this.right = right;
    }

    public void info() {
        System.out.printf("Left type: %s\n", getLeft().getClass());
        System.out.printf("Left value: %s\n", getLeft());
        System.out.printf("Right type: %s\n", getRight().getClass());
        System.out.printf("Right value: %s\n\n", getRight());
    }
}

