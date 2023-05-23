package hus.oop.MidtermExam.Exercise3;

import java.util.NoSuchElementException;

public class MyLinkedList extends MyAbstractList {
    private MyLinkedListNode head;
    private int size;

    /**
     * Khởi tạo dữ liệu mặc định.
     */
    public MyLinkedList() {
        /* TODO */
        head = null;
        size = 0;
    }

    /**
     * Lấy kích thước của list.
     * @return
     */
    @Override
    public int size() {
        /* TODO */
        return size;
    }

    /**
     * Lấy phần tử ở vị trí index trong list.
     * @param index
     * @return
     */
    @Override
    public Object get(int index) {
        /* TODO */
        MyLinkedListNode getIndex = getNodeByIndex(index);
        return getIndex.getPayload();
    }

    /**
     * Sửa phần tử ở vị trí index là payload.
     * @param payload
     * @param index
     */
    @Override
    public void set(Object payload, int index) {
        /* TODO */
        if (index == 0 ) {
            head = new MyLinkedListNode(payload, getNodeByIndex(1));
        }

        if (index == size - 1) {
            MyLinkedListNode lastNode = getNodeByIndex(size - 2);
            lastNode.setNext(new MyLinkedListNode(payload));
        }
        if (index > 0 && index < size - 1) {
            MyLinkedListNode aPay = getNodeByIndex(index - 1);
            MyLinkedListNode setPay = new MyLinkedListNode(payload, getNodeByIndex(index + 1));
            aPay.setNext(setPay);
        }
    }

    /**
     * Xóa phần tử của list ở vị trí index.
     * @param index
     */
    @Override
    public void remove(int index) {
        /* TODO */
        if (index == 0) {
            if (this.size == 1) {
                this.head = null;
            } else {
                this.head = getNodeByIndex(1);
            }
        } else if(index == this.size - 1) {
            MyLinkedListNode previousNode = getNodeByIndex(index - 1);
            previousNode.setNext(null);
        } else {
            MyLinkedListNode previousNode = getNodeByIndex(index - 1);
            MyLinkedListNode nextNode = getNodeByIndex(index + 1);
            previousNode.setNext(nextNode);
        }
        this.size--;
    }

    /**
     * Thêm vào cuối list phần tử có dữ liệu payload.
     * @param payload
     */
    @Override
    public void append(Object payload) {
        /* TODO */
        insert(payload,size);
    }

    /**
     * Thêm vào list phần tử có dữ liệu payload ở vị trí index.
     * @param payload
     * @param index
     */
    @Override
    public void insert(Object payload, int index) {
        /* TODO */
        if (index < 0 || index > size) {
            throw new IndexOutOfBoundsException("Invalid index: " + index);
        }

        MyLinkedListNode newNode = new MyLinkedListNode(payload);

        if (index == 0) {
            newNode.setNext(head);
            head = newNode;
        } else {
            MyLinkedListNode prev = getNodeByIndex(index - 1);
            newNode.setNext(prev.getNext());
            prev.setNext(newNode);
        }

        size++;
    }

    /**
     * Tạo iterator để cho phép duyệt qua các phần tử của list.
     * @return
     */
    @Override
    public MyIterator iterator() {
        /* TODO */
        return  new MyLinkedListIterator(head);
    }

    /**
     * Lấy node ở vị trí index.
     * @param index
     * @return
     */
    private MyLinkedListNode getNodeByIndex(int index) {
        /* TODO */
        MyLinkedListNode current = head;
        for (int i = 0; i < index; i++) {
            current = current.getNext();
        }
        return current;
    }
}
