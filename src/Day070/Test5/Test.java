package Day070.Test5;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Test {
        public static void main(String[] args) throws ParseException {
            SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");
            String s1 = "1989-12-11";
            Date date = format.parse(s1);

            new MyException();
            try {
                throw  new MyException("问题");
            } catch (MyException e) {
                System.out.println(e);
            }
        }

}
