import java.util.List;

/**
 * Created by mahmoudsalmi on 02/05/17.
 */
public class RandomiseCode {
    public static final int NUM = 917;

    public static void main(String[] args) {
        List<String> dico = getDico("/home/mahmoudsalmi/IdeaProjects/algo/dico.txt");

        for (int i = 0; i < NUM; i++) {
            System.out.println(getFileName("/home/mahmoudsalmi/IdeaProjects/algo/base/shuffle", "base.dat", i, 4));
        }

    }

    private static List<String> getDico(String fileName) {
        return null;
    }

    public static String getFileName (String path, String fileBaseName, int num, int numSize) {
        return path + ((path.endsWith("/")?"":"/")) + fileBaseName + ((fileBaseName.endsWith(".")?"":".")) + getFileNum(num, numSize);
    }

    private static String getFileNum(int num, int numSize) {
        StringBuilder res = new StringBuilder("" + num);
        while (res.length() < numSize) res.insert(0, "0");
        return res.toString();
    }
}
