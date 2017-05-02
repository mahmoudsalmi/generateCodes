import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Solution {
    class Case {

        public Case(Scanner in) {

        }

        public void printOutput(PrintWriter out) {

        }
    }

    public static List<Case> readInput(Scanner in) {
        List<Case> res = new ArrayList<Case>();

        return res;
    }

    public static void main(String[] args) throws FileNotFoundException {
        String problem = "A";
        String fileType = "-small";
        //String fileType = "-large";

        Scanner in = new Scanner(new FileInputStream(problem + fileType + ".in"));
        PrintWriter out = new PrintWriter(new FileOutputStream(problem + fileType + ".out"));

        List<Case> cases = readInput(in);

        for (Case cas : cases) {


            cas.printOutput(out);
        }

        in.close();
        out.flush();
        out.close();
    }
}
