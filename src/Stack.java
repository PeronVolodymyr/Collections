import java.util.LinkedList;

public class Stack<T> {
    private LinkedList<T> storage = new LinkedList<>();

    public void push(T obj){
        storage.addFirst(obj);
    }
    public T pop()
    {
        return storage.removeFirst();
    }
    public boolean empty(){
        return storage.isEmpty();
    }

    @Override
    public String toString() {
        return storage.toString();
    }
}
