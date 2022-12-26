package kr.co.hyunbin.dao;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import kr.co.hyunbin.vo.MemberVO;

@Repository
public class MemberDAOImpl implements MemberDAO {
	@Autowired
	private SqlSession session;
	
	@Override
	public int insertMember(MemberVO vo) {
		return session.update("memberNS.addOne", vo);
	}

	@Override
	public int deleteMember(String memId) {
		return session.delete("memberNS.delOne", memId);
	}

	@Override
	public int deleteAllMember() {
		return session.update("memberNS.delAll");
	}

	@Override
	public int updateMember(MemberVO vo) {
		return session.update("memberNS.updaOne", vo);
	}

	@Override
	public MemberVO selectMember(String memId) {
		return session.selectOne("memberNS.getOne", memId);
	}
	
	@Override
	public MemberVO selectPasswordMember(Map<String, String> mapinfo) {
		return session.selectOne("memberNS.getOnePass", mapinfo);
	}
	/*
	<select id="getOnePass"	parameterType="java.util.Map" resultType="MemberVO">
		select * from members where memId = #{memId} and memPwd = #{memPwd}
	</select> 
	*/

	@Override
	public List<MemberVO> selectAllMember(String memName) {
		return session.selectList("memberNS.getAll", memName);
	}
	
	/*public MemberVO getTestGet(HashMap<String, String> mapData){
		return session.selectOne("memberNS.testGet", mapData);
	}*/
}