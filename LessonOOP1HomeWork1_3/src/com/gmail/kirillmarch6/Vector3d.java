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

	public double[] summVectors3d(Vector3d vectorB) {
		double[] res = new double[3];
		res[0] = this.x + vectorB.getX();
		res[1] = this.y + vectorB.getY();
		res[2] = this.z + vectorB.getZ();
		return res;
	}

	public double productScalarVectorsd(Vector3d vecrorB) {
		double res;
		res = this.x * vecrorB.getX() + this.y * vecrorB.getY() + this.z * vecrorB.getZ();
		return res;
	}

	public double[] productVecors3d(Vector3d vectorB) {
		double[] res = new double[3];
		res[0] = this.y * vectorB.getZ() - this.z * vectorB.getY();
		res[1] = this.z * vectorB.getX() - this.x * vectorB.getZ();
		res[2] = this.x * vectorB.getY() - this.y * vectorB.getX();
		return res;
	}

}
