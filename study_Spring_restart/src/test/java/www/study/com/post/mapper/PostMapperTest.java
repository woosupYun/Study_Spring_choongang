package www.study.com.post.mapper;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.MethodSorters;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import www.study.com.bulletinboard.mapper.PostMapper;
import www.study.com.bulletinboard.model.PostVO;
import www.study.com.party.model.PartyVO;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration({"file:src/main/webapp/WEB-INF/spring/root-context.xml"})
//테스트 순서는 이름 오름차순으로 하겠다.
@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class PostMapperTest {
	@Autowired
	private PostMapper Postmapper;
	
	/*
	 * 아이디로게시글찾기작성자정보와함께
	 */
	//@Test
	public void test_aa_findPostWithWriter() {
		try {
			PostVO post = Postmapper.findPostWithWriter("a");
			System.out.println(post);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
