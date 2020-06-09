import java.util.Stack;

/**
 * @ClassName: MinStack
 * @Author: 邹双双
 * Date: 2020/6/9 19:34
 * @Description:最小栈
 * 创建两个栈，A，B
 * A中正常存放数据，B中存放的是当前A中的最小值
 * 入栈：A正常入栈，B插入A和B的栈顶元素中的较小值
 * 出栈：A,B同时出栈
 * 取栈顶元素：直接取A的栈顶元素
 * 选取最小值；取B的栈顶元素
 */
public class MinStack {
    Stack<Integer> A = new Stack<>();
    Stack<Integer> B= new Stack<>();
    public void push(int x){
        A.push(x);
        if (B.isEmpty()){
            B.push(x);
            return;
        }
        int min  = B.peek();
        if (x <= min) {
           min = x;
        }
        B.push(min);
    }
    public Integer pop(){
        if (A.isEmpty()){
            return  null;
        }
        B.pop();
        return A.pop();
    }
    public Integer top(){
        if (A.isEmpty()){
            return null;
        }
        return A.peek();
    }
    public Integer getMin(){
        if (B.isEmpty()){
            return null;
        }
        return B.peek();
    }
}
