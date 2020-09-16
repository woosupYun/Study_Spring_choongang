/*
 * Mapper는 Mybatis에 의하여 객체가 만들어 져야 합니다.
 * 따라서 Root-Context에 등재가 필수적 입니다.
 */
package www.study.com.bulletinboard.mapper;

import org.apache.ibatis.annotations.Param;

import www.study.com.bulletinboard.model.PostVO;

public interface PostMapper {

	public PostVO findPostWithWriter(@Param("postId")String string);
	
}
