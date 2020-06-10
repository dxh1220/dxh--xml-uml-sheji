package 设计模式.工厂模式.工厂方法模式.order;


import java.util.Scanner;

public class PizzaStore {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("请输入pizza产地：");
		String loc = in.next();
		if (loc.equals("bj")) {
			new BJOrderPizza();
		} else if (loc.equals("ldo")){
			new LDOrderPizza();
		} else{
			System.out.println("此地并没有分店");
		}
	}

}
