package inheritance;

import java.util.Map;
import java.util.HashMap;

public class MapExample {
  public static void main(String[] args) {

	HashMap<String, String> emails = new HashMap<String, String>();
    
    emails.put("홍팍", "sehong@gmail.com");
    emails.put("나리", "nari@gmail.com");
    emails.put("정애", "junge@gmail.com");
    emails.put("가희", "gah@gmail.com");
    
    System.out.printf("emails.size() -> %d\n", emails.size());
    
    // key 목록 출력
    System.out.println("\n== key set ==");
    for (String key : emails.keySet()) {
      System.out.println(key);
    }
    
    // value 목록 출력
    System.out.println("\n== values ==");
    for (String val : emails.values()) {
      System.out.println(val);
    }
  }
}
