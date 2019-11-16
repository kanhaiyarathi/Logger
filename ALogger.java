Class ALogger{
   public static int INFO  = 1;
   public static int DEBUG = 2;
   public static int ERROR = 3;

   protected int level;
   String path; 

   public ALogger(String path){
   		this.path = path;
   }

   public void logMessage(string msg, int level){
   		if(this.level==level){
   			logWriter(msg);
   		}
   }

   public String getPath(){
   		return this.path;
   }

   public String setPath(String path){
   		this.path = path;
   }

   public abstract logWriter(String msg);
}