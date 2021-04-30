package polimorphsym;

public class Main {

	public static void main(String[] args) {
		/*BaseLogger[] loggers=new BaseLogger[] {new DatabaseLogger(),new FileLogger(), new EmailLogger(),new ConsoleLogger()}; 
		for (BaseLogger baseLogger : loggers) {
			baseLogger.Log("Loglama mesajý : ");
		}*/
		
		CustomerManager customerManager=new CustomerManager(new DatabaseLogger());
		customerManager.add();
	}

}
