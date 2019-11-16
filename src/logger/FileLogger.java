package logger;

public class FileLogger extends ALogger{
    public FileLogger(String path, int level) {
        this.level = level;
        this.path  = path;
    }
    
    public String getPath(){
        return this.path;
    }
    
    public void setPath(String path){
         this.path = path;
    }

    protected void logWriter(String msg) {
        Singleton.getInstance().writeToFile(this.path, msg);        
    }
    
    private static class Singleton{
        private static final Singleton inst= new Singleton();
        
        private Singleton() {
               super();
           }

       public synchronized void writeToFile(String path, String msg) {
            System.out.println("File::Logger::" + path + "::" + msg);    
            //basically 
        }

        public static Singleton getInstance() {
               return inst;
        }
    }    
}
