package ThucHanh.ThucHanh2;

public class Main {
    public class AccountExampleTest {


        private static ThucHanh2.AccountExample accountExample;


        public static final String[] validAccount = new String[] { "123abc_", "_abc123", "______", "123456","abcdefgh" };
        public static final String[] invalidAccount = new String[] { ".@", "12345", "1234_", "abcde" };


        public static void main(String args[]) {
            accountExample = new ThucHanh2.AccountExample();
            for (String account : validAccount) {
                boolean isvalid = accountExample.validate(account);
                System.out.println("Account is " + account +" is valid: "+ isvalid);
            }
            for (String account : invalidAccount) {
                boolean isvalid = accountExample.validate(account);
                System.out.println("Account is " + account +" is valid: "+ isvalid);
            }
        }
    }
}
