class EmployeeSalary {
    int basic;
    int da;
    int hra;
    int ma;

    EmployeeSalary(int basic, int da, int hra, int ma) {
        this.basic = basic;
        this.da = da;
        this.hra = hra;
        this.ma = ma;
    }

    int regularSalary() {
        return this.basic + this.hra + this.ma + this.da;
    }
}

class Scientist extends EmployeeSalary {
    int bonusPerPub;
    int numOfPubs;

    Scientist(int basic, int da, int hra, int ma, int bonusPerPub, int numOfPubs) {
        super(basic, da, hra, ma);
        this.bonusPerPub = bonusPerPub;
        this.numOfPubs = numOfPubs;
    }

    int calculateNetSalary() {
        int bonus = this.bonusPerPub * this.numOfPubs;
        return this.regularSalary() + bonus;
    }
}

class Developer extends EmployeeSalary {
    int bonusPerPatent;
    int numOfPatents;

    Developer(int basic, int da, int hra, int ma, int bonusPerPatent, int numOfPatents) {
        super(basic, da, hra, ma);
        this.bonusPerPatent = bonusPerPatent;
        this.numOfPatents = numOfPatents;
    }

    int calculateNetSalary() {
        int bonus = this.bonusPerPatent * this.numOfPatents;
        return this.regularSalary() + bonus;
    }
}

class ProjectLeader extends EmployeeSalary {
    int bonusPerProj;
    int numOfProj;

    ProjectLeader(int basic, int da, int hra, int ma, int bonusPerProj, int numOfProj) {
        super(basic, da, hra, ma);
        this.bonusPerProj = bonusPerProj;
        this.numOfProj = numOfProj;
    }

    int calculateNetSalary() {
        int bonus = this.bonusPerProj * this.numOfProj;
        return this.regularSalary() + bonus;
    }
}

public class ass11 {
    public static void main(String[] args) {

        Scientist s = new Scientist(10000, 2000, 1500, 500, 300, 5);
        Developer d = new Developer(12000, 2500, 1800, 700, 400, 3);
        ProjectLeader p = new ProjectLeader(15000, 3000, 2000, 1000, 500, 4);

        System.out.println("Scientist Net Salary: " + s.calculateNetSalary());
        System.out.println("Developer Net Salary: " + d.calculateNetSalary());
        System.out.println("Project Leader Net Salary: " + p.calculateNetSalary());
    }
}
