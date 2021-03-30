package model.entities;

import model.exception.Domain;

public class Account {

	private Integer number;
	private String holder;
	private Double balance;
	private Double withdrawLimit;

	public Account() {
	}

	public Account(Integer number, String holder, Double balance, Double withdrawLimit) {

		this.number = number;
		this.holder = holder;
		this.balance = balance;
		this.withdrawLimit = withdrawLimit;

	}

	public Integer getNumber() {
		return number;
	}

	public String getHolder() {
		return holder;
	}

	public void setHolder(String holder) {
		this.holder = holder;
	}

	public Double getBalance() {
		return balance;
	}

	public Double getWithDrawLimit() {
		return withdrawLimit;
	}

	public void setWithDrawLimit(Double withdrawLimit) {
		this.withdrawLimit = withdrawLimit;
	}

	public void deposit(Double amount) {
		balance += amount;

	}

	public void withdraw(Double amount) {
		if (amount > withdrawLimit) {
			throw new Domain("The amount exceeds withdraw limit");
		}
		if (amount > balance) {
			throw new Domain("Not enough balance");
		}
		balance -= amount;
	}
	@Override
	public String toString() {
		return "New balance " + String.format("%.2f" , getBalance());
	}

}
