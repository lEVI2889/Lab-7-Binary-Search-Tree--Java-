// Complete the sumOfLeaves method
public class Task3 {

    //===================================TASK#3======================
    // This method takes only 2 parameters
    // 1st one is root
    // 2nd one is the sum initiliazed as 0
    // You'll need to return the sum of the leaf nodes
    public static Integer sumOfLeaves( BSTNode root, Integer sum ){
        // TO DO
        int l = sum_mer(root.left);
        int r = sum_mer(root.right);
        sum = l+r;
        return sum; //remove this line
    }
    //===============================================================
    public static Integer sum_mer( BSTNode root){
        if(root==null) {
            return 0;
        }
        if(root.left==null && root.right==null) {
            return root.elem;
        }
        return sum_mer(root.left)+sum_mer(root.right);
    }
}
