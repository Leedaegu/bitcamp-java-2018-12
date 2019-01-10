// JVM 아규먼트 응용 2
package ch06;


public class Test18 {

  public static void main(String[] args) {
    java.util.Properties props = System.getProperties();

    java.util.Set ketSet = props.keySet();

    for (Object key : ketSet) {
      String value = System.getProperty((String)key);
      System.out.printf("%s = %s\n", key, value);

    }

  }
}
