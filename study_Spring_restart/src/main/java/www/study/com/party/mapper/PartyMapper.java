package www.study.com.party.mapper;

import org.apache.ibatis.annotations.Param;

import www.study.com.party.model.PartyVO;

public interface PartyMapper {

	// 아이디로 찾기 가시성. 명시화
	public PartyVO findPartyByLoginID(@Param("loginId") String loginId);

	public PartyVO findPartyWithContactPointByLoginID(@Param("loginId") String string);
	
}
