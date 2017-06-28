/**   
 * Copyright © 2017 青岛鼎信通讯股份有限公司. All rights reserved.
 * 
 * @author: wjq   
 * @date: 2017年6月28日 上午10:09:57  
 * @Modify:
 */
package jar.ws;

import org.apache.cxf.endpoint.Client;
import org.apache.cxf.jaxws.endpoint.dynamic.JaxWsDynamicClientFactory;

/** 
 * @author: wjq
 * @date: 2017年6月28日 上午10:09:57 
 * @Modify: 
 */
public class WsClient {

	/** 
	 * @param args
	 * @return: void
	 * @throws Exception 
	 * @Modify:
	 */
	public static void main(String[] args) throws Exception {
		JaxWsDynamicClientFactory dcf = JaxWsDynamicClientFactory.newInstance();
		Client client = dcf.createClient("http://localhost:8080/soap/user?wsdl");
		Object[] objects = client.invoke("getUser", "wjq");
		//输出调用结果
		User user = (User)objects[0];
		System.out.println(user.toString());
		System.out.println(user.getUserId());
		System.out.println(user.getAge());
		System.out.println(user.getUserName());

	}

}
