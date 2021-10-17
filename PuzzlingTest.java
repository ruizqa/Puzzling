public class PuzzlingTest{

    public static void main (String[] args){
        Puzzling test = new Puzzling();
        System.out.println(test.getTenRolls());
        System.out.println(test.getRandomLetter());
        System.out.println(test.getRandomPassword(8));
        System.out.println(test.getNewPasswordSet(3));
        String[] Array = {"a", "b", "c", "d", "e"};
        System.out.println(test.shuffleArray(Array));
    }

}