import se.supertransformer.kja.*;
import se.supertransformer.kja.testing.TestBot;

public class Test {
	public static void main(String[] args) {
		try{
			KikApi bot = KikApi.buildBot(ReadWrite.getKey("user"), ReadWrite.getKey("oath"), (short)8080, new TestBot());
			bot.setSettings(new Settings(false, false, false, false)); // manuallySendReadReceipts, receiveReadReceipts, receiveDeliveryReceipts, receiveIsTyping
			bot.init(false); // Should the init block?
			KikBot kikBot = new KikBot();
		}catch (Exception e) {
			e.printStackTrace();
		}
	}
}