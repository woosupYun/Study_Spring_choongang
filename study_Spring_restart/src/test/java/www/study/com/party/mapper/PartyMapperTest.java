package www.study.com.party.mapper;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.MethodSorters;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import www.study.com.party.model.PartyVO;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration({"file:src/main/webapp/WEB-INF/spring/root-context.xml"})
//테스트 순서는 이름 오름차순으로 하겠다.
@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class PartyMapperTest {
	@Autowired
	private PartyMapper partymapper;
	
	//@Test
	public void test_aa_사용자아이디바탕으로찾기() {
		try {
			PartyVO party = partymapper.findPartyByLoginID("a");
			System.out.println(party);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	
	/*
	 * 
	 */
	@Test
	public void test_ab_사용자를연락처까지함께아이디바탕으로찾기() {
		try {
			//Method Signiture
			PartyVO party = partymapper.findPartyWithContactPointByLoginID("a");
			System.out.println(party);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
