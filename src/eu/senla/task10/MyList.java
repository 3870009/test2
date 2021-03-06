package eu.senla.task10;

import java.util.Comparator;
import java.util.ListIterator;

/*public interface MyList <E> extends Collection <E> {
    boolean add(E obj);
    void add(int index, E obj);
    boolean addAll(int index, Collection<? extends E> col);
    E get(int index);
    int indexOf(Object obj);
    int lastIndexOf(Object obj);
    ListIterator <E> listIterator();
    <E> MyList <E> of (Object...e);
    E remove(int index);
    E set(int index, E obj);
    void sort(Comparator<? super E> comp);
    MyList <E> subList(int start, int end);
}*/
public interface MyList <E> {
    boolean add(E obj);
    void add(int index, E obj) throws MyIndexOutOfBoundsException, MyObjConteinsException;
    boolean addAll(int index, MyList<? extends E> col) throws MyIndexOutOfBoundsException;
    E get(int index) throws MyIndexOutOfBoundsException;
    int indexOf(Object obj);
    int lastIndexOf(Object obj);
    public ListIterator <E> listIterator();

    static <E> MyList<E> of(Object... e) {
        return null;
    }

    E remove(int index) throws MyIndexOutOfBoundsException;
    E set(int index, E obj) throws MyIndexOutOfBoundsException;
    void sort(Comparator<? super E> comp);
    MyList <E> subList(int start, int end);
    public Object[] toArray();
}
