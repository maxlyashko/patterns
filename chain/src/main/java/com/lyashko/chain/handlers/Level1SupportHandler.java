package com.lyashko.chain.handlers;

import com.lyashko.chain.model.AbstractSupportHandler;
import com.lyashko.chain.model.HelpDeskTicket;

public class Level1SupportHandler extends AbstractSupportHandler {
    @Override
    protected boolean canHandleTicket(HelpDeskTicket ticket) {
        return ticket.getPriority() <= 2;
    }

    @Override
    protected void processTicket(HelpDeskTicket ticket) {
        System.out.println("Level 1 support handling ticket: " + ticket.getName());
    }
}
