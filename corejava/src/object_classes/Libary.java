package object_classes;

import java.util.Scanner;

public class Libary {
	int acc_num;
	String Title;
	String Author;
	Scanner sc =new Scanner(System.in);
	public void input()
	{
		System.out.println("the author of the book");
		System.out.println(" ");
		Author=sc.nextLine();
		System.out.println("the title of the book: ");
		Title=sc.nextLine();
		System.out.println("the accession number of the book: ");
		acc_num=sc.nextInt();
		
		
				
	}
	public void compute()
	{
	System.out.println("enter the number of days late");
	int a=sc.nextInt();
	int fine=(a*5);
	System.out.println("total fine amount:"+fine);
	
	}
	 public void display()
	{
		System.out.println("Accession Number\t Title\t \t \t Author\n");
		System.out.println(+acc_num +"\t\t\t"+Title+"\t\t\t"+Author+"\t");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	      Libary ob=new Libary();
	      ob.input();
	      ob.compute();
	      ob.display();
		
	}
		}