import java.util.Arrays;
import java.util.Scanner;

public class LogicDeclaration {

    String mySelectedCode;
    Scanner courseCode = new Scanner(System.in);
    String jetbreed[] = {"JSF", "Android", "SPRING", "GIT"};
    String derby[] = {"JAVA", "HTML5", "JQUERY", "JSP"};
    String frank[] = {"PYTHON", "DATA ANALYTICS"};

    public void myLogic(){
    mySelectedCode = courseCode.nextLine().toUpperCase();
        if((Arrays.stream(jetbreed).anyMatch(mySelectedCode::equals)))
    {
        System.out.println();
    } else if (Arrays.stream(jetbreed).anyMatch(mySelectedCode::equals))
    {
        System.out.println("jetbreed");
    } else if (Arrays.stream(derby).anyMatch(mySelectedCode::equals))
    {
        System.out.println("derby");
    } else if ((Arrays.stream(frank).anyMatch(mySelectedCode::equals)))
    {
        System.out.println("frank");
    } else {
        System.out.println("GENERAL COURSE");
    }

}
}
