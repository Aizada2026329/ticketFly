/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ticketfly;

import java.util.Scanner;

/**
 *
 * @author aboru
 */
public class TicketFly {

    /**
     * @param args the command line arguments
     * Создайте программу, которая запросит у пользователя ввод действительного номера посадочного талона.
Если они вводят некорректные данные, вы должны вывести результат.выдайте им понятное сообщение об ошибке и спросите их еще раз.
Если они введут действительный номер, скажите: «Посадка разрешена. Приятного путешествия!»
Правила проверки следующие:
Посадочный талон должен содержать только сочетание букв и цифр. Другие символы не допускаются.
Посадочный талон должен содержать в общей сложности 10 или 11 символов.
— Первые два символа должны быть только буквами «EI» или «FR». Это не так.нет Необходимо учитывать регистр символов.
- Остальные символы должны быть цифрами.
- Последние два символа должны быть равны 22.
task was translated 
     */
    public static void main(String[] args) {
        // TODO code application logic here
        for (int i = 0; i < 5; i++){ 
        System.out.println(" Enter your ticket number ");
        Scanner ticketNumber = new Scanner(System.in);
          String  ticketCheck = ticketNumber.nextLine().trim().toUpperCase();
           int countSymbols = ticketCheck.length();
          String startTicket = ticketCheck.substring(0,2);
            boolean endTicket = ticketCheck.endsWith("22");
            String middleTicket = ticketCheck.substring(2,countSymbols);
            
            if  (((countSymbols == 10)||(countSymbols == 11))
                && ((ticketCheck.matches("[A-Za-z0-9]+")))
                &&(middleTicket.matches(".*[0-9].*"))&& (endTicket)
                &&((startTicket.matches("EI"))||(startTicket.matches("FR"))))
          {
               System.out.println(" Clear to board. Have a nice trip! ");
               System.out.println(" your ticket number " + ticketCheck);
               i=5;
            } else{
                    System.out.println(" Enter correct ticket number ");
                            System.out.println(" ");
                    }
    }
    }
    }
  
        
    
    

