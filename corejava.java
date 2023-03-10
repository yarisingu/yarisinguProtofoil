
public class Problem_on_String
{
  public static void main(String [] args)
  {
    String mentel = "ffhhhTUUFGtyg251556511";
        // get the numbers from the string
       char[] che = mentel.toCharArray();// it is the method from java package to convert string to char arrays

     int sum=0;
    // to find the total sum in the string.
    
     int count=0;
    // to count the how many alphanumaric letters in string.
    
      for (int i=0;i<che.length;i++)// this is use to fetch the letters from the chararray 
      {
        
        if(che[i]>='0' && che[i]<='9')// it is logic to separate the numbers
        {
         //Character.getNumericValue(); is the method to convert from chartype to integertype
        sum = sum+ Character.getNumericValue(che[i]); 
        }
        // it is the logic to find uppercase letters
        if(che[i]>='A' && che[i]<='Z')
        {
            count++;
        }
      }
      // it check the sum you get from string is even or odd
      if(sum%2==0)
      {
        System.out.println("the sum of given number is even");
      }

      else
      {
        System.out.println("the sum of given number is odd");
      }

      System.out.println();
      System.out.println(count+" is the count of capital letters");
  }
}
