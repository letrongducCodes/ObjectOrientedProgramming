package hus.oop.lab9.MyList;

public class MyArrayList extends MyAbstractList {
    static final int INITIAL_SIZE = 16;
    Object[] elements;
    int size;

    public MyArrayList() {
        elements = new Object[INITIAL_SIZE];
        size = 0;
    }

    @Override
    public void add(Object o) {
        if(size >= elements.length - 1) {
            enlarge();
        }
        elements[size++] = o;
    }

    @Override
    public void add(Object o, int index) {
        if (this.size == this.elements.length) {
            enlarge();
        }

        checkBoundaries(index,this.size);
        for (int i = this.size; i > index; i--) {
                this.elements[i] = this.elements[i - 1];
            }
        this.elements[index] = o;
        this.size++;
    }

    @Override
    public Object get(int index) {
        checkBoundaries(index,this.size - 1);
        return elements[index];
    }

    @Override
    public void remove(int index) {
        checkBoundaries(index,this.size - 1);
        for (int i = index; i < (this.size - 1); i++) {
            this.elements[i] = this.elements[i + 1];
        }
        this.elements[this.size - 1] = null;
        this.size--;
    }

    @Override
    public int size() {
        return this.size;
    }

    private void enlarge() {
        Object[] tmp = new Object[elements.length * 2];
        System.arraycopy(elements,0,tmp,0,elements.length);
        this.elements = tmp;
    }
}
