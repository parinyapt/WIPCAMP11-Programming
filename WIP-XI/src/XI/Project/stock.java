/*
 * Copyright (C) 2019 WipCamp11.
 *
 * This library is free software; you can redistribute it and/or
 * modify it under the terms of the GNU Lesser General Public
 * License as published by the Free Software Foundation; either
 * version 2.1 of the License, or (at your option) any later version.
 *
 * This library is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the GNU
 * Lesser General Public License for more details.
 *
 * You should have received a copy of the GNU Lesser General Public
 * License along with this library; if not, write to the Free Software
 * Foundation, Inc., 51 Franklin Street, Fifth Floor, Boston,
 * MA 02110-1301  USA
 */
package XI.Project;

import java.util.Scanner;
/**
 *
 * @author WipCamp11
 */
public class stock {
    public static void main(String[] args) {
        int item,limit,menu,amount,totalam;
        item = 5;
        limit = 10;
        menu = 0;
        amount = 0;
        
        Scanner sc = new Scanner(System.in);
        
        System.out.printf("Stock Now \n Item = %d \n Limit = %d \n\n",item,limit);
        System.out.printf("Please Select Menu? \n 1.Add Item \n 2.Remove Item \n 3.Check Stock \n\n Menu : ");
        menu = sc.nextInt();
        System.out.printf("-------------------- \n");
        
        
        
        if(menu==1)
        {
            if(item<limit)
            {
                System.out.printf("Input Amount to Add : ");
                amount = sc.nextInt();
                totalam = item+amount;
                
                if(totalam>limit)
                {
                    System.out.printf("Stock over limit \n");
                }
                else
                {
                    item = totalam;
                    System.out.printf("Item Add complete \n Stock Now \n Item = %d \n Limit = %d \n\n",item,limit);
                    
                }
            }
            else
            {
                System.out.printf("Stock is full");
            }
        }
        else if(menu==2)
        {
            if(item>0)
            {
                System.out.printf("Input Amount to Remove : ");
                amount = sc.nextInt();
                
                if(amount>item)
                {
                    System.out.printf("Stock is not enough to remove \n");
                }
                else
                {
                    totalam = item-amount;
                    item = totalam;
                    System.out.printf("Item Remove complete \n Stock Now \n Item = %d \n Limit = %d \n\n",item,limit);
                }
            }
            else
            {
               System.out.printf("No Item in Stock \n");
            }
            
        }
        else if(menu==3)
        {
            System.out.printf("Stock Now \n Item = %d \n Limit = %d \n\n",item,limit);
        }
       else
        {
            System.out.printf("Menu not correct \n");
        }
    }
    
}
