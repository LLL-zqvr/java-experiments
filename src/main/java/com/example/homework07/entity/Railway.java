package com.example.homework07.entity;

public class Railway implements Runnable{
   int tickets ;

    public Railway(int tickets) {
        this.tickets = tickets;
    }

    public Railway() {
    }
    public int getTickets() {
        return tickets;
    }

    public void setTickets(int tickets) {
        this.tickets = tickets;
    }

    @Override
    public void run() {
        while (true){
            synchronized (this){
                if(tickets <= 0){
                    break;
                }
                System.out.println(Thread.currentThread().getName() + "卖了第" + tickets + "张票");
                tickets--;
            }
            try{
                Thread.sleep(50);
            } catch (InterruptedException e){
                e.printStackTrace();
            }
        }

    }
}
