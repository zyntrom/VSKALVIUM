import java.io.*;
import java.util.*;
class CQueue{
	int size;
	int front,rear;
	int[] queue;
	CQueue(int size){
		this.size=size;
		front =-1;
		rear=-1;
		queue =new int[size];
	}
	
	void enqueue(int data){
		if((rear+1)%size==front){
			System.out.print("Queue is Full");
			return;
		}
		if(front==-1){
			front=0;
		}
		rear=(rear+1)%size;
		queue[rear]=data;
	}
	int dequeue(){
		if(front==-1){
			System.out.print("Queue is empty");
			return -1;
		}
		int val=queue[front];

		if(front==rear){
			front=rear=-1;
		}
		else{
			front =(front+1)%size;
		}
		return val;
	}
	void print(){
		if(front==-1){
			System.out.print("Queue is Empty");
			return;
		}
		int i=front;
		while(true){
			
			System.out.print(queue[i]+" ");
			if(i==rear){ break;}
			i=(i+1)%size;
		}
		System.out.println();
	}
}
public class CirQueue{
	public static void main(String[] args){
		CQueue queue= new CQueue(4);
		
		queue.enqueue(45);		 
		queue.enqueue(676);		
		queue.enqueue(7);
		queue.print();
		System.out.println(queue.dequeue());
		System.out.println(queue.dequeue());
		queue.print();
	}
}
