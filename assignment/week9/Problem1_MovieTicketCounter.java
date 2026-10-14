import java.util.*;
abstract class Ticket { int count; static final double FEE=20; Ticket(int c){count=c;} abstract double price(); double total(){return count*(price()+FEE);} }
class Regular extends Ticket { Regular(int c){super(c);} double price(){return 150;} }
class Premium extends Ticket { Premium(int c){super(c);} double price(){return 250;} }
class Recliner extends Ticket { Recliner(int c){super(c);} double price(){return 400;} }
public class Problem1_MovieTicketCounter { public static void main(String[]a){Scanner s=new Scanner(System.in);int n=s.nextInt();double total=0;for(int i=0;i<n;i++){String t=s.next();int c=s.nextInt();Ticket x=t.equals("REGULAR")?new Regular(c):t.equals("PREMIUM")?new Premium(c):new Recliner(c);double v=x.total();total+=v;System.out.printf("%s: %.2f%n",t,v);}System.out.printf("Total: %.2f%n",total);}}