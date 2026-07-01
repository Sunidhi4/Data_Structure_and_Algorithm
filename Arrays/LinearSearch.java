public class LinearSearch 
{
    public static int LinearSearchdemo(String numbers[], String key)
    {
        for(int i=0; i<numbers.length; i++)
        {
            if(numbers[i] == key)
            {
                return i;
            }
        }
        return -1;
    }
     public static void main ( String args[]) 
{
     String numbers[] = {"2", "4", "6", "8", "10", "12", "14", "16"};
     String key = "10";
     int index = LinearSearchdemo(numbers, key);
     if(index == -1)
     {
        System.out.println("NOT Found");
     }
     else
     {
        System.out.println("key is at index : "+index);
     }
    String menu[] = {"dosa" , "Samose", "patties", "noodles"};
    String key2 = "patties";
    int index2 = LinearSearchdemo(menu , key2);
    if(index2 == -1)
    {
        System.out.println("Not found!");
    }
    else{
        System.out.println("key is at index : "+index2);
    }
} 
 } 