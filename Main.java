import java.util.Scanner;
class Main {
public static void main(String[] args) {
Scanner scan = new Scanner(System.in);
//scanner
   System.out.println("What is the name of the 1st student?");
  String name1 = scan.next();
//name of 1st student
   System.out.println("What is the name of the 2nd student?");
  String name2 = scan.next();
//name of 2nd student
   System.out.println("What is the name of the 3rd student?");
  String name3 = scan.next();
//name of 3rd student
   System.out.println("What is the name of the 4th student?");
  String name4 = scan.next();
//name of 4th student
   System.out.println("What is the name of the 5th student?");
  String name5 = scan.next();
//name of 5th student
   System.out.println("What is the name of the 6th student?");
  String name6 = scan.next();
//name of 6th student
   System.out.println("What is the name of the 7th student?");
  String name7 = scan.next();
//name of 7th student
   System.out.println("What is the name of the 8th student?");
  String name8 = scan.next();
//name of 8th student
   System.out.println("What is the name of the 9th student?");
  String name9 = scan.next();
//name of 9th student
   System.out.println("What is the name of the 10th student?");
  String name10 = scan.next();
//name of 10th student
   System.out.println("What is the name of the 11th student?");
  String name11 = scan.next();
//name of 11th student
   System.out.println("What is the name of the 12th student?");
  String name12 = scan.next();
//name of 12th student
   System.out.println("What is the name of the 13th student?");
  String name13 = scan.next();
//name of 13th student
   System.out.println("What is the name of the 14th student?");
  String name14 = scan.next();
//name of 14th student
   System.out.println("What is the name of the 15th student?");
  String name15 = scan.next();
//name of 15th student
String[ ] studentNames = {name1, name2, name3, name4, name5, name6, name7, name8, name9, name10, name11, name12, name13, name14, name15};
// array to hold the input from the user
 
int[ ] seatNumbers = {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15};
// number of seats there are
for(int a = 0; a < 1; a++){

int count = 0;
while(count <= 14) {
  System.out.println(studentNames[count] + " will sit in seat number " + seatNumbers[count] + ".");
count++;
}
}
}
}