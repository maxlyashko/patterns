package com.lyashko.chain;

import com.lyashko.chain.handlers.Level1SupportHandler;
import com.lyashko.chain.handlers.Level2SupportHandler;
import com.lyashko.chain.handlers.SupervisorHandler;
import com.lyashko.chain.model.AbstractSupportHandler;
import com.lyashko.chain.model.HelpDeskTicket;

public class Main {
    public static void main(String[] args) {
        AbstractSupportHandler level1Handler = new Level1SupportHandler();
        AbstractSupportHandler level2Handler = new Level2SupportHandler();
        AbstractSupportHandler supervisorHandler = new SupervisorHandler();

        level1Handler.setNextHandler(level2Handler);
        level2Handler.setNextHandler(supervisorHandler);

        HelpDeskTicket ticket1 = new HelpDeskTicket("John", "Network issue", 3);
        HelpDeskTicket ticket2 = new HelpDeskTicket("Jane", "Software bug", 1);
        HelpDeskTicket ticket3 = new HelpDeskTicket("Mike", "Hardware failure", 5);

        level1Handler.handleTicket(ticket1);
        level1Handler.handleTicket(ticket2);
        level1Handler.handleTicket(ticket3);
    }
}
