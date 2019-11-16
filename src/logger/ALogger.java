package logger;

public abstract class ALogger {
        public static enum LEVEL{
            INFO(1),
            DEGUB(2),
            ERROR(3);
            
            private final int value;
    
            LEVEL(final int newValue) {
                value = newValue;
            }
            public int getValue() { return value; }
        }
        
       protected int level; 
       String path; 

       public void logMessage(String msg, int level){
            if(this.level==level){
                    logWriter(msg);
            }
       }
       
       public void setLevel(int level){
           this.level = level;
       }
       
       public int getLevel(){
           return this.level;
       }
       
      protected abstract void logWriter(String msg);
}
