import java.util.Scanner;
class Main {
public static void main(String[] args) {
Scanner scan = new Scanner(System.in);
//scanner
 System.out.println("What is the name of your 1st student?");
String name1 = scan.next();
//first students name
   System.out.println("What is the name of your 2nd student?");
String name2 = scan.next();
//second kids name
   System.out.println("What is the name of your 3rd student?");
String name3 = scan.next();
//3rd kids name
   System.out.println("What is the name of your 4th student?");
String name4 = scan.next();
//4th kids name
   System.out.println("What is the name of your 5th student?");
String name5 = scan.next();
//5th kids name
   System.out.println("What is the name of your 6th student?");
String name6 = scan.next();
//6th kids name
   System.out.println("What is the name of your 7th student?");
String name7 = scan.next();
//7th kids name
   System.out.println("What is the name of your 8th student?");
String name8 = scan.next();
//8th kids name
   System.out.println("What is the name of your 9th student?");
String name9 = scan.next();
//9th kids name
   System.out.println("What is the name of your 10th student?");
String name10 = scan.next();
//10th kids name
   System.out.println("What is the name of your 11th student?");
String name11 = scan.next();
//11th kids name
   System.out.println("What is the name of your 12th student?");
String name12 = scan.next();
//12th kids name
   System.out.println("What is the name of your 13th student?");
String name13 = scan.next();
//13th kids name
   System.out.println("What is the name of your 14th student?");
String name14 = scan.next();
//14th kids name
   System.out.println("What is the name of your 15th student?");
String name15 = scan.next();
//15th kids name
 String[ ] studentNames = {name1, name2, name3, name4, name5, name6, name7, name8, name9, name10, name11, name12, name13, name14, name15};
// array to hold the input from the user
 
int[ ] seatNumbers = {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15};
//int b = 1;
for(int a = 0; a < 1; a++){
//b++;
//System.out.println("and they should sit at seat number " + seatNumbers[a]);
int count = 0;
while(count <= 14) {
  System.out.println(studentNames[count] + " will sit in seat number " + seatNumbers[count]);
count++;
}
}
}
}