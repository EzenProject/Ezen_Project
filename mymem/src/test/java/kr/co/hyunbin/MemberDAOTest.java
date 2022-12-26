package kr.co.hyunbin;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import kr.co.hyunbin.dao.MemberDAO;
import kr.co.hyunbin.vo.MemberVO;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("file:src/main/webapp/WEB-INF/spring/root-context.xml")
public class MemberDAOTest {
	@Autowired
	ApplicationContext context;
	
	@Autowired
	MemberDAO dao;
	
	@Test
	public void getAllTest() {
		String memName = null;
		List<MemberVO> list = dao.selectAllMember(memName); 
		for(MemberVO vo : list) {
			System.out.println(vo);
		}
		System.out.println("위의 조회 조건은 전체 목록을 가져옴");
		
		memName = "o";
		list = dao.selectAllMember(memName); 
		for(MemberVO vo : list) {
			System.out.println(vo);
		}
	}
	
	@Test
	public void getMemberPasswordTest() {
		Map<String, String> selDataMap = new HashMap<String, String>();
		selDataMap.put("memId", "kim");
		selDataMap.put("memPwd", "aaaa1234");
		MemberVO vo = dao.selectPasswordMember(selDataMap);
		System.out.println(vo);
	}
	/*
	@Test
	public void getTestGetTest() {
		HashMap<String, String> dataMap = new HashMap<String, String>();
		dataMap.put("tableName", "members");
		dataMap.put("columnName", "memId");
		dataMap.put("dataValue", "park");
		MemberVO vo = dao.getTestGet(dataMap);
		System.out.println(vo);
	}
	*/
}