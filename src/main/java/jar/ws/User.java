package jar.ws;
import java.io.Serializable;

public class User implements Serializable {
    private static final long serialVersionUID = -5939599230753662529L;
    private String              userId;
    private String            userName;
    private String            age;
    //getter setter ......
    public void setUserId(String userId) {
        this.userId=userId;
    }
    public void setAge(String age) {
        this.age=age;
    }
    public String getUserId() {
        return userId;
    }
    public String getUserName() {
        return userName;
    }
    public String getAge() {
        return age;
    }
    
    public void setUserName(String userName) {
		this.userName = userName;
	}
	@Override
    public String toString(){
    	return userId+","+this.getUserName()+","+age;
    }
}