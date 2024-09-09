package utilities;

import java.util.ArrayList;
import java.util.List;

public class NonBinaryTreeNode {
    public int value;
    public List<NonBinaryTreeNode> children = new ArrayList<>();

    public NonBinaryTreeNode(int value) {
        this.value = value;
    }
}
