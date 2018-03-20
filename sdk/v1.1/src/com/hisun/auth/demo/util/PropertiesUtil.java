/*
 *  Copyright (c) 2013 The CCP project authors. All Rights Reserved.
 *
 *  Use of this source code is governed by a Beijing Speedtong Information Technology Co.,Ltd license
 *  that can be found in the LICENSE file in the root of the web site.
 *
 *   http://www.cloopen.com
 *
 *  An additional intellectual property rights grant can be found
 *  in the file PATENTS.  All contributing project authors may
 *  be found in the AUTHORS file in the root of the source tree.
 */
package com.hisun.auth.demo.util;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

import org.apache.log4j.Logger;

/**
 * <p>
 * Title: PropertiesUtil
 * </p>
 * <p>
 * Description: properties工具类
 * </p>
 * <p>
 * Copyright: Copyright (c) 2013
 * </p>
 * <p>
 * Company: hisunsray
 * </p>
 * <p>
 * Date: 2013-07-09
 * </p>
 * 
 * @version 1.0
 */
public class PropertiesUtil {
	
	public static final org.apache.log4j.Logger log = Logger.getLogger(PropertiesUtil.class);
	
	public PropertiesUtil(PropertiesUtil PropertiesUtil){
		
	}
	/**
	 * 获取配置信息
	 * @param str
	 * @return
	 */
	public static String getConf(String str){
		InputStream in = PropertiesUtil.class.getResourceAsStream("/params.properties");
		Properties prop = new Properties();
		try {
			prop.load(in);
		} catch (IOException e) {
			log.info(" *** properties error ***",e);
		}
		return prop.getProperty(str);
		
	}
	
}
