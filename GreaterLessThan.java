public class GreaterLessThan {
    public static void main(String[] args) {

        double creditsEarned = 176.5;
        double creditsOfSeminar = 8;
        double creditsToGraduate = 180;

        System.out.println(creditsEarned > creditsToGraduate);
        //should print false 

        double creditsAfterSeminar = creditsOfSeminar + creditsEarned;

        System.out.println(creditsAfterSeminar > creditsToGraduate);
    }
}