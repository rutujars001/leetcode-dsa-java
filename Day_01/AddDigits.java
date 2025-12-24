package Day_01;

public class AddDigits {
    public int sumOfEachDigit(int num){
        int sum = 0;
        while(num!=0){
            sum += num%10;
            num /=10;
        }
        return sum;
    }
    public int addDigits(int num) {
        int temp = num;
        while(temp>=10){
            temp = sumOfEachDigit(temp);
        }
        return temp;
        
    }
}
