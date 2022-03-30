/**
 * Created by Dell on 03/30/2022.
 */
public class Grader {

    public char determineLetterGrade(int numberGrade){
        if(numberGrade<0||numberGrade>100){
            throw  new IllegalArgumentException("Number grade can not be more than 100 or less than 0");
        }
        else if(numberGrade<60){
            return 'F';
        }
        else if(numberGrade<70){
            return 'D';
        }
        else if(numberGrade<80){
            return 'C';
        }
        else if(numberGrade<90){
            return 'B';
        }
        else return 'A';
    }
}
