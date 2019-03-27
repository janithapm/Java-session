import java.util.Scanner;

class chTest{
 public static void main (String[] args){

  Scanner scanner = new Scanner(System.in);
  System.out.println("Please Enter your list of characters & press ENTER");  
  
  StringBuffer sb = new StringBuffer(scanner.nextLine());
  System.out.println("processing:");
  

  int totalStringLength = sb.length();
  System.out.println("the result(s) are");
  for(int i =2 ; i< totalStringLength-2 ; i++){
 	StringBuffer tempResult = new StringBuffer("");
 	matcher(sb,0,i,tempResult);
 	} 
	
 }

 public static void matcher(StringBuffer sb , int iteration , int pointer, StringBuffer tempResult){
	int leftPointer = pointer-iteration ;
	int rightPointer = pointer+1+iteration;

	if (leftPointer>=0 && rightPointer<sb.length() && sb.charAt(leftPointer)==sb.charAt(rightPointer)){
	       
	       tempResult.append(sb.charAt(pointer-iteration));
	       ++iteration;
	       matcher(sb,iteration,pointer,tempResult);	       
	}
	else if (iteration >2){
	       System.out.println(tempResult);
	}
	
 }
}
