package inheritanceassignment;

public class ElectronicDeviceMain 
{
	public static void main(String[] args) 
	{
		ElectronicDevice electronicDevice=new ElectronicDevice();
		electronicDevice.showDetails();
		
		Computer computer=new Computer();
		computer.showComputer();
		
		TV tv=new TV();
		tv.showTv();
		
		LEDTV led=new LEDTV();
		led.showLed();
		
		LCDTV lcd=new LCDTV();
		lcd.showLcdTv(); 
	}
}
