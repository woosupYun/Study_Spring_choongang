package www.study.com.party.model;

import java.util.Date;
import java.util.List;

import lombok.NoArgsConstructor;

@NoArgsConstructor			// 화면에서 입력한 정보를 바탕으로 HTTP를 통하여 서버로 넘어올때 활용됩니다.
public abstract class PartyVO {
	// 상위 클래스 정보 항목 조차도 private로 설정하는 이유는 Encapsulation. 정보은닉. 캡슐화
	private String loginId;	// 사용자 ID
	private String pwd;		// 비밀번호 ( 나중에는 암호화 할 것임 )
	private String name;	// 이름
	private Date birthDate;	// 생일, 창립일 등등 하위 클래스에 따라서...
	private Date joinDate;  // 가입일
	
	private List<ContactPointVO> listContactPoint;

	public PartyVO(String loginId, String pwd) {
		this.loginId = loginId;
		this.pwd = pwd;
	}

	// 객체 정보를 문자열로 표현해 줍니다. JSON에서 주요하게 활용됨.
	// 직렬화 시 관계에 의한 재귀적 호출로 무한루핑에 빠질 수 있습니다.
	@Override
	public String toString() {
		return "PartyVO [loginId=" + loginId + ", pwd=" + pwd + ", name=" + name + ", birthDate=" + birthDate
				+ ", joinDate=" + joinDate + ", listContactPoint=" + listContactPoint + "]";
	}
	
}
