package ClosestThreePoints;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) throws FileNotFoundException{
		ArrayList<Point> xlist = new ArrayList<Point>();
		ArrayList<Point> ylist = new ArrayList<Point>();
		File f = new File("in");
		Scanner scn = new Scanner(f);
		while(scn.hasNext()){
			Point p = new Point();
			p.id = scn.nextInt();
			p.x = scn.nextDouble();
			p.y = scn.nextDouble();
			xlist.add(p);
			ylist.add(p);
		}
		Collections.sort(xlist, new xComparator());
		Collections.sort(ylist, new yComparator());
		System.out.println(xlist);
		System.out.println(ylist);
		for(int i = 0; i < xlist.size(); i++){
		}
	}
	
	private static class Point {
		public int id;
		public double x;
		public double y;
		public PriorityQueue<Integer> closest = new PriorityQueue<Integer>();
		
		
		public String toString(){
			return "" + id + " " + x + " " + y;
		}
	}
	
	private static class xComparator implements Comparator<Point>{
		public int compare(Point a, Point b){
			if(a.x == b.x) return 0;
			if(a.x < b.x) return -1;
			return 1;
			
		}
	}
	private static class yComparator implements Comparator<Point>{
		public int compare(Point a, Point b){
			if(a.y == b.y) return 0;
			if(a.y < b.y) return -1;
			return 1;
			
		}
	}

	
	
}
