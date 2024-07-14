
    import java.util.*;
class num_game{
    static boolean is_prime(int num){
        for(int i=2;i*i<num;i++){
           if(num%i==0)
           return false;
        }
        return true;

    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("The Rules of the game are:-\n");
        
        System.out.println("Our System generate a random numebr  from 1 to 100 you need to guess the number\n");
       
        System.out.println("You will get 3 chance to guess the number \n");
       
        System.out.println("We will provide some hint to guess the number\t\t\t\n");
        
        System.out.println("The score is given on the basis of :- In how much attempt you guess the number. \n");
       
        System.out.println("If you guess the number in first attempt you will get 15 marks and If your ans is wrong then deducted 5 marks on each attempt\n\n\n");

        Random rn=new Random();
        int num=rn.nextInt(101);
        int num2=rn.nextInt(10);
        int num3=rn.nextInt(20);
        int i=1;
        if(is_prime(num)){
            System.out.println("The number is Prime Number");
        }
        else
        System.out.println("It is not a Prime Number");
        if(num%2==0 && num%5==0)
        System.out.println("the number is multiple 2 and 5");
        else
        System.out.println("Not multiple of 10");
        if(num%3==0)
        System.out.println("the number is multiple of 3");
        else
        System.out.println("the number is not multiple of 3");
        System.out.println("the number is less than "+(num+num2));
        System.out.println("the number is greater than:"+(num-num3));
        if(num%2==0){
            System.out.println("Nubmer is Even");

        }
else 
System.out.println("Number is Odd");

        while(i<=3){
            int ans=sc.nextInt();
            if(ans==num){
                System.out.println("congratulaions!!! you guess the correct number");
                break;

            }
            else if(ans<num)
            System.out.println("you need to think some bigger number");
            else 
            System.out.println("you need to think smaller number");
            i++;





        }
        if(i>3){
            System.out.println(" you loose the game the correct number is: "+num+"\n and your score is 0");
        }
        if(i<=3){
            System.out.println("your score is: ~"+(20-5*i));
        }
    }
}

