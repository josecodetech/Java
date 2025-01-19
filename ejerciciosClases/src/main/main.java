package main;

public class main {

	public static void main(String[] args) {
		Coche coche1 = new Coche("Toyota", "Corolla");
		coche1.acelerar();
		coche1.acelerar();
		coche1.mostrarInfo();
		coche1.frenar();
		coche1.mostrarInfo();
		
		Empleado ana = new Empleado("Ana", 3000);
		ana.mostrarInfo();
		ana.incrementarSalario(10); // aumenta salario en 10%
		ana.mostrarInfo();
		
		Empleado antonio = new Empleado("Antonio", 2500);
		antonio.mostrarInfo();
		antonio.incrementarSalario(15);
		antonio.mostrarInfo();
		
		CuentaBancaria cuentaJose = new CuentaBancaria("Jose", 1100);
		cuentaJose.mostrarInfo();
		cuentaJose.depositar(500);
		cuentaJose.mostrarInfo();
		cuentaJose.retirar(150);
		cuentaJose.mostrarInfo();
		
	}

}
