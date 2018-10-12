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
				System.out.println("Добавлена фигура " + shape.toString());
				break;
			}
			if(i==3) {
				System.out.println("Попытка добавить фигуру неудачна. Доска заполнена!");
			}
		}	
	}
	
	public void deleteShape(Shape shape) {
		for (int i = 0; i < arrayShapes.length; i++) {
			if(arrayShapes[i] == shape) {
				arrayShapes[i] = null;	
				System.out.println("Удалена фигура " + shape.toString());
				break;
			}
			if(i==3) {
				System.out.println("Попытка удалить фигуру неудачна. Доска пустая!");
			}
		}	
	}
	/*
	public String getInformation() {
		double sumArea = 0;
		String info = "На доске есть такие фигуры: ";
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
		info += "Общая площадь всех фигур на доске: " + sumArea;
		return info;
	}
	*/
	public void getInformation() {
		double sumArea = 0;
		System.out.println("На доске такие фигуры:");
		for (int i = 0; i < arrayShapes.length; i++) {
			if(arrayShapes[i] != null) {
				System.out.println(arrayShapes[i].toString());
			}
		}
		System.out.println("Общая площадь всех фигур на доске:");
		for (int i = 0; i < arrayShapes.length; i++) {
			if(arrayShapes[i] != null) {
				sumArea += arrayShapes[i].getArea();
			}
		}
		System.out.println(sumArea);
	}
	

}
