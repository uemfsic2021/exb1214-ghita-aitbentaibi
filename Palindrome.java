public class Palindrome{
    public static boolean is_palindrome(String s)
    {
        // add your code here
        int b = s.length();
        for(int i=0;i<(b-1);i++){
          if(s.charAt(i)!=s.charAt(b-i-1)){
            return false;
          }
        } 
        return true;    
          }
        
        
    }

