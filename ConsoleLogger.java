Class ConsoleLogger extends ALogger{
	public ConsoleLogger(int level){
		this.level = level;
	}

	@Override
    protected void write(String message) {		
       System.out.println("Console::Logger::"+ message);
    }
}