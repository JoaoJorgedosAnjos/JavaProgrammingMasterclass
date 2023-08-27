package section05.ExpressionsStatementsAndMore.codeExercise.ex12;

public class PlayingCat {
    public static void main(String[] args) {
        System.out.println(isCatPlaying(true, 25));
        System.out.println(isCatPlaying(false, 45));
        System.out.println(isCatPlaying(true, 46));
        System.out.println(isCatPlaying(true, 46));
    }

    public static boolean isCatPlaying(boolean summer, int temperature) {
        if (summer)
            if ((temperature >= 25) && (temperature <= 45))
                return true;
            else
                return false;
        else if (!summer)
            if ((temperature >= 25) && (temperature <= 35))
                return true;
            else
                return false;
        return false;
        /*
        public static boolean isCatPlaying(boolean summer, int temperature) {
    if (summer) {
        return (temperature >= 25) && (temperature <= 45);
    } else {
        return (temperature >= 25) && (temperature <= 35);
    }
}
*/
    }
}
