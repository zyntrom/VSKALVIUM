import java.io.*;
import java.util.*;
public class test{
	public static void main(String[] args){
		Scanner s= new Scanner(System.in);
		int n=10;
		int []keys= new int[n];
		int []values= new int[n];

		for(int i=0;i<n;i++){
			keys[i]=Integer.MIN_VALUE;
		}

		put(keys,values,10,100);
		put(keys,values,10,100);

	}
}
