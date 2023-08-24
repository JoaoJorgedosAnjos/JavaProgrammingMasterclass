package section04.InteliijBasics.ifThenStatement;

public class Main {
    public static void main(String[] args) {
        //If then Statement
        boolean isAlien = false;
        if (isAlien == false) {
            System.out.println("It is not an alien!");
            System.out.println("And I am scared of aliens");
        }
        //Locigal and Operator
        int topScore = 80;
        if(topScore < 100){
            System.out.println("You got high score!");
        }
        //Locial Or
        int secondTopScore = 81;
        if ((topScore > secondTopScore) && (topScore < 100)){
            System.out.println("Greater than second top score and less than 100");
        }

        if ((topScore > 90) || (secondTopScore <=90)){
            System.out.println("Either or both of the condition are true");
        }
        //Assignment Operator vs equals to Operator
        int newValue = 50;
        if (newValue == 50){
            System.out.println("This is true");
        }
        boolean isCar = false;
        if(isCar = true){
            System.out.println("This is not supposed to happen");
        }
        if(isCar == false){ // == or !=
            System.out.println("This is not supposed to happen");
        }
        //Ternary Operator
        // operand1 ? operand2 : operand3 if this ? do this :if not do this

        String makeOfCAr = "Volkswagen";
        boolean isDomestic = makeOfCAr == "Volkswagen" ? false : true;

        if (isDomestic) {
            System.out.println("This car is domestic to out country");
        }
        String s = (isDomestic) ? "This car is domestic" : "This car is not domestic";
        System.out.println(s);



        }
}
