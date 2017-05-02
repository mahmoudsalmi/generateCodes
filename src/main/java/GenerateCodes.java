import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by mahmoudsalmi on 02/05/17.
 */
public class GenerateCodes {
    public final static String CHARS = "0123456789abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ";

    public static void main(String[] args) throws FileNotFoundException {
        PrintWriter out = new PrintWriter(new FileOutputStream("codes"));

        String si = shuffle(CHARS);
        for (int i = 0; i < si.length(); i++) {

            String sj = shuffle(CHARS);
            for (int j = 0; j < sj.length(); j++) {

                String sk = shuffle(CHARS);
                for (int k = 0; k < sk.length(); k++) {

                    String sl = shuffle(CHARS);
                    for (int l = 0; l < sl.length(); l++) {

                        String sm = shuffle(CHARS);
                        for (int m = 0; m < sm.length(); m++) {
                            out.println("" + si.charAt(i) + sj.charAt(j) + sk.charAt(k) + sl.charAt(l) + sm.charAt(m));
                        }
                    }
                }
                out.flush();
            }
        }

        out.flush();
        out.close();


    }

    public static String shuffle(String input){
        List<Character> characters = new ArrayList<Character>();
        for(char c:input.toCharArray()){
            characters.add(c);
        }
        StringBuilder output = new StringBuilder(input.length());
        while(characters.size()!=0){
            int randPicker = (int)(Math.random()*characters.size());
            output.append(characters.remove(randPicker));
        }
        return output.toString();
    }
}
