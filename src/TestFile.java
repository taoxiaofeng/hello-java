/**
 * Created by Administrator on 2017/4/22.
 */
import java.io.*;
public class TestFile
{
    public static void main(String args[]) throws Exception
    {
        BufferedReader br = new BufferedReader(
                new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new FileWriter("input.txt"));
                String s;
        while (true)
        {
            System.out.print("请输入一个字符串： ");
            System.out.flush();
            s=br.readLine();
            if (s.length()==0) break;
            bw.write(s);
            bw.newLine();
        }
        bw.close();
    }
}
