import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;

public class Log4j1 {

	private static final Logger logger = Logger.getLogger(Log4j1.class);
    private static final Logger logger1 = Logger.getLogger("TDRLogger");

    public static void main(String[] args) {
    	String log4jConfPath = "C:\\Spring-Projects\\Log4j-1.X\\src\\enum_log.properties";
    	PropertyConfigurator.configure(log4jConfPath);
    	logger.debug("getllevel : "+logger.getLevel());
    	logger.debug("getName : "+logger.getName());
        logger.trace("Trace Message!");
        logger.debug("Debug Message!");
        logger.info("Info Message!");
        logger.warn("Warn Message!");
        logger.error("Error Message!");
        logger.fatal("Fatal Message!");
        logger1.info("testing TDRLogger....");

		
		
		
    
    }

}
