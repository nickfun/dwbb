package gs.nick;

import io.dropwizard.lifecycle.Managed;
import java.util.Timer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 *
 * @author nickf
 */
public class TimerManager implements Managed {

	private Logger oLog;
	private MyTimerTask oTask;
	private Timer oTimer;

	public TimerManager() {
		oLog = LoggerFactory.getLogger(TimerManager.class);
		oTask = new MyTimerTask();
		oTimer = new Timer();
	}

	@Override
	public void start() throws Exception {
		oTimer.schedule(oTask, 500, 500);
		oLog.info("START TIMER");
	}

	@Override
	public void stop() throws Exception {
		oTimer.cancel();
		oLog.info("STOP TIMER");
	}
}
