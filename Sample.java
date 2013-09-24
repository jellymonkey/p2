/**
 * Created with IntelliJ IDEA.
 * User: student
 * Date: 24.09.13
 * Time: 18:19
 * To change this template use File | Settings | File Templates.
 */

import java.util.Date;

public class Sample {
    public static void main(String[] args) {
        String date_str = String.format("Today is %s", new Date());
        System.out.println(date_str);
        System.out.println(args[0]);

    }
}
