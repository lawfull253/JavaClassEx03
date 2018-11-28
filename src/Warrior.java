
public class Warrior implements Player{
	@Override
	public void printJob() {
		System.out.println("[전사]");
		
	}
	
	@Override
	public void printSkill() {
		System.out.println("<돌진>");
	}
	
	@Override
	public void printSkillR() {
		System.out.println("<<<분노의 쌍검>>>");
		
	}
}
