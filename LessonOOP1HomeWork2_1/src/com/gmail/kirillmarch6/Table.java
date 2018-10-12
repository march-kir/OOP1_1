package com.gmail.kirillmarch6;

public class Table {
	
	Shape[] arrayShapes = new Shape[4];
	
	
	public Table(Shape[] arrayShapes) {
		super();
		this.arrayShapes = arrayShapes;
	}

	public Table() {
		super();
	}

	public Shape[] getArrayShapes() {
		return arrayShapes;
	}

	public void setArrayShapes(Shape[] arrayShapes) {
		this.arrayShapes = arrayShapes;
	}

	public void addShape(Shape shape) {
		for (int i = 0; i < arrayShapes.length; i++) {
			if(arrayShapes[i] == null) {
				arrayShapes[i] = shape;	
				System.out.println("��������� ������ " + shape.toString());
				break;
			}
			if(i==3) {
				System.out.println("������� �������� ������ ��������. ����� ���������!");
			}
		}	
	}
	
	public void deleteShape(Shape shape) {
		for (int i = 0; i < arrayShapes.length; i++) {
			if(arrayShapes[i] == shape) {
				arrayShapes[i] = null;	
				System.out.println("������� ������ " + shape.toString());
				break;
			}
			if(i==3) {
				System.out.println("������� ������� ������ ��������. ����� ������!");
			}
		}	
	}
	/*
	public String getInformation() {
		double sumArea = 0;
		String info = "�� ����� ���� ����� ������: ";
		for (int i = 0; i < arrayShapes.length; i++) {
			if(arrayShapes[i] != null) {
				info += arrayShapes[i].toString();
			}
		}	
		for (int i = 0; i < arrayShapes.length; i++) {
			if(arrayShapes[i] != null) {
				sumArea += arrayShapes[i].getArea();
			}
		}
		info += "����� ������� ���� ����� �� �����: " + sumArea;
		return info;
	}
	*/
	public void getInformation() {
		double sumArea = 0;
		System.out.println("�� ����� ����� ������:");
		for (int i = 0; i < arrayShapes.length; i++) {
			if(arrayShapes[i] != null) {
				System.out.println(arrayShapes[i].toString());
			}
		}
		System.out.println("����� ������� ���� ����� �� �����:");
		for (int i = 0; i < arrayShapes.length; i++) {
			if(arrayShapes[i] != null) {
				sumArea += arrayShapes[i].getArea();
			}
		}
		System.out.println(sumArea);
	}
	

}
