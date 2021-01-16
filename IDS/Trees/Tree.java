package IDS.Trees;
import  java.util.*;
class Node
{
    int  data;
    Node left ;
    Node right;

    Node(int data)
    {
        this.data  = data;
        this.left  = null;
        this.right = null;
    }
}
class Trees {

    public void inorder(Node tree)
    {

        if(tree == null) return;
        inorder(tree.left);
        System.out.println(tree.data);
        inorder (tree.right);
    }
    public void postorder(Node node)
    {
        if(node==null) return;
        postorder(node.left);
        postorder(node.right);
        System.out.println(node.data);

    }
    public void preorder(Node node)
    {
        if(node == null) return ;
        System.out.println(node.data);
        preorder(node.left);
        preorder(node.right);
    }

    // implementing binary search tree recursively
    public Node  bstinsert(int data, Node node)
    {
      
        if( node == null ) return new Node(data);
        if(node.data< data) node.left=   bstinsert(data, node.left);
        else{
         node.right =  bstinsert(data, node.right);
        }
        return node;
    }


    //  returns the height of the binary tree (implementing iterative method)
    public int height(Node node)
    {

        if(node == null) return 0;
       
        int height = 0;
        Queue<Node> st= new PriorityQueue<>();
        st.add(node);

        while(!st.isEmpty())
        
     {
              Node temp = st.remove();
            height++;
            if(temp.left!= null)
            {
                st.add(temp.left); 
                temp  = temp.left;             
            }
            if (temp.right!=null){
                st.add(temp.right);
                temp = temp.right;
            }
        }
        return height;
    }

    //  returns height of tree recursively
    public int recHeight(Node node)
    {
        if(node == null) return -1;
        int leftheight= recHeight(node.left);
        int rightheight= recHeight(node.right);
        return Math.max(leftheight, rightheight) +1;   
    }

    
}