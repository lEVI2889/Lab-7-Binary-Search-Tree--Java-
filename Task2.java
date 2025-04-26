// Complete the sumOfLeaves method
public class Task2 {

    //===================================TASK#2===================================
    // This method takes only 2 parameters
    // 1st one is root
    // 2nd one is an Integer
    // You'll need to find the path from the root to a node containing the Integer
    // return the path as a String
    public static String findPath( BSTNode root, Integer key ){
        // TO DO
        if(!availability(root.left,key)&&!availability(root.right,key)) {
            return "No Path Found";
        }
        else{
            return Path(root,key);
        }
    }
    //============================================================================
    static boolean availability(BSTNode root, Integer key) {
        if (root == null) {
            return false;
        }
        if (root.elem.equals(key)) {
            return true;
        }
        // Check recursively in the left and right subtrees
        return availability(root.left, key) || availability(root.right, key);
    }
    static String Path(BSTNode root, Integer key){
        if (key < root.elem) {
            return "" + root.elem + " " + Path(root.left, key);
        } else if (key > root.elem) {
            return "" + root.elem + " " + Path(root.right, key);
        } else if (key == root.elem) {
            return "" + root.elem;
        }
        return null;
    }
}
