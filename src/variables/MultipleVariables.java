package variables;

public class MultipleVariables {

    public static void main(String[] args) {


        double taxAmount;

        taxAmount=10.5 ;

        double trumpAge , hillaryAge ,  obamaAge;

        trumpAge =70;
        hillaryAge=68;
        obamaAge=59;

        int appleNumber=12,orangeNumber=15,bananaNumber=10;

        System.out.println("Apple number is" +appleNumber) ;
        System.out.println(orangeNumber);
        System.out.println(bananaNumber);

        int totalFruits=appleNumber+orangeNumber+bananaNumber;

        System.out.println("Total Fruit Number" +totalFruits) ;

        int restFruit = totalFruits-10 ;

        System.out.println("Rest of the fruits" +restFruit);

        int division=27/6;

        System.out.println(division);

        int remainder=27%4;
        //4+4+4+4+4+4+3
        System.out.println(remainder);



        int remainder1=27%6;
        //6+6+6+6+3
        System.out.println(remainder1);

        int remainder2=27%5;
        //5+5+5+5+5+2
        System.out.println(remainder2);

        int number=10+5-3 ;

        int number1=10*5-3 ;

        int number2=3+10*5;

        int number3=3*10%7 ;

        //7+7+7+7+2

        int number4=3+4*5-24/2;
        //3+20-2=21

        double number5=(3+4)*(5-4)/2.0;
        //7*1/2==3.5
        System.out.println(number5);









    }
}
