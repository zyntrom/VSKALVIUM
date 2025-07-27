import java.io.*;
import java.util.*;
class Queue{
	int maxSize= 100;
	int[] queue=new int[maxSize];
	int front=0;
	int rear=-1;

	void enqueue(int value){
		if(rear==maxSize-1){
			System.out.print("Queue Overflow");
			return;
		}
		rear++;
		queue[rear]=value;
	}
	int dequeue(){
		if(front>rear){
			System.out.print("Queue is underflow");
			return -1;
		}
		int val= queue[front];
		front++;
		return val;
	}
	int peek(){
		if(front>rear){
			System.out.print("Queue is empty");
			return -1;
		}
		int val=queue[front];
		return val;
	}
	boolean isEmty(){
		return front>rear;
	}
	void printQueue(){
		for(int i=front;i<=rear;i++){
			System.out.print(queue[i]+" ");
		}
		System.out.println();
	}



	
}
public class Linkedlist{
	public static void main(String[] args){
		Queue qu= new Queue();

		qu.enqueue(233);
		qu.enqueue(3);
		qu.enqueue(656);
		qu.enqueue(4576);

		qu.printQueue();

		System.out.println(qu.dequeue());
		System.out.println(qu.dequeue());
		
		qu.printQueue();
	}
}
