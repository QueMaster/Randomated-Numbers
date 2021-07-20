import java.util.Scanner;
import java.util.Random;
public class show{
public static void main(String[] args){

int[] numbers = new int[10];
Random rand = new Random();
int max = 55;
int min = 35;
int indexValue = -1;
int sum = 0;
int count = 0;
double average =0;
int total = 0;
for(int x=0;x<numbers.length;x++)
{
	indexValue++;
	numbers[x] = rand.nextInt(max - min + 1)+min;
	
System.out.println("Randomely Generated Value"+" "+numbers[x]+"\t"+"Index Value:"+" "+indexValue);
}
System.out.println("  ");
for(int x=0;x<numbers.length;x++)
{
 sum+=numbers[x]; 
}
System.out.println("The total sum of the random generated numbers is:"+" "+sum);

Scanner input  = new Scanner(System.in);
System.out.println("Enter values in a rang of 35 to 55:");
System.out.println(" ");
for(int x=0;x<numbers.length;x++)
{
	count++;
	System.out.println("Enter value: "+""+count);
	numbers[x] = input.nextInt(); 
	
	total+=numbers[x];		
}
  average = total / count;
  
System.out.println("Numbers Greater are: "+"\n");
for(int x=0;x<numbers.length;x++)
{
	if(numbers[x] > average)
	{
 		System.out.println("\t"+numbers[x]);
	}
}




    

}
}