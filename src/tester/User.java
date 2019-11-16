package tester;

import logger.ALogger;
import logger.FileLogger;

public class User {
    public User() {
        super();
    }
    
    public static void main(String[] args){
        ALogger fLog = new FileLogger("/var/log/app.log", ALogger.LEVEL.INFO.getValue());
        fLog.logMessage("This is a INFO Message", ALogger.LEVEL.INFO.getValue());
        fLog.logMessage("This is a ERROR Message", ALogger.LEVEL.ERROR.getValue());
        
        fLog.setLevel(ALogger.LEVEL.ERROR.getValue());
        fLog.logMessage("This is a second ERROR Message", ALogger.LEVEL.ERROR.getValue());
                    
        Runnable t1 = new Runnable() {
            public void run() {
                fLog.logMessage("T1::1::This is a log message from thread1:: ERROR Message", ALogger.LEVEL.ERROR.getValue());                
                fLog.logMessage("T1::2::This is a log message from thread1:: ERROR Message", ALogger.LEVEL.ERROR.getValue());                
                fLog.logMessage("T1::3::This is a log message from thread1:: ERROR Message", ALogger.LEVEL.ERROR.getValue());                
                fLog.logMessage("T1::4::This is a log message from thread1:: ERROR Message", ALogger.LEVEL.ERROR.getValue());                
                fLog.logMessage("T1::5::This is a log message from thread1:: ERROR Message", ALogger.LEVEL.ERROR.getValue());                
            }
        };

        Runnable t2 = new Runnable() {
            public void run() {
                fLog.logMessage("T2::1::This is a log message from thread2:: ERROR Message", ALogger.LEVEL.ERROR.getValue());                
                fLog.logMessage("T2::2::This is a log message from thread2:: ERROR Message", ALogger.LEVEL.ERROR.getValue());                
                fLog.logMessage("T2::3::This is a log message from thread2:: ERROR Message", ALogger.LEVEL.ERROR.getValue());                
                fLog.logMessage("T2::4::This is a log message from thread2:: ERROR Message", ALogger.LEVEL.ERROR.getValue());                
                fLog.logMessage("T2::5::This is a log message from thread2:: ERROR Message", ALogger.LEVEL.ERROR.getValue());                
            }
        };
        
        new Thread(t1).start();
        new Thread(t2).start();
        
    }
}
