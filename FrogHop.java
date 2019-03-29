import java.util.Scanner;

public class FrogHop{

public static void main (String[] args){
  Scanner scanner = new Scanner(System.in);
  System.out.println("Please Enter your number");  
  
  int number = scanner.nextInt();
  System.out.println("processing:");
	
	int iteration = 1 ;
	hop(number ,iteration,0);
}
public static void hop(int number, int iteration , int waitingTime){
	int iter = iteration % 3 ;
	int tempNumber = number ;
    	
	if (iter == 0 ){

			tempNumber = number - 2 ;
			waitingTime+=2; 
			if(tempNumber<=0){
				System.out.println("waiting time is "+waitingTime);

			}
			else hop(tempNumber,++iteration,waitingTime);
	}
	else if (iter == 1){
			
			tempNumber = number - 8 ;
			waitingTime+=5 ;
			if(tempNumber<=0){
				System.out.println("waiting time is "+waitingTime);
			}
			else hop(tempNumber,++iteration,waitingTime) ;		
	}
	else {

			tempNumber = number - 5 ;
			waitingTime+=3 ;
			if(tempNumber<=0){
				System.out.println("waiting time is "+waitingTime);
			}	
			else hop(tempNumber,++iteration,waitingTime) ;
	}
		
}
}
