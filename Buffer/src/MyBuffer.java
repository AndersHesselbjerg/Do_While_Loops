import java.io.Serializable;

public class MyBuffer{

    public interface Bufferable<T> extends Serializable {

        public boolean add(T element);

        public T get(int index) throws MyBufferException;

        public int size();

        public void clear();

        public boolean contains(T element);

        public T remove(T element) throws MyBufferException;

        public boolean isEmpty();

    }


}
