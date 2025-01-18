import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;
import java.io.IOException;
 
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;  // 공백으로 구분된 문자열을 분리하기 위한 객체 선언
        int t = Integer.parseInt(br.readLine());  // 첫 줄에서 테스트 케이스의 개수를 입력받음

        for (int i = 0; i < t; i++) {
            st = new StringTokenizer(br.readLine());  // 한 줄을 읽어서 공백으로 분리
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            bw.write(a+b+"\n");
        }
        bw.flush();  // 버퍼에 저장된 모든 내용을 한 번에 출력
    }
}
