import java.util.*;
abstract class Staff { String name; Staff(String n){name=n;} abstract double pay(); }
class FullTime extends Staff { double salary; FullTime(String n,double s){super(n);salary=s;} double pay(){return salary;} }
class Hourly extends Staff { double h,r; Hourly(String n,double h,double r){super(n);this.h=h;this.r=r;} double pay(){return h<=40?h*r:40*r+(h-40)*r*1.5;} }
class Intern extends Staff { double stipend; Intern(String n,double s){super(n);stipend=s;} double pay(){return stipend;} }
public class Problem2_WeeklyStaffPay { public static void main(String[]a){Scanner s=new Scanner(System.in);int n=s.nextInt();double total=0;for(int i=0;i<n;i++){String t=s.next(),name=s.next();Staff x=t.equals("FULLTIME")?new FullTime(name,s.nextDouble()):t.equals("HOURLY")?new Hourly(name,s.nextDouble(),s.nextDouble()):new Intern(name,s.nextDouble());double p=x.pay();total+=p;System.out.printf("%s: %.2f%n",name,p);}System.out.printf("Total Payroll: %.2f%n",total);}}