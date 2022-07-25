package com.DriverMain;

import com.Services.BinarySearchTree;
import com.Services.BinarySearchTree.Node;

public class DriverMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Node root = null;
	     BinarySearchTree findSP = new BinarySearchTree();
	        
	        root = findSP.insert(root,40);
	        root = findSP.insert(root,20);
	        root = findSP.insert(root,60);
	        root = findSP.insert(root,10);
	        root = findSP.insert(root,30);
	        root = findSP.insert(root,50);
	        root = findSP.insert(root,70);

	        int sum = 130;
	        findSP.findPairwithGIvenSum(root, sum);
	    }

	}


