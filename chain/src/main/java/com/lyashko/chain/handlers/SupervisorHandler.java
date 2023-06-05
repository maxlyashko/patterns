package com.lyashko.chain.handlers;

import com.lyashko.chain.model.AbstractSupportHandler;
import com.lyashko.chain.model.HelpDeskTicket;

public class SupervisorHandler extends AbstractSupportHandler {
    @Override
    protected boolean canHandleTicket(HelpDeskTicket ticket) {
        return ticket.getPriority() >= 5;
    }

    @Override
    protected void processTicket(HelpDeskTicket ticket) {
        System.out.println("Supervisor handling ticket: " + ticket.getName());
    }
}
