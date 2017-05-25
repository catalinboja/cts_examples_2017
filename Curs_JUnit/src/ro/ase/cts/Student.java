package ro.ase.cts;

public class Student {
	int varsta;
	int[] note;
	
	public Student(int varsta) {
		super();
		this.varsta = varsta;
	}
	
	

	public Student(int varsta, int[] note) {
		super();
		this.varsta = varsta;
		this.note = new int[note.length];
		for(int i=0;i<note.length;i++)
			this.note[i] = note[i];
	}

	public int getVarsta() {
		return varsta;
	}

	public void setVarsta(int varsta) {
		this.varsta = varsta;
	}
	
	public float medie(){
		float s = 0;
		for(int nota: note)
			s+=nota;
		return s/note.length;
	}
	
}
