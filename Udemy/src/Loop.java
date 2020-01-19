
public class Loop {
	public static void main(String[] args) {
		int rows = 3;
		int column = 3;
		int[][] table = new int[rows][column];
		table[0][0] = 10;
		table[0][1] = 20;
		table[0][2] = 12;

		table[1][0] = 10;
		table[1][1] = 20;
		table[1][2] = 12;

		table[2][0] = 10;
		table[2][1] = 20;
		table[2][2] = 12;
		System.out.println(table.length);
		System.out.println(table[0].length);

		for (int i = 0; i < rows; i++) {
			for (int j = 0; j < column; j++) {
				System.out.print(" " + table[i][j]);
			}
			System.out.println();
		}

	}
}