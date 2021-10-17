import java.util.Random;
import java.util.ArrayList;

public class Puzzling{
    Random randMachine = new Random();

    public ArrayList<Integer> getTenRolls(){
        ArrayList<Integer> result = new ArrayList<Integer>();
        for(int i=1; i<=10; i++){
            result.add((new Integer(randMachine.nextInt(20)+1)));

        }
    return result;
    }

    public char getRandomLetter(){
         char letter = (char) (randMachine.nextInt(26)+97);
        
    return letter;
    }

    public String getRandomPassword(int length){
         String password = new String();
         for(int i=1;i<=length;i++){
             char letter = (char) (randMachine.nextInt(26)+97);
             password += new String(Character.toString(letter));
         }
         

        
        return password;
    }


    public ArrayList<String> getNewPasswordSet(int length){
        ArrayList<String> set = new ArrayList<String>();
         String password = new String();
         for (int j=1;j<=length;j++){
         for(int i=1;i<=8;i++){
             char letter = (char) (randMachine.nextInt(26)+97);
             password += new String(Character.toString(letter));
         }
            set.add(password);
            password="";
         }
         

        
        return set;
    }

        public ArrayList<String> shuffleArray(String[] Array){
        ArrayList<String> letters = new ArrayList<String>();
        ArrayList<String> answer = new ArrayList<String>();
        for (String l: Array){
            letters.add(l);
        }
        while (letters.size()>=1){
            int index = randMachine.nextInt(letters.size());
            answer.add(letters.get(index));
            letters.remove(index);

        }

        return answer;

    }


}