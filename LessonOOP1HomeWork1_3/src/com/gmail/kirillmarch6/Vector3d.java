package com.gmail.kirillmarch6;

public class Vector3d {

	private int x;
	private int y;
	private int z;
	
	public Vector3d(int x, int y, int z) {
		super();
		this.x = x;
		this.y = y;
		this.z = z;
	}

	public Vector3d() {
		super();
	}

	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}

	public int getZ() {
		return z;
	}

	public void setZ(int z) {
		this.z = z;
	}
	
	public void summVectors3d(Vector3d vectorB) {
		double resX;
		double resY;
		double resZ;
		resX = this.x + vectorB.getX();
		resY = this.y + vectorB.getY();
		resZ = this.z + vectorB.getZ();
		System.out.println("x = " + resX + "; y = " + resY + "; z =  " + resZ);
	}
	
	public void productScalarVectorsd(Vector3d vecrorB) {
		double resX;
		double resY;
		double resZ;
		resX = this.x * vecrorB.getX();
		resY = this.y * vecrorB.getY();
		resZ = this.z * vecrorB.getZ();
		System.out.println(resX + resY + resZ);				
	}
	
	public void productVecors3d(Vector3d vectorB) {
		double resX;
		double resY;
		double resZ;
		resX = this.y * vectorB.getZ() - this.z * vectorB.getY();
		resY = this.z * vectorB.getX() - this.x * vectorB.getZ();
		resZ = this.x * vectorB.getY() - this.y * vectorB.getX();
		System.out.println("x = " + resX + "; y = " + resY + "; z =  " + resZ);
	}
	
}
