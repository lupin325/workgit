package com.llp.init;

import org.springframework.web.servlet.DispatcherServlet;

import javax.annotation.PostConstruct;

/**
 * @ClassName: CustomSpringDispatcherServlet
 * @Description: 设置未发现处理器时抛出异常
 * @author jorgen.yan
 * @date 2016年2月1日 上午9:21:11
 * @version V1.0
 */
public class CustomSpringDispatcherServlet extends DispatcherServlet
{
	private static final long serialVersionUID = -730584512557200564L;

	/** Throw a NoHandlerFoundException if no Handler was found to process this request? **/
	protected boolean throwExceptionIfNoHandlerFound = true;
	
	/**
	 * @Title: setThrowNoHandlerFoundException
	 * @Description: 设置抛出未发现处理器异常
	 * @return void 返回类型
	 */
	@PostConstruct
	public void setThrowNoHandlerFoundException() 
	{
		super.setThrowExceptionIfNoHandlerFound(throwExceptionIfNoHandlerFound);
	}
	
	/**
	 * Set whether to perform cleanup of request attributes after an include request, that is,
	 * whether to reset the original state of all request attributes after the DispatcherServlet
	 * has processed within an include request. Otherwise, just the DispatcherServlet's own
	 * request attributes will be reset, but not model attributes for JSPs or special attributes
	 * set by views (for example, JSTL's).
	 * <p>Default is "true", which is strongly recommended. Views should not rely on request attributes
	 * having been set by (dynamic) includes. This allows JSP views rendered by an included controller
	 * to use any model attributes, even with the same names as in the main JSP, without causing side
	 * effects. Only turn this off for special needs, for example to deliberately allow main JSPs to
	 * access attributes from JSP views rendered by an included controller.
	 */
	@Override
	public void setThrowExceptionIfNoHandlerFound(boolean throwExceptionIfNoHandlerFound) 
	{
		super.setThrowExceptionIfNoHandlerFound(throwExceptionIfNoHandlerFound);
	}
}