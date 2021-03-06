package org.litchi.cloud.zuul;

import javax.servlet.http.HttpServletRequest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.netflix.zuul.ZuulFilter;
import com.netflix.zuul.context.RequestContext;

public class PreZuulFilter extends ZuulFilter {

	private Logger logger = LoggerFactory.getLogger(PreZuulFilter.class);

	@Override
	public Object run() {
		HttpServletRequest request = RequestContext.getCurrentContext().getRequest();
		String remoteHost = request.getRemoteHost();
		String name = request.getServerName();
		logger.info("请求的接口host:" + remoteHost+"      请求的接口名称:" + name);
		return null;
	}

	@Override
	public boolean shouldFilter() {
		return true;
	}

	@Override
	public int filterOrder() {
		return 1;
	}

	@Override
	public String filterType() {
		return "pre";
	}

}
