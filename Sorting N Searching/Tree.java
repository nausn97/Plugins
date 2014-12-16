/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */



import java.util.Scanner;
import java.util.Stack;

class Node{
    int data;
    Node left;
    Node right;
}
class Tree {

    Node root = null;
    Scanner in = new Scanner(System.in);
    public static void main(String[] args) {
        
        
        Tree obj = new Tree();
        while(true){
            
            System.out.println("1. Insert ");
            System.out.println("2. Delete ");
            System.out.println("3. Search ");
            System.out.println("4. Exit ");
            System.out.println("5. Count Leaf Node ");
            System.out.println("Choose Your Option : ");
            int opt = obj.in.nextInt();
            switch(opt){
                case 1:
                {
                    obj.insert();
                    break;
                }
                case 2:
                {
                    obj.delete();
                    break;
                }
                case 3:
                {
                    obj.traverse();
                    break;
                }
                case 4:
                {
                    obj.view();
                    break;
                }
                case 5:
                {
                    obj.exit();
                    break;
                }

                case 6:
                {
                   int k =  obj.getLeafCount(obj.root);
                   System.out.println("Number of Leaf : "+k);
                    break;
                }
            }
        }
        
        
    }
    
    public void insert(){
        System.out.println("Enter Number : ");
        int temp = in.nextInt();
        Node node = new Node();
        node.data = temp;
        node.left = null;
        node.right = null;
        if(root == null){
            root = node;
        }
        else{
            Node obj = root;
            while(true){
                if(temp <= obj.data){                    
                    if(obj.left==null){
                        obj.left = node;
                        break;
                    }
                    else{
                        obj = obj.left;
                    }
                }
                else{
                    if(obj.right==null){
                        obj.right = node;
                        break;
                    }
                    
                    else{
                        obj = obj.right;
                    }
                }
                
            }
            
            
        }
        
        
    }
    
    public void delete(){
        
    }
    public void traverse(){
        while(true){
            System.out.println("1. In-Order Traverse");
            System.out.println("2. Pre-Order Traverse");
            System.out.println("3. Post-Order Traverse");
            int ch = in.nextInt();
            switch(ch){
                case 1:{
                    inOrder();
                    break;
                }
                case 2:{
                    preOrder();
                    break;
                }
                case 3:{
                    postOrder();
                    break;
                }
            }
        }
        
    }
    
    
    public void preOrder(){
        Node obj = root;
        Node temp = new Node();
        Stack<Node> stack = new Stack<Node>();
        stack.push(obj);
        while(!stack.empty()){
            temp = stack.pop();
            System.out.println(temp.data);
            if(temp.right!=null){
                stack.push(obj.right);
            }
            if(temp.left!=null){
                stack.push(obj.left);
            }
            
            
        }
        
    }
    
    public void inOrder(){
        Node temp = root;
        Stack<Node> stack = new Stack<Node>();
        stack.push(root);
        while(!stack.empty()){
            
            if(temp!=null){
                stack.push(temp);
                temp = temp.left;
            }
            else{
                Node treeNode = stack.pop();
                System.out.println(treeNode.data);
                temp = treeNode.right;
            }
            System.out.print(temp.data+" ");
        }
        
    }
    public static void postOrder(){
        
    }
    
    
    
    
    public void view(){
        
    }
    
    public void exit(){
        
    }

    public int getLeafCount(Node temp){
        if(temp == null)
            return 0;         
        int count = 0;
        if( temp.left == null && temp.right == null)
            return 1;
        else{
           return (getLeafCount(temp.left) + getLeafCount(temp.right));
        }

        
    }
}
