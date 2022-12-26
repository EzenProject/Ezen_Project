package kr.co.hyunbin.vo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class MemberVO {
	private String memId;
	private String memName;
	private String memPwd;
	private String phone;
	private String regidate;
}