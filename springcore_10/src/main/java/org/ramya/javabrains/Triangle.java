package org.ramya.javabrains;

import java.util.List;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanNameAware;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

public class Triangle implements ApplicationContextAware, BeanNameAware {

	private Point pointA;
	private Point pointB;
	private Point pointC;
	private ApplicationContext context = null;
	
	public Point getPointA() {
		return pointA;
	}

	public void setPointA(Point pointA) {
		this.pointA = pointA;
	}

	public Point getPointB() {
		return pointB;
	}

	public void setPointB(Point pointB) {
		this.pointB = pointB;
	}

	public Point getPointC() {
		return pointC;
	}

	public void setPointC(Point pointC) {
		this.pointC = pointC;
	}

	public void draw()
	{
		System.out.println("Point A = ( " +getPointA().getX() + ", " +getPointA().getY() + ")");
		System.out.println("Point A = ( " +getPointB().getX() + ", " +getPointB().getY() + ")");
		System.out.println("Point A = ( " +getPointC().getX() + ", " +getPointC().getY() + ")");
	}

	public void setBeanName(String beanName) {
		System.out.println("Bean nae is : "+beanName);
		
	}

	public void setApplicationContext(ApplicationContext context) throws BeansException {
		this.context =  context;
		System.out.println(context);
		
	}
}
