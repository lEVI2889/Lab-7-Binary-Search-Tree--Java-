// Complete the sumOfLeaves method
public class Task4 {

    //===================================TASK#4======================
    // This method takes only one parameter
    // it is root of the given tree
    // You can use extra helper private static methods as per need
    public static Integer mirrorSum( BSTNode root ){
        //TO DO
        if(root == null) return null;
        return sum_mer(root.left, root.right); // remove this line
    }
    //===============================================================
    static int sum_mer(BSTNode left, BSTNode right){
        if(left == null && right == null) return 0;
        int sum = left.elem + right.elem;
        if(left.left!=null && right.right!=null){
            sum += sum_mer(left.left, right.right);
        }
        if(left.right!=null && right.left!=null){
            sum += sum_mer(left.right, right.left);
        }

        return sum;
    }

}
