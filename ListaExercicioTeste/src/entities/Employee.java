package entities;

public class Employee {

	private Integer id;
	private String name;
	private Double altura;
	private Integer idade;
	
	public Employee() {
		
	}
	
	public Employee(Integer id, String name, Double altura, Integer idade) {
		this.id = id;
		this.name = name;
		this.altura = altura;
		this.idade = idade;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Double getAltura() {
		return altura;
	}

	public void setAltura(Double altura) {
		this.altura = altura;
	}

	public Integer getIdade() {
		return idade;
	}

	public void setIdade(Integer idade) {
		this.idade = idade;
	}
		
	public String toString() {
		return " Id: " + id + " / " + "Name: " + name + " / " + "Altura: " + altura + " / " + "Idade: " + idade + "|";
	}
	
}
