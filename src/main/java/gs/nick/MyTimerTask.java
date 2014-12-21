package gs.nick;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 *
 * @author nickfun
 */
public class MyTimerTask extends java.util.TimerTask {

	private final Logger oLog;
	private int i;

	public MyTimerTask() {
		oLog = LoggerFactory.getLogger(MyTimerTask.class);
                oLog.debug("Timer Created");
		i = 0;
	}
        
        public int getTime() {
            return i;
        }

	@Override
	public void run() {
		i++;
//		oLog.info("====");
//		oLog.info("====");
//		oLog.info(">>>> i is " + i);
	}
}
