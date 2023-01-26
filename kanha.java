import java.util.Scanner;

public class kanha {
    public static void main(String[] args){
     System.out.println("enter the ammount");
    Scanner sc=new Scanner( System.in);
    int a=sc.nextInt();
    int count=0,count5=0,count2=0,count50=0,count20=0,count10=0,countt=0,countx=0,county=0;

    while(a>0){
        if(a>=2000){
            count++;
            a=a-2000;
    
        }
        if(a>=500 && a<2000){
            count5++;
            a=a-500;
        }
        if(a>=200 && a<500){
            count2++;
            a=a-200;
        }
        if(a>=50 && a<200){
            count50++;
            a=a-50;
        }
        if(a>=20 && a<50){
            count20++;
            a=a-20;
        }
        if(a>=10 && a<20){
            count10++;
            a=a-10;
        }
        if(a>=5 && a<10){
            countt++;
            a=a-5;
        }
        if(a>=2 && a<5){
            countx++;
            a=a-2;
        }
        if(a>=1 && a<2){
            county++;
            a=a-1;
        }
        
        
    }
    System.out.println(count+" two thousand note ");
    System.out.println(count5+" five hundread note ");
    System.out.println(count2+" two hundread note ");
    System.out.println(count50+" 50 rupees notes ");
    System.out.println(count20+" 20 rupees notes ");
    System.out.println(count10+" 10 rupees notes ");
    System.out.println(countt+" 5 rupees notes ");
    System.out.println(countx+" 2 rupees notes ");
    System.out.println(county+" 1 rupees notes ");
}

    }
    

