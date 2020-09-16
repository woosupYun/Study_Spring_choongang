package www.study.com.bulletinboard.model;

import www.study.com.party.model.PartyVO;

public class ReplyVO {
	private String hierarchyId; // 계층 구조에 따른 아이디
	private String content; // 게시글 내용

	//연관된 객체 사이의 정보
	private PartyVO writer; // 작성자

	@Override
	public String toString() {
		return "ReplyVO [hierarchyId=" + hierarchyId + ", content=" + content + ", writer=" + writer + "]";
	}
	
	protected String toStringPropOnly() {
		return "ReplyVO [hierarchyId=" + hierarchyId + ", writer=" + writer;
	}

}
