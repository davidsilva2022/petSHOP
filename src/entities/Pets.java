package entities;

public class Pets {
	public String raca;
	public int pelos;
	public int tamanho;
	public int value;
	public int pelosCondition() {
		switch(pelos) {
		case 1:
			value = 50;
			break;
		case 2:
			value = 55;
			break;
		case 3:
			value = 60;
			break;
		case 4:
			value = 65;
			break;
		case 5:
			value = 70;
			break;
		}
		return value;
	}
}
