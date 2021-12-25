package Functions;

public class employee {
    String name;
    Integer age;
    Integer Salary;
    String DeptName;
    public employee( String name,Integer age, Integer Salary, String DeptName) {
        this.name=name;
        this.age=age;
        this.Salary=Salary;
        this.DeptName=DeptName;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getSalary() {
        return Salary;
    }

    public void setSalary(Integer salary) {
        Salary = salary;
    }

    public String getDeptName() {
        return DeptName;
    }

    public void setDeptName(String deptName) {
        DeptName = deptName;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }
}
