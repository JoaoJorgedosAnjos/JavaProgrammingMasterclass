package section05.ExpressionsStatementsAndMore.codeExercise.ex03;

public class MegaBytesConverter {
    public static void main(String[] args) {
        printMegaBytesAndKiloBytes(0);
    }

    public static void printMegaBytesAndKiloBytes(int kiloBytes) {
        int megabytes = kiloBytes / 1024;
        int remainingKilobytes = kiloBytes % 1024;

        if (kiloBytes < 0) {
            System.out.println("Invalid Value");
        } else {
            System.out.println(kiloBytes + " KB = " + megabytes + " MB and " + remainingKilobytes + " KB");

        }
    }
}
