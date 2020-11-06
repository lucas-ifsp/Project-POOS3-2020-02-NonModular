package br.edu.ifsp.poo.class03.ex02;

public class Principal {
    public static void main(String[] args) {
        Department sales = new Department("Vendas", 1, "São Carlos", 16, 30000.59);

        Employee e1 = new Employee("Jão", 1, 1300.0, "Boy", sales, null);
        Employee e2 = new Employee("José", 2, 500.0, "Peão", sales, null);
        Employee e3 = new Employee("Maria", 3, 5000.0, "Boss", sales, sales);

        sales.addEmployee(e1);
        sales.addEmployee(e2);
        sales.addEmployee(e3);

        sales.setChief(e3);

        //System.out.println(sales.getChief().getName());

        Employee[] staff = sales.getStaff();
        for (Employee e : staff) {
            System.out.println("Nome: " + e.getName() + " Funcão:" + e.getJobTitle() + " Salário: " + e.getSalary());
        }
    }
}
