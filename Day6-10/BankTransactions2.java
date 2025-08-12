package pack1;

class BankTransactions2{
    private int acct_balance=1000;

    public synchronized void deposit_amt(int amount) {
        acct_balance=acct_balance+amount;
        System.out.println("Deposited amount is: "+amount+ " by "+Thread.currentThread().getName());
        System.out.println("Balance amount is: "+acct_balance);
    }

    public synchronized void withdrawn_amt(int amount) {
        if(acct_balance == 0) {
            System.out.println("Account has ZERO balance! Cannot withdraw " + amount + " by " + Thread.currentThread().getName());
        }
        else if(acct_balance>=amount) {
            acct_balance=acct_balance-amount;
            System.out.println("Amount withdrawn is: "+amount + " by " +Thread.currentThread().getName());
            System.out.println("Balance amount is: "+acct_balance);
        }
        else {
            System.out.println("Insufficient balance on account: "+acct_balance +" for "+Thread.currentThread().getName());
        }
    }

    public int getBalance() {
        return acct_balance;
    }
}

class BankMain{
    public static void main(String[] args){

        BankTransactions2 bankAccount = new BankTransactions2(); 

        Thread t1 = new Thread(() -> {
            for(int i=1; i<4; i++){
                bankAccount.deposit_amt(1000);
                try{
                    Thread.sleep(500);
                }catch(InterruptedException ie){
                    ie.printStackTrace();
                }
            }
        }, "DepositThread");

        Thread t2 = new Thread(() -> {
            for(int i=1; i<4; i++){
                bankAccount.withdrawn_amt(3000);
                try{
                    Thread.sleep(500);
                }catch(InterruptedException ie){
                    ie.printStackTrace();
                }
            }
        }, "WithdrawThread");

        t1.start();
        t2.start();

        try{
            t1.join();
            t2.join();
        }catch(InterruptedException ie){
            ie.printStackTrace();
        }

        System.out.println("Balance Left: "+bankAccount.getBalance());
    }
}