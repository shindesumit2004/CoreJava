package OOPs.Encapsulation;

public class BankAccount2 {


        private String accHolderName;
        private String aadhaarId;
        private double balance;
        static String bankName="Bank of Maharashtra";

        public void setAccHolderName(String accHolderName) {
            this.accHolderName = accHolderName;
        }
        public void setAadhaarId(String aadhaarId) {
            this.aadhaarId = aadhaarId;
        }
        public void setBalance(double balance) {
            this.balance = balance;
        }


        public void getAccHolderName() {
            System.out.println("AccountHolder: "+accHolderName);
        }
        public void getAadhaarID(){
            System.out.println("AadhaarId: "+aadhaarId);
        }
        public void getBalance() {
            System.out.println("Balance: "+balance);
        }
    }
    class AccountHolder extends BankAccount2{
        public static void main(String[] args) {
            AccountHolder ob1= new AccountHolder();
            System.out.println("Bank Name: "+BankAccount2 .bankName);
            ob1.setAccHolderName("Sumit Shinde");
            ob1.setAadhaarId("7711 2757 2765");
            ob1.setBalance(375894.0);
            ob1.getAccHolderName();
            ob1.getAadhaarID();
            ob1.getBalance();
            System.out.println("-------------------------------------------------------------------");
            //2
            AccountHolder ob2= new AccountHolder();
            System.out.println("Bank Name: "+BankAccount2.bankName);
            ob2.setAccHolderName("Rohit");
            ob2.setAadhaarId("2737 3765 8263");
            ob2.setBalance(363527.0);
            ob2.getAccHolderName();
            ob2.getAadhaarID();
            ob2.getBalance();
            System.out.println("-------------------------------------------------------------------");
            //3
            AccountHolder ob3= new AccountHolder();
            System.out.println("Bank Name: "+BankAccount2.bankName);
            ob3.setAccHolderName("Arjun khotkar");
            ob3.setAadhaarId("3765 3666 8274");
            ob3.setBalance(38647.0);
            ob3.getAccHolderName();
            ob3.getAadhaarID();
            ob3.getBalance();
            ob3.getAccHolderName();
            System.out.println("-------------------------------------------------------------------");
            //4
            AccountHolder ob4= new AccountHolder();
            System.out.println("Bank Name: "+BankAccount2.bankName);
            ob4.setAccHolderName("Hikmat Udhan");
            ob4.setAadhaarId("7837 3627 8273");
            ob4.setBalance(10000.0);
            ob4.getAccHolderName();
            ob4.getAadhaarID();
            ob4.getBalance();
            ob4.getAccHolderName();
            System.out.println("-------------------------------------------------------------------");
            //5
            AccountHolder ob5= new AccountHolder();
            System.out.println("Bank Name: "+BankAccount2.bankName);
            ob5.setAccHolderName("Rajesh Tope");
            ob5.setAadhaarId("0987 2873 8374");
            ob5.setBalance(40000.0);
            ob5.getAccHolderName();
            ob5.getAadhaarID();
            ob5.getBalance();
            ob5.getAccHolderName();
            System.out.println("-------------------------------------------------------------------");
            //6
            AccountHolder ob6= new AccountHolder();
            System.out.println("Bank Name: "+BankAccount2.bankName);
            ob6.setAccHolderName("Ekanath Shinde");
            ob6.setAadhaarId("8098 2873 8273");
            ob6.setBalance(363527.0);
            ob6.getAccHolderName();
            ob6.getAadhaarID();
            ob6.getBalance();
            ob6.getAccHolderName();
            System.out.println("-------------------------------------------------------------------");
            //7
            AccountHolder ob7= new AccountHolder();
            System.out.println("Bank Name: "+BankAccount2.bankName);
            ob7.setAccHolderName("Prakash Solanke");
            ob7.setAadhaarId("1009 8298 9827");
            ob7.setBalance(8788.9);
            ob7.getAccHolderName();
            ob7.getAadhaarID();
            ob7.getBalance();
            ob7.getAccHolderName();
            System.out.println("-------------------------------------------------------------------");
            //8
            AccountHolder ob8= new AccountHolder();
            System.out.println("Bank Name: "+BankAccount2.bankName);
            ob8.setAccHolderName("Rahul Narvekar");
            ob8.setAadhaarId("3874 3874 2763");
            ob8.setBalance(38744.0);
            ob8.getAccHolderName();
            ob8.getAadhaarID();
            ob8.getBalance();
            ob8.getAccHolderName();
            System.out.println("-------------------------------------------------------------------");
            //9
            AccountHolder ob9= new AccountHolder();
            System.out.println("Bank Name: "+BankAccount2.bankName);
            ob9.setAccHolderName("Karan Arjun");
            ob9.setAadhaarId("9722 9457 9182");
            ob9.setBalance(10000.0);
            ob9.getAccHolderName();
            ob9.getAadhaarID();
            ob9.getBalance();
            ob9.getAccHolderName();
            System.out.println("-------------------------------------------------------------------");
            //10
            AccountHolder ob10= new AccountHolder();
            System.out.println("Bank Name: "+BankAccount2.bankName);
            ob10.setAccHolderName("Ram Kadam");
            ob10.setAadhaarId("2837 3563 3636");
            ob10.setBalance(88444.0);
            ob10.getAccHolderName();
            ob10.getAadhaarID();
            ob10.getBalance();
            ob10.getAccHolderName();
            System.out.println("-------------------------------------------------------------------------------");

            //11
            AccountHolder ob11 = new AccountHolder();
            System.out.println("Bank Name: "+BankAccount2.bankName);
            ob11.setAccHolderName("Vijay Pandit");
            ob11.setAadhaarId("1212 4343 7878");
            ob11.setBalance(120005789.0);
            ob11.getAccHolderName();
            ob11.getAadhaarID();
            ob11.getBalance();
            ob11.getAccHolderName();
            System.out.println("---------------------------------------------------------------------------------");

            //12

        }
    }



