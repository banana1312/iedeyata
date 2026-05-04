/**
 * All Rights Reserved, Copyright(c) Fujitsu Learning Media Limited

 * LinearSearch.java
 *
 */
package chap2.s6.q3.advanced;

import util.StandardInput;

public class LinearSearch {

	public static void main(String[] args) {

		// 1.数値が昇順に入力済みの配列を定義する。
		int[] num = {7, 13, 28, 33, 50, 57, 69, 86, 91, 108, 111, 126, 135, 150, 158};

		// 2.変数を定義する。
		System.out.println("数値を入力してください");
		int data = StandardInput.readInt();
		boolean found = false;

		// 3.データを検索する（探索ループ）。
		for (int i = 0; i < num.length; i++) {
			if (num[i] == data)
			{
				found = true;

			}
		}

		// 4.結果を表示する。
		if (found)
		{
			System.out.println("結果　：当たり");
		} else
			{
				System.out.println("結果　：はずれ");
			}
	}
}