package xyz.xandora;

public class fusion {
	
	static int outputGrade = 0;
	static materia baseMateria;

	//The placement of the Materia has no effect on the outcome UNLESS they
	//both are of the same grade AND level.
	static void ruleOne(materia materiaOne, materia materiaTwo){
		if (materiaOne.materiaGrade == materiaTwo.materiaGrade && materiaOne.materiaLevel == materiaTwo.materiaLevel) {
			baseMateria = materiaOne;
			System.out.println("ruleOne: " + baseMateria.materiaName);
		} else {
			//There are exceptions to this rule, to be added.
			System.out.println("Else case!");
		}
	}

	//If the grades are the same between both Materia but their levels are
	//different, then the higher level Materia will be the base.
	static void ruleTwo(materia materiaOne, materia materiaTwo){
		if (materiaOne.materiaGrade == materiaTwo.materiaGrade){
			if (materiaOne.materiaLevel > materiaTwo.materiaLevel){
				baseMateria = materiaOne;
				System.out.println("ruleTwo (base materia): " + baseMateria.materiaName);
			} else if (materiaTwo.materiaLevel > materiaOne.materiaLevel){
				baseMateria = materiaTwo;
				System.out.println("ruleTwo (base materia): " + baseMateria.materiaName);
			} else {
				ruleOne(materiaOne, materiaTwo);
			}
		}
	}
	
	//The higher grade Materia serves as the base between the two Materia
	//and is the determinant of the product.
	static void ruleThree(materia materiaOne, materia materiaTwo){
		if (materiaOne.materiaGrade > materiaTwo.materiaGrade){
			baseMateria = materiaOne;
			System.out.println("ruleThree (determinant): " + baseMateria.materiaName);
		} else if (materiaOne.materiaGrade < materiaTwo.materiaGrade) {
			baseMateria = materiaTwo;
			System.out.println("ruleThree (determinant): " + baseMateria.materiaName);
		} else {
			ruleTwo(materiaOne, materiaTwo);
		}
	}
	
	//If the level of one of the two Materia is at Master level, the product
	//grade will increase by 1. If both are Master Materia, then the grade
	//will increase by 2.
	static void ruleFour(materia materiaOne, materia materiaTwo){
		if (materiaOne.materiaLevel == 5 || materiaTwo.materiaLevel == 5){
			outputGrade = Math.max(materiaOne.materiaGrade, materiaTwo.materiaGrade) + 1;
		} else if (materiaOne.materiaLevel == 5 && materiaTwo.materiaLevel == 5){
			outputGrade = Math.max(materiaOne.materiaGrade, materiaTwo.materiaGrade) + 2;
		} else {
			outputGrade = outputGrade + 0;
		}
		System.out.println("ruleFour (grade): " + outputGrade);
	}
	
	//An item grade can determine the maximum grade of the resulting Materia.
	static void ruleFive(materia materiaOne, materia materiaTwo, item item, int itemQuantity){
		if (materiaOne.materiaGrade < item.itemGrade && materiaTwo.materiaGrade < item.itemGrade ) {
			outputGrade = Math.max(materiaOne.materiaGrade,  materiaTwo.materiaGrade) + (1 * itemQuantity);
			System.out.println("ruleFive (max. grade): " + outputGrade);
		}
	}
	
}
