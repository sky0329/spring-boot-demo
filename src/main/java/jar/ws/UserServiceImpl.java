/**   
 * Copyright © 2017 青岛鼎信通讯股份有限公司. All rights reserved.
 * 
 * @author: wjq   
 * @date: 2017年6月28日 上午9:52:45  
 * @Modify:
 */
package jar.ws;


/** 
 * @author: wjq
 * @date: 2017年6月28日 上午9:52:45 
 * @Modify: 
 */
public class UserServiceImpl implements UserService{
	User user = new User();
    public UserServiceImpl() {
        
    }
	 
	/*  
	 * @param userId
	 * @return 
	 * @see jar.ws.UserService#getName(java.lang.String) 
	 */
	@Override
	public String getName(String userId) {
		return user.getUserName();
	}
	/*  
	 * @param userId
	 * @return 
	 * @see jar.ws.UserService#getUser(java.lang.String) 
	 */
	@Override
	public User getUser(String userId) {
		User user = new User();
		user.setAge("100");
        user.setUserName("wjq");
        user.setUserId("id");
		System.out.println(user.toString());
		return user;
	}
    
}
