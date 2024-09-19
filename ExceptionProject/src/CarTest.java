
public class CarTest {
	public static void main(String[] args) {
		System.out.println("Begin main\n");
		
		try {
			Car car = new Car();
			car.longDrive();
		}
		catch(TyrePuncturedException e) {
			System.out.println("Now searching for a Tyre puncture repairWALA "+e);
		}
		catch(SpeedLimitExceededException e) {
			System.out.println("Caught up in speed limit camera... "+e);
		}
		catch(SpeedBreakerBouncedException e) {
			System.out.println("Oh, it would have hurt my back : "+e);
		}
		
		System.out.println("\nEnd main");
		
	}
}

class TyrePuncturedException extends RuntimeException
{
	TyrePuncturedException(String msg) {
		super(msg);
	}
}
class SpeedLimitExceededException extends RuntimeException
{
	SpeedLimitExceededException(String msg) {
		super(msg);
	}
}
class SpeedBreakerBouncedException extends RuntimeException
{
	SpeedBreakerBouncedException(String msg) {
		super(msg);
	}
}

class Car
{
	void longDrive()
	{
		for(int i=1;i<=25;i++) {
			System.out.println("Kilometers driven..."+i);
			
			double v = Math.random()%10;
			
			if(v > 0.52 && v <0.55) {
				//System.out.println("\tTyre Punctured...");
				
				//RuntimeException runTimeException = new RuntimeException("Tyre Punctured...");
				//throw runTimeException;
				
				TyrePuncturedException tyrePunctException = new TyrePuncturedException("Oh No!! Tyre Punctured...");
				throw tyrePunctException;
			}
			else if(v > 0.93 && v <0.95) {
				//System.out.println("\tSpeed Limit Exceeded ...");
				
				//RuntimeException runTimeException = new RuntimeException("Speed Limit Exceeded...");
				//throw runTimeException;
				
				SpeedLimitExceededException speedLtdExd = new SpeedLimitExceededException("Wow!!! Speed Limit Exceeded...");
				throw speedLtdExd;
				
			}
			else if(v > 0.23 && v <0.25) {
				//System.out.println("\tSpeed Breaker Bounced...");
				
				//RuntimeException runTimeException = new RuntimeException("Speed Breaker bounced...");
				//throw runTimeException;
				
				SpeedBreakerBouncedException speedBreakException = new SpeedBreakerBouncedException("Oh No!!! Speed Breaker bounced...");
				throw speedBreakException;
			}
			
		}
	}
}