package LinkedList;

import java.util.LinkedList;

public class MyLinkedList<E> {
    Node<E> phead = null;
    Node<E> pTail = null;
    int size = 0;
    public MyLinkedList() {

    }
    public MyLinkedList(Node<E> e) {
        phead = e;
        e.pNext = null;
    }
    public void addFirst( E e) {
        Node<E> node = new Node<>(e);
        if (phead == null) {
            phead = pTail = node;
        }else {
            node.pNext = phead;
            phead = node;
        }
    }

    public E getFirst() {
        return phead.data;
    }

}
