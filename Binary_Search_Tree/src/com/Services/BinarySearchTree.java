package com.Services;

import java.util.HashSet;
public class BinarySearchTree
{

		public static class Node{
			int nodeData;
			Node leftNode,rightNode;
		}
		static Node NewNode(int nodeData) {
			Node temp =new Node();
			temp.nodeData=nodeData;
			temp.leftNode=null;
			temp.rightNode=null;
			return temp;
			
		}
		
		public Node insert(Node root, int key) {
			
			if(root == null) {
				return NewNode(key);
				
			}
			
			if(key<root.nodeData) {
				root.leftNode = insert(root.leftNode,key);
			}else {
				root.rightNode= insert(root.rightNode,key);
				
			}
			return root;
		}
		public void findPairwithGIvenSum(Node root, int sum) {
		HashSet<Integer> set = new HashSet<>();
		 if (!findpairUtil(root, sum, set))
		 System.out.print("Pairs do not exit for the sum "+ sum + "\n");

		}
		
		static boolean findpairUtil(Node root, int sum,HashSet<Integer> set)
	          {
	            if (root == null)
	             return false;

	            if (findpairUtil(root.leftNode, sum, set))
	              return true;

	            if (set.contains(sum - root.nodeData)) 
	            {
	               System.out.println("Sum "+ sum);
	            	System.out.println("Pair is found ("+ (sum - root.nodeData) + ", "+ root.nodeData + ")");
	               return true;
	            }
	              else
	                 set.add(root.nodeData);

	                return findpairUtil(root.rightNode, sum, set);
	          }
}




