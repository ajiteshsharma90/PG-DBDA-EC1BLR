import os
class BankAccount:
    def __init__(self,accountnumber, accountname, balance):
        self.accountnumber = accountname
        self.accountname = accountname
        self.balance = balance
    
    def withdraw(self, amount):
        self.balance = self.balance - amount
        print(self.balance)
    
    def deposit(self, amount):
        self.balance = self.balance + amount
        print(self.balance)

acct1 = BankAccount(101, "Tom", 50000)
acct1.withdraw(int (input("enetr amount")))
print("after withdraw balance is: ", acct1.balance)
acct1.deposit(10000)
print("after deposit valance is: ", acct1.balance)

print("----------------------------------------")

print(dir(BankAccount))
