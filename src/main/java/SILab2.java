import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class Angle {
    int degrees;//A
    int minutes;//A
    int seconds;//A

    public Angle(int degrees, int minutes, int seconds) {
        this.degrees = degrees;
        this.minutes = minutes;
        this.seconds = seconds;
    }

    public int getDegrees() {
        return degrees;
    }

    public int getMinutes() {
        return minutes;
    }

    public int getSeconds() {
        return seconds;
    }
};

public class SILab2 {

    public static void main(String[] args) {
        ArrayList<Angle> angles = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        for(int i=0;i<n;i++) {
            int degrees = scanner.nextInt();
            int minutes = scanner.nextInt();
            int seconds = scanner.nextInt();
            Angle angle = new Angle(degrees,minutes,seconds);
            angles.add(angle);
        }
        function(angles);
    }

    public static List<Integer> function(List<Angle> angleList) {
        List<Integer> result = new ArrayList<>(); //B

        for (int i = 0; i < angleList.size(); i++) { //C
            int deg = angleList.get(i).getDegrees(); //C
            int min = angleList.get(i).getMinutes(); //C
            int sec = angleList.get(i).getSeconds(); //C
            if (deg >= 0 && deg < 360) { //D
                if (min < 0 || min > 59) //E
                    throw new RuntimeException("The minutes of the angle are not valid!"); //F
                else { //G
                    if (sec < 0 || sec > 59) //H
                        throw new RuntimeException("The seconds of the angle are not valid"); //I
                    else //J
                        result.add(deg * 3600 + min * 60 + sec); //K
                }
            }

            else if (deg == 360) { //L
                if (min == 0 && sec == 0) //M
                    result.add(deg * 3600 + min * 60 + sec); //N
                else //O
                    throw new RuntimeException("The angle is greater then the maximum"); //P
            }

            else { //Q
                throw new RuntimeException("The angle is smaller or greater then the minimum"); //R
            }
        }
        return result; //S
    }
}//T