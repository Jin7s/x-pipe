package com.ctrip.xpipe.redis.console.health.sentinel;

import java.util.HashSet;
import java.util.Set;

import com.ctrip.xpipe.redis.console.health.BaseInstanceResult;

/**
 * @author wenchao.meng
 *         <p>
 *         Jun 19, 2017
 */
public class InstanceSentinelResult extends BaseInstanceResult<SentinelHello>{

    private Set<SentinelHello> hellos = new HashSet<>();

    @Override
    public void success(long rcvNanoTime, SentinelHello context) {

        logger.debug("[success]{}", context);
        hellos.add(context);
    }

    public Set<SentinelHello> getHellos() {
        return hellos;
    }
}
