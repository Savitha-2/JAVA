class StaticBlock {
    static {
        System.out.println("Static Block 1");
    }
    
    static {
        System.out.println("Static Block 2");
    }
    
    StaticBlock() {
        System.out.println("Constructor Called");
    }
     void display() {
        System.out.println("Display Method Called");
    }
}
public class staticBlocks {
    public static void main(String[] args) {
        StaticBlock sb = new StaticBlock();
        sb.display();

        
        
    }
    
}
