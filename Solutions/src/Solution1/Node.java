package Solution1;

public class Node {
    public char val;
    public Node left;
    public Node right;

    public Node(char val){
        this.val=val;
    }
}
    class TestTree{
    public static Node build(){
        Node a=new Node('A');
        Node b=new Node('B');
        Node c=new Node('C');
        Node d=new Node('D');
        Node e=new Node('E');
        Node f=new Node('F');
        Node g=new Node('G');
        Node h=new Node('H');
        a.left=b;
        b.right=c;
        b.left=d;
        d.left=e;
        e.left=g;
        g.right=h;
        c.right=f;
        return a;
    }
    public static void preOrder(Node root){
        if(root==null){
            return;
        }
        System.out.print(root.val+" ");//先访问根节点
        preOrder(root.left);//递归访问左子树
        preOrder(root.right);//最后递归访问右子树.
    }
    public static void inOder(Node root){
        if(root==null){
            return;
        }
        inOder(root.left);//先遍历左子树
        System.out.println(root.val+" ");//再访问根节点
        inOder(root.right);//最后遍历右子树
    }
    public static void postOrder(Node root){
        if(root==null){
            return;
        }
        inOder(root.left);//递归遍历左子树
        inOder(root.right);//递归遍历右子树
        System.out.println(root.val+" ");//最后访问根节点
    }
    public static int size(Node root){
        if(root==null){
            return 0;
        }
        return 1+size(root.left)+size(root.right);
    }
    public static int leafSize(Node root){
        if(root==null){
            return 0;
        }
        if(root.left==null && root.right==null){
            return 1;
        }
        return leafSize(root.left)+leafSize(root.right);
    }
    private static int kLevelSize(Node root,int k){
        if(k<1||root==null) return 0;
        if(k==1) return 1;
        return kLevelSize(root.left,k-1)+kLevelSize(root.right,k-1);
    }
    private static Node find(Node root,char toFind){
        if(root==null){
            return null;
        }
        if(root.val==toFind){
            return root;
        }
        Node res=find(root.left,toFind);
        if(res!=null){
            return res;
        }
        return find(root.right,toFind);
    }

        public static void main(String[] args) {
            Node root=build();
            System.out.println("先序遍历:");
            preOrder(root);

        }
}