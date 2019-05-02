package my.bbs.model.vo;

import java.util.Date;

/**
 * 게시글 하나의 대한 정보에 사용되는 VO
 * 
 * @author Sight
 *
 */
public class BbsVO 
{
	private int     id;			// 번호
	private String  title;		// 제목
	private String  content;	// 내용
	private Date   	time;		// 작성 시간
	private int		flag;		// 게시글 상태 ( 1 : 정상, 0 : 삭제처리 )
	
	// Constructors
	public BbsVO() {};
	
	public BbsVO(int id) {
		this.id = id;
	}
	
	// ---------------- Getters & Setters -----------------
	
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}	
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public Date getTime() {
		return time;
	}
	public void setTime(Date time) {
		this.time = time;
	}
	public int getFlag() {
		return flag;
	}
	public void setFlag(int flag) {
		this.flag = flag;
	}
	
	
	// ------------ toString() --------------
	@Override
	public String toString()
	{
		return String.format(
						"BbsVO [id=%s, title=%s, content=%s, time=%s, flag=%s]", 
						id, title, content, time, flag
				);
	}
	
}
