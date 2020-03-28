package Test90;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Stack;

class Employee {
    // It's the unique id of each node;
    // unique id of this employee
    public int id;
    // the importance value of this employee
    public int importance;
    // the id of direct subordinates
    public List<Integer> subordinates;
}
public class CRCX_03_28 {
    //递归;
    public int getImportance(List<Employee> employees, int id) {
        for(Employee e:employees){
            if(e.id==id){
                if(e.subordinates.size()==0){
                    return e.importance;
                }
                for(int sub: e.subordinates){
                    e.importance+=getImportance(employees,sub);
                }
                return e.importance;
            }

        }
        return 0;
    }
    //栈
    public int getImportance1(List<Employee> employees, int id) {
        Map<Integer,Employee> map=new HashMap<>();
        for(Employee e:employees){
            map.put(e.id,e);
        }
        Stack<Employee> stack=new Stack<>();
        stack.push(map.get(id));
        int result=0;
        while(!stack.empty()){
            Employee e=stack.pop();
            result+=e.importance;
            for(int sub:e.subordinates){
                stack.push(map.get(sub));
            }
        }
        return result;
    }
}
