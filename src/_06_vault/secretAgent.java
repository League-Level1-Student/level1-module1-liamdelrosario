package _06_vault;

public class secretAgent {

	public int findCode(Vault v) {
		for (int i = 0; i < 1000000; i++) {
			if (v.tryCode(i)) {
				return i;
			} 

		}
		return -1;
	}

}
