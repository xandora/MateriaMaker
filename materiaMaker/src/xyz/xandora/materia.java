package xyz.xandora;

import java.util.Objects;

public class materia {

	private String materiaName;
	private String materiaType;
	int materiaLevel;
	int materiaGrade;
	String materiaClass;

	public materia(String materiaName,	String materiaType, int materiaLevel, int materiaGrade, String materiaClass) {
		this.materiaClass = materiaClass;
		if (materiaLevel > 0 && materiaLevel <= 5) {
			this.materiaLevel = materiaLevel;
		} else {
			throw new IllegalArgumentException("Materia Level out of bounds.");
		}
		this.materiaType = materiaType;
		this.materiaGrade = materiaGrade;
		this.materiaName = materiaName;
	}
	
	materia(int materiaLevel, int materiaGrade, String materiaClass) {
		this.materiaClass = materiaClass;
		if (materiaLevel > 0 && materiaLevel <= 5) {
			this.materiaLevel = materiaLevel;
		} else {
			throw new IllegalArgumentException("Materia Level out of bounds.");
		}
		this.materiaGrade = materiaGrade;

	}

	public static void getMateria(materia materia) {
		String materiaClass = materia.materiaClass;
		int materiaGrade = materia.materiaGrade;
		
		getMateriaName(materiaClass, materiaGrade);
		System.out.println("Class is: " + materia.materiaClass);
		System.out.println("Level is: " + materia.materiaLevel);
		System.out.println("Type is: " + materia.materiaType);
		System.out.println("Grade # is: " + materia.materiaGrade);
		System.out.println();
	}

	static String getMateriaName(String materiaClass, int materiaGrade){
		
		String[] materiaName = new String[8];
		
		if ("Fire".equals(materiaClass)){

			materiaName[0] = "Fire";
			materiaName[1] = "Fire";
			materiaName[2] = "Fira";
			materiaName[3] = "Fira";
			materiaName[4] = "Firaga";
			materiaName[5] = "Firaga";
			materiaName[6] = "Firaga";
			materiaName[7] = "Firaga";
		}
		
		if ("Ice".equals(materiaClass)) {
			
			materiaName[0] = "Blizzard";
			materiaName[1] = "Blizzard";
			materiaName[2] = "Blizzara";
			materiaName[3] = "Blizzara";
			materiaName[4] = "Blizzaga";
			materiaName[5] = "Blizzaga";
			materiaName[6] = "Blizzaga";
			materiaName[7] = "Blizzaga";
		}
		
		if ("Lightning".equals(materiaClass)) {
			
			materiaName[0] = "Thunder";
			materiaName[1] = "Thunder";
			materiaName[2] = "Thundara";
			materiaName[3] = "Thundara";
			materiaName[4] = "Thundaga";
			materiaName[5] = "Thundaga";
			materiaName[6] = "Thundaga";
			materiaName[7] = "Thundaga";
		}
		
		if ("Restorative".equals(materiaClass)) {
			
			materiaName[0] = "Cure";
			materiaName[1] = "Cura";
			materiaName[2] = "Regen";
			materiaName[3] = "Curaga";
			materiaName[4] = "Curaga";
			materiaName[5] = "Curaga";
			materiaName[6] = "Curaga";
			materiaName[7] = "Curaga";			
		}
		
		if ("Defensive".equals(materiaClass)) {
			
			materiaName[0] = "Barrier";
			materiaName[1] = "Barrier";
			materiaName[2] = "MBarrier";
			materiaName[3] = "Elemental Ward";
			materiaName[4] = "Elemental Ward";
			materiaName[5] = "Elemental Ward";
			materiaName[6] = "Wall";
			materiaName[7] = "Wall";			
		}
			
		return (materiaName[materiaGrade - 1]);
		
	}
	
}