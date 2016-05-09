package templateMethod;

public abstract class AbstGameConnectHelper {
	
	//외부에서는 접근불가지만 하위클래스에서 overriding해야되기에 protected 접근자 사용
	//보안
	protected abstract String doSecurity(String string);
	//인증
	protected abstract boolean authentication(String id, String password);
	//권한
	protected abstract int authorization(String userName);
	//접속
	protected abstract String connection(String info);
	
	//템플릿 메소드
	public String requestConnection(String encodedInfo){
		//보안
		String decodedInfo = doSecurity(encodedInfo);
		
		String id = "aaa";
		String password = "bbb";
		
		//인증
		if(!authentication(id, password)){
			throw new Error("아이디 암호 불일치");
		}
		
		String userName = id+"Name"; 
		
		//권한
		int i = authorization(userName);
		
		switch(i){
		case 0: //매니저
			break;
		case 1: //유료회원
			break;
		case 2: //무료회원
			break;
		default: //기타상황
			break;
		}
		
		return connection(decodedInfo);
	}
}
