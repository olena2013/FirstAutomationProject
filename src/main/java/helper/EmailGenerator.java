package helper;

public class EmailGenerator {
    public static String createEmail(){
       long number = System.currentTimeMillis();

      StringBuilder builder = new StringBuilder();
      builder.append("test")
              .append("+")
              .append(number)
              .append("@gmail.com");

      String email = builder.toString();
      return email;
    }
}
