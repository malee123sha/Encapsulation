public class Employee {
    private int emp_no;
    private String  email;
    private float salary;
    private long acc_no;
    public int getEmp_no() {
        return emp_no;
    }
    public String getEmail() {
        return email;
    }
    public float getSalary() {
        return salary;
    }
    public long getAcc_no() {
        return acc_no;}
    public void setEmp_no(int emp_no) {
        this.emp_no = emp_no;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public void setSalary(float salary) {
        this.salary = salary;
    }
    public void setAcc_no(long acc_no) {
        this.acc_no = acc_no;}
}
    class  Testing3 {
        public static void main(String[] args) {
            Employee e = new Employee();
            e.setEmp_no(4567);
            e.setEmail("kamal@gmail.com");
            e.setSalary(45600.50f);
            e.setAcc_no(1234567893692581L);
            System.out.println("Employee's Name is :-"+e.getEmp_no());
            System.out.println("Employee's Email is :-"+e.getEmail());
            System.out.println("Employee's Salary is :-"+e.getSalary());
            System.out.println("Employee's Acc No is :-"+e.getAcc_no());
        }
    }


