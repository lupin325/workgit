package com.llp.init;

import org.apache.log4j.Logger;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;
import org.springframework.context.support.PropertySourcesPlaceholderConfigurer;
import org.springframework.core.env.ConfigurablePropertyResolver;

/**
 * @ClassName: PropertiesPlaceholderConfigurer
 * @Description: 保存最终的发布的配置信息
 * @Description: 该类可以继承自org.springframework.context.support.PropertySourcesPlaceholderConfigurer(版本3.1后推荐)
 * @Description: 该类可以继承自org.springframework.beans.factory.config.PropertyPlaceholderConfigurer(版本3.1前推荐)
 * @author jorgen.yan
 * @date 2015年12月22日 上午11:04:28
 * @version V1.0
 */
public class PropertiesPlaceholderConfigurer extends PropertySourcesPlaceholderConfigurer
{
	private static final Logger logger = Logger.getLogger(PropertiesPlaceholderConfigurer.class);
	
	private ConfigurablePropertyResolver resolver = null;

	@Override
	protected void processProperties(ConfigurableListableBeanFactory factory, final ConfigurablePropertyResolver resolver) throws BeansException
	{
		if(logger.isDebugEnabled())
		{
			logger.debug("Properties Placehold configurer Start...");
		}
		
		super.processProperties(factory, resolver);
		this.resolver = resolver;		
					
		if(logger.isDebugEnabled())
		{		
			logger.debug("Properties Placehold configurer End...");
		}
	}

	public String getProperty(String key)
	{
		return resolver.getProperty(key);
	}
	
	public String getProperty(String key, String defaultValue)
	{
		return resolver.getProperty(key, defaultValue);
	}
}