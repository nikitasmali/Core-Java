package com.demo.Homeassignments;

import java.util.ArrayList;
import java.util.List;

public class PhoneBook 
{
    private List<Customer> custList = new ArrayList<Customer>();
    public void addCustomer(Customer custObj) 
    {
        custList.add(custObj);
    }

    public List<Customer> viewAllCustomers() 
    {
        return custList;
    }

    public Customer viewCustomerByPhone(long phoneNo)
    {
        for(Customer customer:custList) 
        {
            if(customer.getPhoneNumber()==phoneNo) 
            {
                return customer;
            }
        }
        return null;
    }

    public boolean removeCustomer(long phoneNo) 
    {
        for (Customer customer:custList) 
        {
            if (customer.getPhoneNumber()==phoneNo)
            {
                custList.remove(customer);
                return true;
            }
        }
        return false; 
    }
}

