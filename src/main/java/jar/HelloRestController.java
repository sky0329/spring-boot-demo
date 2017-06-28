/**   
 * Copyright © 2017 青岛鼎信通讯股份有限公司. All rights reserved.
 * 
 * @author: wjq   
 * @date: 2017年6月28日 下午1:40:29  
 * @Modify:
 */
package jar;


import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/** 
 * @author: wjq
 * @date: 2017年6月28日 下午1:40:29 
 * @Modify: 
 */
@RestController
public class HelloRestController {
 
    @RequestMapping("/greeting")
    public String greeting() {
        return "Hello World!";
    }
    @RequestMapping("/users/{username}")
    public String userProfile(@PathVariable("username") String username) {
        return String.format("user %s", username);
    }
   
    @RequestMapping(value = "/login", method = RequestMethod.GET)
    public String loginGet() {
        return "Login Page";
    }

    @RequestMapping(value = "/login", method = RequestMethod.POST)
    public String loginPost() {
        return "Login Post Request";
    }
    
    @RequestMapping("/helloJson")
    public Bean helloJson() {
        return new Bean("1","wjq");
    }
  
	class Bean {
		private String id;
		private String name;
		public Bean(String id,String name){
			this.id = id;
			this.name = name;
		}
  		public String getId() {
  			return id;
  		}
  		public void setId(String id) {
  			this.id = id;
  		}
  		public String getName() {
  			return name;
  		}
  		public void setName(String name) {
  			this.name = name;
  		}
	}
}
