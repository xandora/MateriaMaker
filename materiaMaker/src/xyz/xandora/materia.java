package xyz.xandora;

class materia {

	private String materiaName;
	private String materiaType;
	int materiaLevel;
	int materiaGrade;
	String materiaClass;

	materia(String materiaName, String materiaType, int materiaLevel, int materiaGrade, String materiaClass) {
		this.materiaName = materiaName;
        this.materiaType = materiaType;
        if (materiaLevel > 0 && materiaLevel <= 5) {
            this.materiaLevel = materiaLevel;
        } else {
            throw new IllegalArgumentException("Materia Level out of bounds.");
        }
        this.materiaGrade = materiaGrade;
        this.materiaClass = materiaClass;
	}
	
	materia(int materiaLevel, int materiaGrade, String materiaClass) {
		if (materiaLevel > 0 && materiaLevel <= 5) {
			this.materiaLevel = materiaLevel;
		} else {
			throw new IllegalArgumentException("Materia Level out of bounds.");
		}
		this.materiaGrade = materiaGrade;
        this.materiaClass = materiaClass;
    }

	static void getMateria(materia materia) {
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
		String materiaType;

		if ("Fire".equals(materiaClass)){
            materiaType = "Green";
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
            materiaType = "Green";
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
            materiaType = "Green";
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

        if ("Status Defence".equals(materiaClass)) {

            materiaName[0] = "Esuna";
            materiaName[1] = "Dispel";
            materiaName[2] = "Esuna";
            materiaName[3] = "Status Ward";
            materiaName[4] = "Dispel";
            materiaName[5] = "Status Ward";
            materiaName[6] = "Status Ward";
            materiaName[7] = "Status Ward";
        }

        if ("Absorb Magic".equals(materiaClass)) {

            materiaName[0] = "N/A";
            materiaName[1] = "Drain";
            materiaName[2] = "Osmose";
            materiaName[3] = "Drain";
            materiaName[4] = "Drainra";
            materiaName[5] = "Osmoga";
            materiaName[6] = "Drainga";
            materiaName[7] = "Drainga";
        }

        if ("Magic w/ Status".equals(materiaClass)) {

            materiaName[0] = "Poison";
            materiaName[1] = "Silence";
            materiaName[2] = "Silence";
            materiaName[3] = "Stop";
            materiaName[4] = "Death";
            materiaName[5] = "Death";
            materiaName[6] = "Death";
            materiaName[7] = "Death";
        }

        if ("Fire w/ Status".equals(materiaClass)) {

            materiaName[0] = "Dark Fire";
            materiaName[1] = "Dark Fire";
            materiaName[2] = "Dark Fira";
            materiaName[3] = "Dark Fira";
            materiaName[4] = "Dark Firaga";
            materiaName[5] = "Dark Firaga";
            materiaName[6] = "Hell Firaga";
            materiaName[7] = "Hell Firaga";
        }
			
		return (materiaName[materiaGrade - 1]);
		
	}

}