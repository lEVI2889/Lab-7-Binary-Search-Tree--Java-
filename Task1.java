// Complete the lowestCommonAncestor method
public class Task1 {

    //======================TASK#1======================
    // This method takes only 3 parameter first one is root
    // and second & third parameter are as 2 integers
    // You'll need to find the lowest common ancestor of them and return it
    public static Integer lowestCommonAncestor( BSTNode root, Integer x, Integer y ){
        // TO DO

        return null; //remove this line
    }
    //==================================================
    Integer traveller (BSTNode root, Integer x, Integer y){
        if(is_right_node(root, x, y)&&is_left_node(root, x, y)){
            return root.elem;
        }
        return 0;
    }
    boolean is_right_node(BSTNode root, Integer x, Integer y){
        if(x>y){
            return true;
        }
        return false;
    }
    boolean is_left_node(BSTNode root,Integer x, Integer y){
        if(x<y){
            return true;
        }
        return false;
    }
}
