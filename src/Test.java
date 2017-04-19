import se.supertransformer.kja.*;
import se.supertransformer.kja.testing.TestBot;

public class Test {
	public static void main(String[] args) {
		try{
			KikApi bot = KikApi.buildBot(ReadWrite.getKey("user"), ReadWrite.getKey("oath"), (short)8181, new TestBot());
			bot.setSettings(new Settings(false, false, false, false)); // manuallySendReadReceipts, receiveReadReceipts, receiveDeliveryReceipts, receiveIsTyping
			bot.init(false); // Should the init block?
			KikBot kikBot = new KikBot();
		}catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public void onTextReceived(Message msg)
	{
		System.err.println("EYYYYYY");
		msg.getChat().sendMessage(new Message("Hi there!", Message.Type.TEXT));
	}
	
}