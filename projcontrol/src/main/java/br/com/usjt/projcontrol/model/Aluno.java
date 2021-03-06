package br.com.usjt.projcontrol.model;

import java.util.ArrayList;

public class Aluno extends Usuario{
	private int ra;
	private ArrayList<Turma> turmas;
	
	public Aluno() {}
	
	public int getRa() {
		return ra;
	}

	public void setRa(int ra) {
		this.ra = ra;
	}

	public ArrayList<Turma> getTurmas() {
		return turmas;
	}

	public void setTurmas(ArrayList<Turma> turmas) {
		this.turmas = turmas;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!super.equals(obj))
			return false;
		if (getClass() != obj.getClass())
			return false;
		Aluno other = (Aluno) obj;
		if (ra != other.ra)
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Aluno [RA:" + ra + ", Id:" + getId() + ", Nome:" + getNome() + ", Email:" + getEmail()
				+ ", Senha:" + getSenha() + "]";
	}

	

	
}
