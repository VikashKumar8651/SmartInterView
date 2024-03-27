import java.util.*;
class PrimeBest{
    static boolean  isprime(int num){
            if(num == 2 || num == 3)
            {
                return true;
            }
            if(num%2 ==0 || num%3 == 0)
            {
                return false;
            }
            for(int i=5;i<Math.sqrt(num);i+=6)
            {
                if(num%i == 0 || num%(i+2) == 0)
                {
                    return false;
                }
            }
            return true;
    }
    public static void main(String[] args)
    {
        Scanner sc= new Scanner(System.in);
        int s=sc.nextInt();
        boolean res = isprime(s);
        if(res){
            System.out.println(s+"is  prime no");
        }else
           {
            System.out.println(s+"is not a prime no");
           }
    }
}