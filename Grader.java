/*
 * Grader.java
 * 
 * Copyright 2016 graf <graf@chillosphere.spacepotato>
 * 
 * This program is free software; you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation; either version 2 of the License, or
 * (at your option) any later version.
 * 
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 * 
 * You should have received a copy of the GNU General Public License
 * along with this program; if not, write to the Free Software
 * Foundation, Inc., 51 Franklin Street, Fifth Floor, Boston,
 * MA 02110-1301, USA.
 * 
 * 
 */


public class Grader {
	
	
	private double finalExam;
	private double midterm;
	private double quiz1;
	private double quiz2;
	private double average;
	private char grade;
	
	
	private void inputGrades(double q1, double q2, double mid, double fin){
		quiz1 = q1;
		quiz2 = q2;
		midterm = mid;
		finalExam = fin;
		}
	public void getGrades(){
		System.out.println("first quiz: " + quiz1);
		System.out.println("second quiz: " + quiz2);
		System.out.println("midterm: " + midterm);
		System.out.println("final: " + finalExam);
		}	
	public void generateAverage(){
		average = (((quiz1 + quiz2) / 2) * 0.25) + (midterm * 0.25) + (finalExam * 0.5);
		}
	public void getAverage(){
		System.out.println("average: " + average);
		}
	public void assignGrade(){
		if (average >= 90) {
			grade = 'a';
			}
		else if (average >= 80) {
			grade = 'b';
			}
		else if (average >= 70) {
			grade = 'c';
			}
		else {
			grade = 'f';
			}		
		}
	public void returnLetterGrade(){
		System.out.println("your grade is: " + grade);
		}	
	
		
	
			
	public static void main (String args[]) {
		Grader demo = new Grader();
		demo.inputGrades(100.00, 100.00, 90.0, 90.0);
		demo.getGrades();
		demo.generateAverage();
		demo.getAverage();
		demo.assignGrade();
		demo.returnLetterGrade();
	
	}
}

