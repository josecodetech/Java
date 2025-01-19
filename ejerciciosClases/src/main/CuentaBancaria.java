package main;

public class CuentaBancaria {
	private String titular;
	private double saldo;
	
	public CuentaBancaria(String titular, double saldoInicial) {
		this.titular = titular;
		this.saldo = saldoInicial;
	}
	public void depositar(double cantidad) {
		saldo += cantidad;
	}
	public void retirar(double cantidad) {
		if (cantidad <= saldo) {
			saldo -= cantidad;
		}
		else {
			System.out.println("Saldo insuficiente.");
		}
	}
	public void mostrarInfo() {
		System.out.println("Titular: "+titular);
		System.out.println("Saldo: "+saldo);
	}
}
