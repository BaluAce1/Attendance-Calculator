import java.text.DecimalFormat;
 import java.util.Scanner;
 class Calc {
 double prcnt = 0.00;
 private int total = 0;
 private int attended = 0;
 private int periods1 = 0;
 private boolean periods = true;
 void cal(int num1,int num2,boolean periods,int periods1) {
 this.total = num1;
 this.attended = num2;
 this.periods = periods;
 this.periods1 = periods1;
 }
 public void AttdCalc() {
 double prcnt = ((double) attended / total) * 100;
 this.prcnt = prcnt;
 DecimalFormat df = new DecimalFormat("#.00");
 String prcnt_str = df.format(prcnt);
 System.out.println("Your Attendance is " + prcnt_str + " % ");
 
 
 }
 public boolean custmAttd(int percent) {
 int days = 0;
 int priods = 0;
 int periods_left = 0;

 if(total != 0) { 
 if(percent == 100) {
 System.out.println("You need to attend every day conducted ");
 return true;
 }
 else if(percent > 100 || percent <0) {
 System.out.println("Invalid Input ");
 return false;
 }
 else {
 if(periods == true ){
 if(percent < prcnt ) {
 System.out.println("You already exceed the " + prcnt + " attendance requirement having " + percent + " %");
 }
 else {
 priods = ((percent * total) - (100 * attended)) / (100 - percent);
 days = priods / periods1;
 periods_left = priods % periods1;
 System.out.println("You have to attend " + days + "days and " + periods_left + " periods");
 }
 }
 else {
 if(percent < prcnt ) {
 System.out.println("You already exceed the " + prcnt + " attendance requirement having " + percent + " %");
 }
 else {
 priods = ((percent * (total * periods1)) - (100 * (attended * periods1))) / (100 - percent);
 days = priods / periods1;
 periods_left = priods % periods1;
 System.out.println("You have to attend " + days + " days and " + periods_left + " periods");
 }
 }
 }
 return true;
 }
 else {
 System.out.println("You havent given attendance input yet ");
 return true;
 }
 }
 public boolean inputhandle(int input){
 if(input <= 2 && input > 0) {
 return false;
 }
 else {
 return true;
 }
 
 }
 public void Increment(int input ) {
 double increment = 0;
 if(periods){
 increment = ((((double)attended + (input * periods1) ) ) / (total + (input * periods1)) ) * 100; 
 
 
 } else {
 increment = (( ((double)attended * periods1) + (input * periods1) ) / ((total * periods1) + (input * periods1) )) * 100;
 }
 DecimalFormat cf = new DecimalFormat("#.00");
 String increase = cf.format(increment);
 String increase_perc = cf.format((increment) - prcnt );
 System.out.println("You will have " + increase + " % ");
 System.out.println("Increment == + " + increase_perc + " % ");
 
 
 }
 public void Decrement(int input ) {
 double Decrement = 0;
 if(periods){
 Decrement =( ((double)attended ) / (total + (input * periods1)) ) * 100; 
 
 
 } else {
 Decrement = (((double)(attended * periods1)) / ((total * periods1) + (input * periods1) )) * 100;
 }
 DecimalFormat bf = new DecimalFormat("#.00");
 String decrease = bf.format(Decrement);
 String decrease_perc = bf.format((prcnt-Decrement));
 System.out.println("You will have " +decrease + " % ");
 System.out.println("Decrement == - " + decrease_perc + " % ");
 
 
 }
 
 
 
 }
 public class AtndCalc {
 public static void main(String[] args) { 
 Scanner sc = new Scanner(System.in);
 int input = 1;
 int edge_case = 1;
 Calc cal = new Calc();
 do {
 System.out.println("Welcome to Attendance Calculator ");
 System.out.println("1.Attendance input");
 System.out.println("2.Attendance");
 System.out.println("3.Days Predictor for Attendance");
 System.out.println("4.Attendance Increment and Reduction ");
 System.out.println("0.Exit");
 input = sc.nextInt();
 switch(input) {
 case 1:
 String name = "n";
 Boolean cond2 = true;
 System.out.println("Attendance Format");
 System.err.println("1.Periods");
 System.err.println("2.Days");
 int cond = sc.nextInt();
 while(cal.inputhandle(cond)) {
 System.out.println("You have entered Wrong input");
 System.err.println("Enter again ");
 cond = sc.nextInt();
 
 }
 if(cond == 1) {
 name = "Periods";
 cond2 = true; 
 
 
 }
 else {
 name = "Days";
 cond2 = false;
 
 
 } 
 System.out.println("Enter total " +name );
 int total = sc.nextInt();
 System.out.println("Enter Attended " + name);
 int attended = sc.nextInt();
 System.out.println("Enter The toal no of periods in a day ");
 int periods = sc.nextInt();
 cal.cal(total,attended,cond2,periods);
 edge_case = 2;
 break;
 case 2:
 if(edge_case != 2) {
 System.out.println("Please Enter Attendance Input ");
 }
 else {
 cal.AttdCalc();
 }
 break;
 case 3:
 System.out.println("Enter Attendance Requirement : ");
 int req = sc.nextInt();
while(cal.custmAttd(req) == false) {
 System.out.println("Enter requirement properly ");
 req = sc.nextInt();
 }
 break;
 case 4:
 System.out.println("Please Choose required option ");
 System.out.println("1.Reduction Calculator");
 System.out.println("2.Increment Calculator");
 int choice = sc.nextInt();
 while(cal.inputhandle(choice)) {
 System.out.println("You have entered Wrong input ");
 choice = sc.nextInt();
 }
 int days = 0;
 if(choice == 1) {
 System.out.println("No of days you plan to Bunk : ");
 days = sc.nextInt();
 cal.Decrement(days);
 
 }
 else {
 System.out.println("No of days you plan to Attend : ");
 days = sc.nextInt();
 cal.Increment(days);
 }
 
 break;
 default:
 System.out.println("Please Enter correct Option");
 
 
 
 }
 }
 while(input != 0);
 sc.close();
 }
 }
