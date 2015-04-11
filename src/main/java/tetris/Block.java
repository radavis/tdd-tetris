package tetris;

public class Block {
    private final char block_type;
    public int x;
    public int y;

    public Block(char block_type) {
        this.block_type = block_type;
    }

    public String toString() {
      return String.valueOf(this.block_type);
    }
}
