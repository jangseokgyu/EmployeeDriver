public class Employee 
{
    private Double salary;  // 연봉
    private int evalGrade;  // 근무평가등급

    public Employee(Double salary, int evalGrade) {
        this.salary = salary;
        this.evalGrade = evalGrade;
    }

    // get 함수 모음
    public Double getSalary() {
        return salary;
    }

    public int getEvalGrade() {
        return evalGrade;
    }

    // set 함수 모음
    public void setSalary(Double salary) {
        this.salary = salary;
    }

    public void setEvalGrade(int evalGrade) {
        this.evalGrade = evalGrade;
    }

    public void set(Double salary, int evalGrade) {
        this.salary = salary;
        this.evalGrade = evalGrade;
    }

    // 근무평가등급에 따라 현재 연봉을 인상시키고, 연봉 인상 금액을 반환한다.
    public Double applyIncreaseRate(){ 
    	if(evalGrade == 1)
    		salary *= (106.0/100.0);
    	if(evalGrade == 2)
    		salary *= (104.0/100.0);
    	if(evalGrade == 3)
    		salary *= (102.0/100.0);
        return salary;
    }

}