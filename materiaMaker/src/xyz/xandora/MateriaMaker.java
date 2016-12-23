package xyz.xandora;

public class MateriaMaker {
	
	public static void main(String[] args) {

		//Name, Type, Level, Grade, Class
		materia Fire = new materia("Fire", "Green", 5, 3, "Fire");
		materia Ice = new materia("Ice", "Green", 1, 5, "Ice");
		materia Lightning = new materia("Lightning", "Green", 4, 5, "Lightning");
		
		//Item Name, Item Grade
		item Potion = new item("Potion", 1);
		item MythrilArmlet = new item("Mythril Armlet", 7);
		
		//Test cases
		materia.getMateria(Fire);
		materia.getMateria(Ice);
		materia.getMateria(Lightning);
		fusion.ruleThree(Fire, Ice);
		fusion.ruleThree(Lightning, Fire);
		fusion.ruleThree(Ice, Lightning);
		fusion.ruleThree(Ice, Ice);
		fusion.ruleFive(Ice, Fire, MythrilArmlet, 1);
		
		System.out.println();
		System.out.println("Fire vs. Ice");
		fusion.ruleOne(Fire, Ice);
		fusion.ruleTwo(Fire, Ice);
		fusion.ruleThree(Fire, Ice);
		fusion.ruleFour(Fire, Ice);
		fusion.ruleFive(Fire, Ice, MythrilArmlet, 1);
	}

}
