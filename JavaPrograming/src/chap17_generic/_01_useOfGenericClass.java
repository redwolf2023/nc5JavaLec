package chap17_generic;

import chap17_generic.clazz.BoardFile;
import chap17_generic.clazz.FreeBoard;
import chap17_generic.clazz.NoticeBoard;

public class _01_useOfGenericClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//자유게시판 게시글에 대한 첨부 파일
		BoardFile<FreeBoard> fBoardFile = 
					new BoardFile<FreeBoard>();
		//
		fBoardFile.setT(new FreeBoard());
		fBoardFile.getT().setfBoardNo(1);
		fBoardFile.getT().setfBoardTitle("test");
		fBoardFile.getT().setfBoardContent("test입니다.");
		fBoardFile.setBoardNo(fBoardFile.getT().getfBoardNo());

		fBoardFile.setType(fBoardFile.getT()
									 .getClass()
									 .getSimpleName()
									 .equals("FreeBoard")? 1 : 2);
	
//		FreeBoard fBoard = new FreeBoard();
//		fBoard.setfBoardNo(1);
//		fBoard.setfBoardTitle("test");
//		fBoard.setfBoardContent("test입니다.");
//		fBoardFile.setT(fBoard);
		
		//공지사항 게시글에 대한 첨부파일
		
		BoardFile<NoticeBoard> nBoradFile =
				new BoardFile<NoticeBoard>();
		NoticeBoard nBoard = new NoticeBoard();
		nBoard.setnBoardNo(2);
		nBoard.setnBoardTitle("test");
		nBoard.setnBoardContent("test입니다");
		nBoradFile.setT(nBoard);
		
		nBoradFile.setType(nBoradFile.getT()
									 .getClass()
									 .getSimpleName()
									 .equals("FreeBoard")? 1 : 2);
		
		
		
		
		
		
		
		
		
		
	}

}
