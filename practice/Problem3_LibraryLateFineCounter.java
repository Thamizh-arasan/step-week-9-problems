import java.util.*;
abstract class LibraryItem { String title; int days; LibraryItem(String t,int d){title=t;days=d;} abstract double fine(); }
class Book extends LibraryItem { Book(String t,int d){super(t,d);} double fine(){return days*2;} }
class DVD extends LibraryItem { DVD(String t,int d){super(t,d);} double fine(){return Math.min(days*5,50);} }
class Magazine extends LibraryItem { Magazine(String t,int d){super(t,d);} double fine(){return days;} }
public class Problem3_LibraryLateFineCounter { public static void main(String[]a){Scanner s=new Scanner(System.in);int n=s.nextInt();double total=0;for(int i=0;i<n;i++){String t=s.next(),title=s.next();int d=s.nextInt();LibraryItem x=t.equals("BOOK")?new Book(title,d):t.equals("DVD")?new DVD(title,d):new Magazine(title,d);double f=x.fine();total+=f;System.out.printf("%s: %.2f%n",title,f);}System.out.printf("Total Fines: %.2f%n",total);}}