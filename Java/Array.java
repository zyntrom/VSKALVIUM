import java.io.*;
import java.util.*;
class Node{
	int data;
	Node next;

	Node(int data){
		this.data=data;
		this.next=null;
	}
}

class LinkedList {
    Node head;

    void add(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            return;
        }
        Node curr = head;
        while (curr.next != null) {
            curr = curr.next;
        }
        curr.next = newNode;
    }

    void print() {
        Node curr = head;
        while (curr != null) {
            System.out.print(curr.data + " -> ");
            curr = curr.next;
        }
        System.out.println("null");
    }

    void delete(int value) {
        if (head == null) return;
        if (head.data == value) {
            head = head.next;
            return;
        }
        Node curr = head;
        while (curr.next != null && curr.next.data != value) {
            curr = curr.next;
        }
        if (curr.next != null) {
            curr.next = curr.next.next;
        }
    }
}

public class Array{
	public static void main(String[] args){
		 LinkedList list = new LinkedList();
        list.add(10);
        list.add(20);
        list.add(30);
        list.print();  // 10 -> 20 -> 30 -> null
        list.delete(20);
        list.print();  // 10 -> 30 -> null
	}
}   
