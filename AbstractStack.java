public abstract class AbstractStack {
    protected int[] stackArray;
    protected int top;
    protected int maxSize;

    public AbstractStack(int size) {
        maxSize = size;
        stackArray = new int[maxSize];
        top = -1;
    }

    public abstract void push(int value);
    public abstract int pop();
    public abstract int peek();
    public abstract boolean isEmpty();
    public abstract boolean isFull();
}
public class ConcreteStack extends AbstractStack {

    public ConcreteStack(int size) {
        super(size);
    }

    @Override
    public void push(int value) {
        if (!isFull()) {
            stackArray[++top] = value;
        } else {
            System.out.println("Stack is full. Cannot push " + value);
        }
    }

    @Override
    public int pop() {
        if (!isEmpty()) {
            return stackArray[top--];
        } else {
            throw new IllegalStateException("Stack is empty. Cannot pop.");
        }
    }

    @Override
    public int peek() {
        if (!isEmpty()) {
            return stackArray[top];
        } else {
            throw new IllegalStateException("Stack is empty. Cannot peek.");
        }
    }

    @Override
    public boolean isEmpty() {
        return top == -1;
    }

    @Override
    public boolean isFull() {
        return top == maxSize - 1;
    }
}