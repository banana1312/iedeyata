/**
 * All Rights Reserved, Copyright(c) Fujitsu Learning Media Limited
 *
 * BubbleSort.java
 *
 */
package chap2.s6.q4.advanced;

public class BubbleSort {

	public static void main(String[] args) {

		// 配列を定義する。
		int[] arr = {64,33,79,75,38,71,21,50,82,95};

		// バブルソートを実行する。
		// 当該ループで順位が決まる要素を指定する（基準ループ）。


		for(int i  =9; i>0 ; i--)
		{
			for(int j = 1; j<=i ; j++)
			{

					if (arr[j] < arr[j -1])
					{
						int tmp = arr[j];
						arr[j] = arr[j - 1];
						arr[j - 1] = tmp;

					}

			}
		}


			// 隣合う要素同士を比較し、必要に応じて交換する（比較ループ）。










		// 配列の要素を表示する（後処理：表示ループ）。
		for(int i = 0; i<10 ; i++)
		{
			System.out.print(arr[i] + " ");

		}



	}
}
