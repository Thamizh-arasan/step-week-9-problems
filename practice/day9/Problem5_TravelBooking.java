import java.util.*;
abstract class Booking { static final double FEE=50; double km; Booking(double k){km=k;} abstract double baseFare(); double total(){return baseFare()+FEE;} }
class Bus extends Booking { Bus(double k){super(k);} double baseFare(){return km*2;} }
class Train extends Booking { Train(double k){super(k);} double baseFare(){return km*1.5;} }
class Flight extends Booking { Flight(double k){super(k);} double baseFare(){return 2500+km*4;} }
public class Problem5_TravelBooking { public static void main(String[]a){Scanner s=new Scanner(System.in);int n=s.nextInt();for(int i=0;i<n;i++){String t=s.next();double k=s.nextDouble();Booking b=t.equals("BUS")?new Bus(k):t.equals("TRAIN")?new Train(k):new Flight(k);System.out.printf("%s: %.2f%n",t,b.total());}}}