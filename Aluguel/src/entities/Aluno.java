package entities;

public class Aluno {
	private String aluno;
	private String email;
	public Aluno(String aluno, String email) {
		this.aluno = aluno;
		this.email = email;
	}
	public String getAluno() {
		return aluno;
	}
	public void setAluno(String aluno) {
		this.aluno = aluno;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	
	public String toString() {
		return "Aluno: "
				+this.aluno
				+", email: "
				+this.email;
	}
}
