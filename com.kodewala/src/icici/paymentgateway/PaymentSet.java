package icici.paymentgateway;

public class PaymentSet{
   public static void main(String args[]) {
	   System.out.println("IMobile main()start....");
	   doPayment(1000,"56347573" ,"098765654", "9393435534");
	   System.out.println("IMobile main()end....");
}
   public static void doPayment(int amount, String recAccoNo,String senderAccNo,String mob) {
	   System.out.println("IMobile doPayment()start....");
	   System.out.println(amount);
	   System.out.println(recAccoNo);
	   System.out.println(senderAccNo);
	   System.out.println(mob);
	   
	   
	   
	 //once transaction done send sms
	   
	   
	   sendsms(mob);
	   
	   System.out.println("IMobile doPayment()end....");
	   
	   //break point -> Hold the program execution -> wait for developer instruction(developer has the right to movefarword in the code
	  // f5-> goes to inside the method
	   //f6-> move to next  line
	   //f8 -> next break point
	   
   }
   public static void sendsms(String mobile) {
	   System.out.println("IMobile sendsms()start....");
	   System.out.println("IMobile.sendSms()...txn has been done .. sending notification to mobile # " + mobile);
	   System.out.println("IMobile sendsms()end....");
   }
   }
