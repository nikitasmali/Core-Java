package com.demo.Homeassignments;

public class TicketMain 
{
    public static void main(String[] args)
    {
        Ticket ticket1=new Ticket();
        ticket1.setTicketId(1);
        ticket1.setPrice(250);
        Ticket.setAvailableTickets(50);
        int numberOfTicketsToBuy=7;
        int totalCost=ticket1.calculateTicketCost(numberOfTicketsToBuy);
        if(totalCost!=-1)
        {
            System.out.println("Total cost for "+numberOfTicketsToBuy+" tickets:"+totalCost);
            System.out.println("Remaining available tickets:"+Ticket.getAvailableTickets());
        } 
        else 
        {
            System.out.println("Tickets not available.");
        }
    }
}
