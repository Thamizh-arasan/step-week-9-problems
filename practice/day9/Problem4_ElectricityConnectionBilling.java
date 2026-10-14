import java.util.*;
abstract class Connection { double units; Connection(double u){units=u;} abstract double bill(); }
class Home extends Connection { Home(double u){super(u);} double bill(){return units<=100?units*5:500+(units-100)*7;} }
class Shop extends Connection { Shop(double u){super(u);} double bill(){return units*8+100;} }
class Factory extends Connection { Factory(double u){super(u);} double bill(){return Math.max(units*6,1000);} }
public class Problem4_ElectricityConnectionBilling { public static void main(String[]a){Scanner s=new Scanner(System.in);int n=s.nextInt();double total=0;for(int i=0;i<n;i++){String t=s.next();double u=s.nextDouble();Connection c=t.equals("HOME")?new Home(u):t.equals("SHOP")?new Shop(u):new Factory(u);double b=c.bill();total+=b;System.out.printf("%s: %.2f%n",t,b);}System.out.printf("Total: %.2f%n",total);}}