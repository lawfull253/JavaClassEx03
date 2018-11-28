public class Main {

	public static void main(String[] args) {
				
		// <문제>		
		// AA 클래스를 상속받아서 AAA 클래스 만들기
		AAA aaa = new AAA();		
		aaa.printName();			
		// <결과>
		// 홍길동
		
		
		// <문제>		
		// BB 클래스를 상속받아서 BBB 클래스 만들기
		BB bb = new BBB();
		bb.printName();		
		// <결과>
		// 홍길동
		
		
		// <문제>
		// CC 클래스를 상속받아서 CCC 클래스 만들기
		CC cc = new CCC();
		cc.printName();		
		// <결과>
		// 홍길동
		
		
		// <문제>
		// DD 인터페이스를 상속받아서 DDD 클래스 만들기		
		DD dd = new DDD();
		dd.printName();
		// <결과>
		// 홍길동
		
		
		// <문제>
		// EE 클래스를 상속받아서 EEE 클래스 만들기		
		EE ee = new EEE();
		ee.printName();
		ee.printAge();
		// <결과>
		// 홍길동
		// 30살
		
		
		// <문제>
		// FF 클래스를 상속받아서 FFF 클래스 만들기		
		FF ff = new FFF();
		ff.printName();
		ff.printAge();
		// <결과>
		// 홍길동
		// 30살
		
		
		// <문제>
		// GG 추상클래스를 상속받아서 GGG 클래스 만들기		
		GG gg = new GGG();
		gg.printName();
		gg.printAge();
		// <결과>
		// 홍길동
		// 30살
		
		
		// <문제>
		// HH 인터페이스를 상속받아서 HHH 클래스 만들기		
		HH hh = new HHH();
		hh.printName();
		hh.printAge();
		// <결과>
		// 홍길동
		// 30살
		
		
		// <문제>
		// II 인터페이스를 상속받아서 III1, III2, III3, III4 클래스 만들기	
		II ii1 = new III1();
		II ii2 = new III2();
		II ii3 = new III3();
		II ii4 = new III4();
		
		ii1.printJob();
		ii2.printJob();
		ii3.printJob();
		ii4.printJob();
		// <결과>
		// 의사
		// 가수
		// 배우
		// 학생
		
		
		// <문제>
		// Player 인터페이스를 상속받아서 Warrior, Knight, Hunter, Mage 클래스 만들기		
		Warrior warrior = new Warrior();
		Knight knight = new Knight();
		Hunter hunter = new Hunter();
		Mage mage = new Mage();
		
		Player player = warrior;		
		player.printJob();
		player.printSkill();
		player.printSkillR();
		
		player = knight;
		player.printJob();
		player.printSkill();
		player.printSkillR();
		
		player = hunter;
		player.printJob();
		player.printSkill();
		player.printSkillR();
		
		player = mage;
		player.printJob();
		player.printSkill();
		player.printSkillR();
//		// <결과>
		// [전사]
		// <돌진>
		// <<<분노의 쌍검>>>
		// [기사]
		// <눈부신 방패>
		// <<<천벌의 검>>>
		// [사냥꾼]
		// <다발 사격>
		// <<<난사>>>
		// [마법사]
		// <냉기 돌풍>
		// <<<서리 고리>>>
		

	}

}
