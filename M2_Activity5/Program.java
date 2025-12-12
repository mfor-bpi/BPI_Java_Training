package ph.com.bpi.m2.act5;

public abstract class Program {
	
	private String name;
	private boolean isRunning = false;
	
	public Program() {
		
	}
	
	public Program(String name) {
		this.name = name;
	}
	 
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public boolean getIsRunning() {
		return isRunning;
	}
	
	public void setIsRunning(boolean isRunning) {
		this.isRunning = isRunning;
	}
	
	abstract void run();
	abstract void stop();
	
}

