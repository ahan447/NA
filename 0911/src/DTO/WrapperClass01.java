package DTO;

import java.math.BigDecimal;

public class WrapperClass01 {

	public static void main(String[] args) {
		//기본형 데이터를 Wrapper Class 객체로 만들기
		//auto boxing이 지원되므로 바로 대입
		Integer i = 102;
		//문자열을 정수로 변환
		String str = "187";
		System.out.println(str+90);//문자열과 숫자는 +하면 문자열로 결합
		int su = Integer.parseInt(str);
		System.out.println(su+90);
		//문자열을 숫자로 변경할 때는 변경할 수 없는 문자가 있거나 공백이 있으면
		//NumberFormatException 이 발생
		/*
		su = Integer.parseInt(" 189");
		로 한후 run 시
		
		18790
		Exception in thread "main" 277
		java.lang.NumberFormatException: For input string: " 189"
			at java.lang.NumberFormatException.forInputString(NumberFormatException.java:65)
			at java.lang.Integer.parseInt(Integer.java:569)
			at java.lang.Integer.parseInt(Integer.java:615)
			at DTO.WrapperClass01.main(WrapperClass01.java:16)
		*/
		
		//double 은 소수 15자리까지만 인식함.
		//아래의 경우 2.0 출력됨
		double d1 =1.0000000000000000001;
		double d2 =1.000000000000000003;
		System.out.println(d1+d2);
		
		//위의 연산을 BigDecimal로 해결
		BigDecimal b1 = new BigDecimal(
				"1.0000000000000000001");
				BigDecimal b2 = new BigDecimal(
						"1.000000000000000003");
				System.out.println(b1.add(b2));
	}

}
