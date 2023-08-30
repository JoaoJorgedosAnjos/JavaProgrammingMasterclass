package section06.ControlFLow.SwithcStatement;

public class Main {
    public static void main(String[] args) {

        int switchValue = 3;
        //Old Switch
        switch (switchValue) {
            case 1:
                System.out.println("Value was 1");
                break;
            case 2:
                System.out.println("Value was 2");
            case 3:
            case 4:
            case 5:
                System.out.println("Value was 3, a 4, or 5");
                System.out.println("Actually it was a " + switchValue);
                break;
            default:
                System.out.println("Was  not 1, 2, 3, 4 or 5");
                break;
        }

        //Switch enhanced
        switch (switchValue) {
            case 1 -> System.out.println("Value was 1");
            case 2 -> System.out.println("Value was 2");
            case 3, 4, 5 -> {


                System.out.println("Value was 3, a 4, or 5");
                System.out.println("Actually it was a " + switchValue);
            }
            default -> System.out.println("Was  not 1, 2, 3, 4 or 5");
        }
    }
}
