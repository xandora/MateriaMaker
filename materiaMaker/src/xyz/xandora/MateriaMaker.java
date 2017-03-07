package xyz.xandora;

public class MateriaMaker {
	
	public static void main(String[] args) {

		// Level, Grade, Class - Name and Type can be inferred from the Grade and Class.
		materia Fire = new materia(3, 3, "Fire");
		materia Ice = new materia(4, 1, "Ice");
		materia Lightning = new materia(4, 3, "Lightning");
		materia Firaga = new materia(5, 5 ,"Fire");
		materia Cure = new materia(3, 3, "Restorative");
		materia Defend = new materia(5, 5, "Defensive");
		
		//Item Name, Item Grade
		item Potion = new item("Potion", 1);
		item MythrilArmlet = new item("Mythril Armlet", 7);
		
		//Test cases
//		materia.getMateria(Fire);
//		materia.getMateria(Ice);
//		materia.getMateria(Lightning);
//		fusion.ruleThree(Fire, Ice);
//		fusion.ruleThree(Lightning, Fire);
//		fusion.ruleThree(Ice, Lightning);
//		fusion.ruleThree(Ice, Ice);
//		fusion.ruleFive(Ice, Fire, MythrilArmlet, 1);
		
		System.out.println();
		System.out.println("Fire vs. Ice");
		fusion.ruleOne(Fire, Ice);

		System.out.println();
		System.out.println("Fire vs. Lightning");
		fusion.ruleOne(Defend, Lightning);

		System.out.println();
		System.out.println("Fire vs. Firaga");
		fusion.ruleOne(Fire, Cure);
		
		System.out.println();
		materia.getMateriaName(Cure.materiaClass, Cure.materiaGrade);
		materia.getMateriaName(Defend.materiaClass, Defend.materiaGrade);
		
		
	}

}
