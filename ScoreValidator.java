import java.util.*;
public class ScoreValidator {

    public static int[] scoreValidator(String events[]){
        int score = 0, counter = 0;
        for(String event : events){
            if(counter == 10){
                break;
            }
            if(event.equals("W")){
                counter++;
            } else if(event.equals("WD") || event.equals("NB")){
                score += 1;
            } else {
                score += Integer.parseInt(event);
            }
        }
        return new int[]{score, counter};
    }
    public static void main(String args[]){
        String events[] = {"1","4","6","W","WD"};
        System.out.println(Arrays.toString(scoreValidator(events)));
    }
}
