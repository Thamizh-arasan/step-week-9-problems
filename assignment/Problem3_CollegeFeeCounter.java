import java.util.*;
abstract class Student { String name; Student(String n){name=n;} abstract double tuition(); boolean usesBus(){return false;} double fee(){return tuition()+(usesBus()?12000:0);} }
class DayScholar extends Student { DayScholar(String n){super(n);} double tuition(){return 40000;} boolean usesBus(){return true;} }
class Hosteller extends Student { Hosteller(String n){super(n);} double tuition(){return 100000;} }
class Scholar extends Student { Scholar(String n){super(n);} double tuition(){return 20000;} boolean usesBus(){return true;} }
public class Problem3_CollegeFeeCounter { public static void main(String[]a){Scanner s=new Scanner(System.in);int n=s.nextInt();double total=0;for(int i=0;i<n;i++){String t=s.next(),name=s.next();Student x=t.equals("DAY_SCHOLAR")?new DayScholar(name):t.equals("HOSTELLER")?new Hosteller(name):new Scholar(name);double f=x.fee();total+=f;System.out.printf("%s: %.2f%n",name,f);}System.out.printf("Total Collected: %.2f%n",total);}}