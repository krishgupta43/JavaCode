package Examples;

import java.util.Stack;

public class GretestOnRight {
	public static void main(String[] args) {
		int A[] = { 2, 5, 3, 4, 1 };

		int n = A.length;

		check(A, n);
	}

	private static void check(int[] A, int n) {
		int A1[] = new int[n];
		Stack<Integer> st = new Stack<Integer>();
		st.add(0);

		for (int i = 1; i < n; i++) {
			int curr = A[i];
			while (!st.isEmpty() && curr > A[st.peek()]) {
				A1[st.peek()] = A[i];
				st.pop();
			}
			st.add(i);
		}
		while (!st.isEmpty()) {

			A1[st.peek()] = -1;
			st.pop();
		}
		for (int i = 0; i < n; i++) {
			System.out.print(A1[i] + " ");
		}

	}

}
