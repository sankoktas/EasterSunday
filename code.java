import java.util.Scanner;

public class KFS_EasterSunday_Main
{
    public static void main (String [] args)
    {
        Scanner in = new Scanner(System.in);
        System.out.print("Please enter the year: "); // prompts the user to enter a year 
        
        int y = in.nextInt(); //year 
        
        int a = y%19; // all variables below are required for our calculations when we're sticking to Gauss's formula 
        int b = y/100;
        int c = y%100;
        int d = b / 4;
        int e = b%4;
        
        int g = (8*b+13)/25;
        int h = (19*a+b-d-g+15)%30;
        int j = c/4;
        int k =c%4;
        int m = (a+11*h)/319;
        int r = (2*e+2*j-k-h+m+32)%7;
        int n = (h-m+r+90)/25;
        int p = (h-m+r+n+19)%32;
        
        int day = p; 
        int month = n;
        
        System.out.println( "Date of the Easter Sunday is: " + day + "/" + month + "/" + y);
    }
}
