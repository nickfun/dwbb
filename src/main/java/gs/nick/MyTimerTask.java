package gs.nick;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 *
 * @author nickf
 */
public class MyTimerTask extends java.util.TimerTask {

	private Logger oLog;
	private int i;

	public MyTimerTask() {
		oLog = LoggerFactory.getLogger(MyTimerTask.class);
		i = 0;
	}

	@Override
	public void run() {
		i++;
		oLog.info("====");
		oLog.info("====");
		oLog.info(">>>> i is " + i);
	}
}
