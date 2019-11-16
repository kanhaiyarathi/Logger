Class FileLogger extends ALogger{
	public FileLogger(String path, int level){
		this.path  = path;
		this.level = level; 
	}

   public String getPath(){
   		return this.path;
   }

   public String setPath(String path){
   		this.path = path;
   }

   @Override
   protected void write(String message) {		
      System.out.println("File::Logger::" + this.path +"::" + message);
   }
}