package inheritance;

import java.util.TreeSet;

public class SetExample {
	  public static void main(String[] args) {
	    TreeSet<String> names = new TreeSet<String>();
	    
	    // ��ü �߰�(�⺻������ nature ordering�� ����)
	    names.add("Daniel");
	    names.add("Brian");
	    names.add("Eugene");
	    names.add("Adam");
	    names.add("Cate");
	    
	    // ���� ���
	    System.out.printf("names.size() -> %d\n", names.size());
	    System.out.printf("names.first() -> %s\n", names.first());
	    System.out.printf("names.last() -> %s\n", names.last());
	    
	    // Set�� ��� ��� ���
	    System.out.println("== for each ���� ��� ==");
	    for (String str : names) {
	      System.out.println(str);
	    }
	  }
	}