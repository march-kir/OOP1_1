package com.gmail.kirillmarch6;

import java.util.Arrays;

public class Main {

	public static void main(String[] args) {
		
		Vector3d a = new Vector3d(5, -1, 3);
		Vector3d b = new Vector3d(1, 3, -4);
		
		
		System.out.println(Arrays.toString(a.summVectors3d(b)));
		System.out.println(a.productScalarVectorsd(b));
		System.out.println(Arrays.toString(a.productVecors3d(b)));

	}

}
