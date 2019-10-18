package java1011;

import javax.swing.JOptionPane;

import dao.EMPDAO;

public class DEPTNO001 {

	public static void main(String[] args) {

		//static 코드는 클래스 이름이 처음 사용될 때 호출

		EMPDAO dao = new EMPDAO();
		int r = JOptionPane.showConfirmDialog(null, "정말로 삭제", "데이터 삭제?",
				JOptionPane.YES_NO_OPTION);
		if( r == JOptionPane.YES_OPTION) {
			dao.deleteEMP(9999);
			JOptionPane.showMessageDialog(null, "삭제 성공");
			
		}else {
			JOptionPane.showMessageDialog(null, "삭제하지 않음");
		}

		
/*				
		EMP emp = 

		new EMP();

		Scanner sc = new Scanner(System.in);

		while(true) {

		System.out.printf("사원번호입력:");

		int empno = sc.nextInt();

		//사원번호에 해당하는 데이터를 조회

		EMP temp = dao.getEMP(empno);

		//데이터가 없다면 다음 작업을 진행

		if(temp == null) {

		//사원번호 설정

		emp.setEmpno(empno);

		break;

		}

		//데이터가 있으면 반복문으로 시작으로 이동

		System.out.printf("중복된 번호입니다.\n");

		}


		sc.close();

		emp.setEname("PARK");

		emp.setJob("SALES");

		emp.setMgr(7788);

		Calendar cal = 

		new GregorianCalendar(

		2019, 9, 11);

		emp.setHiredate(

		new Date(cal.getTimeInMillis()));

		emp.setSal(5000);

		emp.setComm(1000);

		emp.setDeptno(20);


		int r = dao.insertEMP(emp);

		if(r >= 0) {

		System.out.printf("삽입성공\n");

		}else {

		System.out.printf("삽입실패\n");

		}

*/
		}

		}

		 