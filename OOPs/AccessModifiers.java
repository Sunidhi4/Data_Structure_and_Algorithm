public class AccessModifiers 
{
     public static void main ( String args[]) 
{
     BankAccount myacc = new BankAccount();
     myacc.username = "Sunidhi";
     myacc.setPassword("abc...123");
} 
 } 

 class BankAccount
 {
    public String username;
    private String password;
    public void setPassword(String pwd)
    {
        password = pwd;
    }

 }