package com.demo.Homeassignments;

public class Ticket
{
    private int ticketId;
    private int price;
    private static int availableTickets;

    public int getTicketId()
    {
        return ticketId;
    }

    public void setTicketId(int ticketIds) {
        this.ticketId = ticketId;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public static int getAvailableTickets() {
        return availableTickets;
    }

    public static void setAvailableTickets(int availableTickets)
    {
        if(availableTickets>=0) 
        {
            Ticket.availableTickets=availableTickets;
        }
        else 
        {
            System.out.println("Invalid value for availableTickets. It should be non-negative.");
        }
    }

    public int calculateTicketCost(int tickets)
    {
        if (tickets <= availableTickets)
        {
            availableTickets-=tickets;
            return tickets * price;
        } 
        else 
        {
            return -1; 
        }
    }
}