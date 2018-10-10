package com.gmail.kirillmarch6;

public class Main {

	public static void main(String[] args) {
		
		Vector3d a = new Vector3d(5, -1, 3);
		Vector3d b = new Vector3d(1, 3, -4);
		
		a.summVectors3d(b);
		a.productScalarVectorsd(b);
		a.productVecors3d(b);

	}

}
