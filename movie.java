package movie_ticket_booking; 
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Scanner;
class time{
	int a;
	HashMap<Integer,String> hm=new HashMap<>();
	time(){
		System.out.println("1->11am  2->3pm  3->6pm  4->10pm");
		Scanner sc=new Scanner(System.in);
		a=sc.nextInt();
		while(a!=1&&a!=2&&a!=3&&a!=4){
			System.out.println("choose the coorrect timing");
			System.out.println("1->11am  2->3pm  3->6pm  4->10pm");
			a=sc.nextInt();
		}
		hm.put(1,"11 am");
		hm.put(2,"3 pm");
		hm.put(3,"6 pm");
		hm.put(4,"10 pm");
	}
		String time1(){
			return(hm.get(a));
		}
}
public class movie{
	public static void main(String[] args) {
 				LinkedList<String> A=new LinkedList<String>();
 				LinkedList<String> B=new LinkedList<String>();
 				LinkedList<String> C=new LinkedList<String>();
 				LinkedList<String> D=new LinkedList<String>();
 				LinkedList<String> E=new LinkedList<String>();
 				for(int i=0;i<10;i++){
 					A.add("1");
 					B.add("1");
 					C.add("1");
 					D.add("1");
 					E.add("1");
 				}
 				A.set(6,"0");
 				A.set(9,"0");
 				A.set(5,"0");
 				for(int i=0;i<6;i++){
 					B.set(i,"0");
 				}
 				for(int i=0;i<10;i++){
 					if(i%2==0){
 					C.set(i,"0");}
 				}
 				for(int i=0;i<10;i++){
 					if(i%2!=0){
 					D.set(i,"0");}
 				}
 				Scanner sc=new Scanner(System.in);
 				System.out.println("Are you Admin or User? \n If Admin press 'A' if User press 'U'");
 				char ch=sc.next().charAt(0);
 				while(ch!='A'&&ch!='U')
 				{
 					System.out.println("You selected incorrect option, choose correct option");
 					System.out.println("Are you Admin or User? \n If Admin press 'A' if User press 'U'");
 					ch=sc.next().charAt(0);
 				}
 				String s,s1;
 				switch (ch)
 				{
 				case 'A':
 				{
 					System.out.println("Do you want to update your password? \n If yes press 'Y', if no press 'N'");
 					ch=sc.next().charAt(0);
 					while(ch!='Y'&&ch!='N')
 					{
 						System.out.println("You selected incorrect option, choose correct option");
 						System.out.println("Do you want to update your password? \n If yes press 'Y', if no press 'N'");
 						ch=sc.next().charAt(0);
 					}
 					if(ch=='Y')
 					{
 						System.out.println("Enter old password");
 						sc.nextLine();
 						s=sc.nextLine();
 						System.out.println("Enter new password");
 						s=sc.nextLine();
 						System.out.println("Confirm new password");
 						s1=sc.nextLine();
 						while(!(s.equals(s1))){
 							System.out.println("Password not matching");
 							System.out.println("Enter new password");
 	 						s=sc.nextLine();
 	 						System.out.println("Confirm new password");
 	 						s1=sc.nextLine();
 						}
 						System.out.println("Password updated successfully");
 					}
 					else
 					{
 						System.out.println("Exited successfully");
 					}
 					break;
 					
 				}
 				case 'U':
 				{
 					System.out.println("Select the Show time: ");
 					time user=new time();
 					System.out.println("Available seats");
 					LinkedList<String> f= new LinkedList<>(); 
 					for(int i=0;i<10;i++){
 						if(A.get(i)=="0"){
 							f.add("A"+(i+1));
 							System.out.print("A"+(i+1)+" ");
 						}
 					}
 					for(int i=0;i<10;i++){
 						if(B.get(i)=="0"){
 							f.add("B"+(i+1));
 							System.out.print("B"+(i+1)+" ");
 						}
 					}
 					for(int i=0;i<10;i++){
 						if(C.get(i)=="0"){
 							f.add("C"+(i+1));
 							System.out.print("C"+(i+1)+" ");
 						}
 					}
 					for(int i=0;i<10;i++){
 						if(D.get(i)=="0"){
 							f.add("D"+(i+1));
 							System.out.print("D"+(i+1)+" ");
 						}
 					}
 					for(int i=0;i<10;i++){
 						if(E.get(i)=="0"){
f.add("E"+(i+1));
 							System.out.print("E"+(i+1)+" ");
 						}
 					}
 					System.out.println("\nHow many seats do you want to book?");
 					int x=sc.nextInt();
 					String arr[]=new String[x];
 					System.out.println("Select the seats");
 					for(int i=0;i<x;i++){
 						arr[i]=sc.next();
 						while(!(f.contains(arr[i]))){
 							System.out.println("select the appropriate seat");
 							arr[i]=sc.next();
 						}
 					}
 					System.out.println("total fare rs."+(x*200)+"/- only....!"+"\n press 1->confirm ticket\n2->cancel the ticket");
 					int y=sc.nextInt();
 					sc.nextLine();
 					String name;
 					long no;
 					if(y==1){
 						int b2=user.a;
 						System.out.println("enter your name ");
 						name=sc.nextLine();
 						System.out.println("enter your phone number ");
 						no=sc.nextInt();
 						System.out.println("Name: "+name+"\nph no: "+no+"\nmoving timing: "+user.time1()+"\ntotal seats "+x);
 						System.out.print("selected seats: ");
 	 					for(int i=0;i<x;i++){
 	 						System.out.print(arr[i]+" ");
 	 					}
 	 					System.out.println("\nAmount to be paid "+(x*200)+"\nEnter the amount to confirm seats");
 	 					int x1=sc.nextInt();
 	 					while(x1!=(x*200)){
 	 						System.out.println("invalid amount\nEnter "+(x*200));
 	 						x1=sc.nextInt();
 	 					}
 	 					System.out.println("Your tickets have been successfully booked\nThank you");
 					}
 					else{
 						System.out.println("Thank you");
 					}
 			}
   	} }}
