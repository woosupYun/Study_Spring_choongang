package www.study.com.bulletinboard.model;

public class PostVO extends ReplyVO{
	private String title;			// 제목
	private BulletinBoardVO board;	// 게시판
	@Override
	public String toString() {
		return "PostVO [" + toStringPropOnly() + ", title=" + title + ", board=" + board + ", toString()=" + super.toString() + "]";
	}
	
}
