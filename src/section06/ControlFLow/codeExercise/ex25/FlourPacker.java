package section06.ControlFLow.codeExercise.ex25;

public class FlourPacker {
    public static void main(String[] args) {
        System.out.println(canPack(2, 1, 5));
//        System.out.println(canPack(1, 0, 4));
//        System.out.println(canPack(1, 0, 5));
//        System.out.println(canPack(0, 5, 4));
//        System.out.println(canPack(2, 2, 11));
//        System.out.println(canPack(-3, 2, 12));
    }

    public static boolean canPack(int bigCount, int smallCount, int goal) {
        if (bigCount < 0 || smallCount < 0 || goal < 0) {
            return false;
        }

        int totalKilos = (bigCount * 5) + smallCount;

        if (totalKilos >= goal) {
            if (goal % 5 <= smallCount) {
                return true;
            }
        }

        return false;
    }
}


