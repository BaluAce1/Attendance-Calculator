import java.util.Scanner;

public class Main {
public static void main (String[] args) {
System.out.println("Welcome to Attendance Calculator ");
System.out.println("Enter your attedance format ");
System.out.println("1.Periods");
System.out.println("2.Days");
Scanner sc = new Scanner(System.in);
int input = sc.nextInt();

while(input != 1 && input != 2)  
{  
    System.out.println("Invalid input !\nEnter correct input:");  
    System.out.println("1.Periods");  
    System.out.println("2.Days");  
    input = sc.nextInt();  
}  
 
switch(input) {  
    case 1 :  
        System.out.println("Enter your total periods :");  
        int Total_periods = sc.nextInt();  
        System.out.println("Enter attended periods :");  
        int Attended_periods = sc.nextInt();  
        System.out.println("Enter the number of periods in a day :");  
        int periods = sc.nextInt();  
        float Attendance = ((float) Attended_periods / Total_periods) * 100 ;  
        System.out.println("Your attendance = " + Attendance);  
        System.out.println("\nWanna know how many days you have to attend to pass the requirement ");  
        System.out.println("1.Yes");  
        System.out.println("2.Exit");  
        int input2 = sc.nextInt();  
        while(input2 != 1 && input2 != 2) {  
            System.out.println("You have entered Wrong input ");  
            System.out.println("1.Yes");  
            System.out.println("2.Exit");  
            input2 = sc.nextInt();  
        }  
        if(input2 == 1){  
            System.out.println("Enter your Attedance Requirement % :");  
            int requirement = sc.nextInt();  
            if(Attendance >= requirement ) {  
                System.out.println("You have attendance more than requirement already ");  
                 
            }  
            else {  
             
            int time_required = ((requirement * Total_periods) - (100 * Attended_periods ) ) / (100 - requirement);  
            int days_required = (time_required / periods);  
            int periods_required = (time_required % periods);  
            System.out.println("You have to attend " + days_required + " days " + periods_required + " periods " );
            System.out.println(" Welcome to Attendance Predictor : \n");
            System.out.println(" You can calculate how much your attendance % increases after attending input days given ");
            System.out.println("You can calculate how much your attendance % will decrease if you skip given input days ");
            System.out.println("\nContinue ?  ");
            System.out.println("1.Yes");
            System.out.println("2.No");
            int input3 = sc.nextInt();
            while(input3 != 1 && input3 != 2){
            System.out.println("Invalid Input");
            System.out.println(" Welcome to Attendance Predictor : \n");
            System.out.println(" You can calculate how much your attendance % increases after attending input days given ");
            System.out.println("You can calculate how much your attendance % will decrease if you skip given input days ");
            System.out.println("\nContinue ?  ");
            System.out.println("1.Yes");
            System.out.println("2.No");
            input3 = sc.nextInt();
             }
             if(input3 == 1 ) {
            System.out.println("Please Choose the apropriate option ");
            System.out.println("1.Attendance increment After n days ");
            System.out.println("2.Attendance reduction after n days ");
            int input5 = sc.nextInt();
            while(input5 != 1 && input5 != 2){
                System.out.println("Incorrect Input ");
                System.out.println("Please Choose the apropriate option ");
                System.out.println("1.Attendance increment After n days ");
                System.out.println("2.Attendance reduction after n days ");
                input5 = sc.nextInt();
            }
            switch(input5) {
                case 1 :
                    System.out.println("Enter the no of days you will attend ");
                    int i = sc.nextInt();
                
                            int New_Total = Total_periods + (i * periods);
                            int New_Attended = Attended_periods + (i * periods);
                            float New_Attendance = ((float) New_Attended / New_Total) * 100;
                            System.out.println("Increased Attendance after  " + i + "  days  = " + New_Attendance +  " %");
                            break ;
                            
                default : 
                        System.out.println("Enter the no of days you plan to bunk ");
                        i = sc.nextInt();
                
                             New_Total = Total_periods + (i * periods);
                             New_Attended = Attended_periods;
                             New_Attendance = ((float) New_Attended / New_Total) * 100;
                            System.out.println("Decreased Attendance after  " + i + "  days bunk  = " + New_Attendance +  " %");
                         
                    }
            }
            else {
                System.out.println("Exiting..." );
                System.exit(0);
            }
            } 
        }  
        else {  
            System.out.println("exiting system");  
            System.exit(0);  
             }
        break;  
     
    default :  
        System.out.println("Enter your total Days");  
        int Total_Days = sc.nextInt();  
        System.out.println("Enter attended Days");  
        int Attended_Days = sc.nextInt();  
        Attendance = ((float) Attended_Days / Total_Days) * 100 ;  
        System.out.println("Your attendance = " + Attendance);  
        System.out.println("\nWanna know how many days you have to attend to pass the requirement ");  
        System.out.println("1.Yes");  
        System.out.println("2.Exit");  
         input2 = sc.nextInt();  
        while(input2 != 1 && input2 != 2) {  
            System.out.println("You have entered Wrong input ");  
            System.out.println("1.Yes");  
            System.out.println("2.Exit");  
            input2 = sc.nextInt();  
        }  
        if(input2 == 1){  
            System.out.println("Enter your Attedance Requirement % :");
           
            int requirement = sc.nextInt();  
            System.out.println("Enter the total periods in a day " );
            periods = sc.nextInt();
            if(Attendance >= requirement ) {  
                System.out.println("You have attendance more than requirement already ");  
            }  
            else {  
               Total_periods = Total_Days * periods;
               Attended_periods = Attended_Days * periods ;
              int time_required = ((requirement * Total_periods) - (100 * Attended_periods ) ) / (100 - requirement);  
              int days_required = (time_required / periods);  
              int periods_required = (time_required % periods);  
            System.out.println("You have to attend " + days_required + " days " + periods_required + " periods " );
            
            System.out.println(" Welcome to Attendance Predictor : \n");
            System.out.println(" You can calculate how much your attendance % increases after attending input days given ");
            System.out.println("You can calculate how much your attendance % will decrease if you skip given input days ");
            System.out.println("\nContinue ?  ");
            System.out.println("1.Yes");
            System.out.println("2.No");
            int input3 = sc.nextInt();
            while(input3 != 1 && input3 != 2){
            System.out.println("Invalid Input");
            System.out.println(" Welcome to Attendance Predictor : \n");
            System.out.println(" You can calculate how much your attendance % increases after attending input days given ");
            System.out.println("You can calculate how much your attendance % will decrease if you skip given input days ");
            System.out.println("\nContinue ?  ");
            System.out.println("1.Yes");
            System.out.println("2.No");
            input3 = sc.nextInt();
             }
             if(input3 == 1 ) {
            System.out.println("Please Choose the apropriate option ");
            System.out.println("1.Attendance increment After n days ");
            System.out.println("2.Attendance reduction after n days ");
            int input5 = sc.nextInt();
            while(input5 != 1 && input5 != 2){
                System.out.println("Incorrect Input ");
                System.out.println("Please Choose the apropriate option ");
                System.out.println("1.Attendance increment After n days ");
                System.out.println("2.Attendance reduction after n days ");
                input5 = sc.nextInt();
            }
            switch(input5) {
                case 1 :
                    System.out.println("Enter the no of days you will attend ");
                    int i = sc.nextInt();
                
                            int New_Total = Total_periods + (i * periods);
                            int New_Attended = Attended_periods + (i * periods);
                            float New_Attendance = ((float) New_Attended / New_Total) * 100;
                            System.out.println("Increased Attendance after  " + i + "  days  = " + New_Attendance +  " %");
                            break ;
                            
                default : 
                        System.out.println("Enter the no of days you plan to bunk ");
                        i = sc.nextInt();
                
                             New_Total = Total_periods + (i * periods);
                             New_Attended = Attended_periods;
                             New_Attendance = ((float) New_Attended / New_Total) * 100;
                            System.out.println("Decreased Attendance after  " + i + "  days bunk  = " + New_Attendance +  " %");
                         
                    }
            }
            else {
                System.out.println("Exiting");
                System.exit(0);
            }
           
            }  
         
}  
    else {  
            sc.close();  
            System.out.println("exiting system");  
            System.exit(0);  
         }  
}
}
}