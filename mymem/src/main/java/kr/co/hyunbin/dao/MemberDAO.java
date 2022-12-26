package kr.co.hyunbin.dao;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import kr.co.hyunbin.vo.MemberVO;

public interface MemberDAO {
	int insertMember(MemberVO vo);
	int deleteMember(String memId);
	int deleteAllMember();
	int updateMember(MemberVO vo);
	
	
	MemberVO selectMember(String memId);
	List<MemberVO> selectAllMember(String memName);
	MemberVO selectPasswordMember(Map<String, String> mapinfo);
	
	/*MemberVO getTestGet(HashMap<String, String> mapData);*/
}