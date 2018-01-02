import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

static Scanner scan = new Scanner(System.in);
static boolean flag = true;
static int B = scan.nextInt();
static int H = scan.nextInt();

static{
    try{
        if(B <= 0 || H <= 0){
            flag = false;
            throw new Exception("Breadth and height must be positive");     //This should be done as a try / catch block, NOT just a printed statement
        }
    }catch(Exception e){
        System.out.println(e);
    }

}

public static void main(String[] args){
		if(flag){
			int area=B*H;
			System.out.print(area);
		}
		
	}

}
