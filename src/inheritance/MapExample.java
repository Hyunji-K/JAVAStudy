package inheritance;

import java.util.Map;
import java.util.HashMap;

public class MapExample {
  public static void main(String[] args) {

	HashMap<String, String> emails = new HashMap<String, String>();
    
    emails.put("ȫ��", "sehong@gmail.com");
    emails.put("����", "nari@gmail.com");
    emails.put("����", "junge@gmail.com");
    emails.put("����", "gah@gmail.com");
    
    System.out.printf("emails.size() -> %d\n", emails.size());
    
    // key ��� ���
    System.out.println("\n== key set ==");
    for (String key : emails.keySet()) {
      System.out.println(key);
    }
    
    // value ��� ���
    System.out.println("\n== values ==");
    for (String val : emails.values()) {
      System.out.println(val);
    }
  }
}
