package com.ctrip.xpipe.redis.console.service.meta.impl;

import org.springframework.stereotype.Service;

import com.ctrip.xpipe.redis.console.model.KeepercontainerTbl;
import com.ctrip.xpipe.redis.console.service.meta.AbstractMetaService;
import com.ctrip.xpipe.redis.console.service.meta.KeepercontainerMetaService;
import com.ctrip.xpipe.redis.core.entity.DcMeta;
import com.ctrip.xpipe.redis.core.entity.KeeperContainerMeta;

/**
 * @author shyin
 *
 * Aug 17, 2016
 */
@Service
public class KeepercontainerMetaServiceImpl extends AbstractMetaService implements KeepercontainerMetaService {

	@Override
	public KeeperContainerMeta encodeKeepercontainerMeta(KeepercontainerTbl keepercontainer, DcMeta dcMeta) {
		KeeperContainerMeta keeperContainerMeta = new KeeperContainerMeta();
		
		if(null != keepercontainer) {
			keeperContainerMeta.setId(keepercontainer.getKeepercontainerId());
			keeperContainerMeta.setIp(keepercontainer.getKeepercontainerIp());
			keeperContainerMeta.setPort(keepercontainer.getKeepercontainerPort());
			keeperContainerMeta.setParent(dcMeta);
		}
		
		return keeperContainerMeta;
	}

}
