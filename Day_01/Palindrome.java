package Day_01;

public class Palindrome {
    public boolean isPalindrome(int x) {
        //  int x;
        if(x<0){
            return false;
        }else{
            int temp = x;
            int rev = 0;
            while(temp != 0){
                int digit = temp %10;
                rev = rev*10 + digit;
                temp /= 10;
            }
            if(rev == x){
                return true;
            }else{
                return false;
            }

        }

        
    }
}
