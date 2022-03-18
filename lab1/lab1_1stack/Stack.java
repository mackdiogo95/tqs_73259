import java.util.ArrayList;
import java.util.NoSuchElementException;

class Stack<T> {

    ArrayList<T> A;

    int top = -1;
    int size;

    Stack(int size) {
        this.size = size;

        this.A = new ArrayList<T>(size);
    }


    void push(T X) {
        if (top + 1 == size) {
            throw new IllegalStateException("Cannot add to full stack");
        }
        else {
            top = top + 1;
            if (A.size() > top)
                A.set(top, X);
            else
                A.add(X);
        }
    }

    T pop() {
        if (top == -1) {
            throw new NoSuchElementException("Cannot pop from empty stack");
        }
        else{

            T object = peek();
            top--;
            return object;
        }

    }


    T peek() {
        if (top == -1) {
            throw new NoSuchElementException("Cannot peek into empty stack");
        }
        else
            return A.get(top);
    }

    public int size() {
        return top+1;
    }

    boolean isEmpty() { return top == -1; }

}



