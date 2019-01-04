import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;

public class PrintWriterDemo {
    public static void main(String[] args) throws FileNotFoundException, UnsupportedEncodingException {
        PrintWriter pw = new PrintWriter("a.txt","utf-8");
        pw.println("nihao");
        pw.close();// 如果不加入close则不会写入缓存
    }
}
