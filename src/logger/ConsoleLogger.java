package logger;

public class ConsoleLogger extends ALogger{
    public ConsoleLogger(int level) {
        this.level = level;
    }

    protected void logWriter(String message) {
        System.out.println("Console::Logger::" + message);
    }
}
