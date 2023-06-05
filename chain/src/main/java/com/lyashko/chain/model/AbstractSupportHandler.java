package com.lyashko.chain.model;

public abstract class AbstractSupportHandler {
    private AbstractSupportHandler nextHandler;

    public void setNextHandler(AbstractSupportHandler nextHandler) {
        this.nextHandler = nextHandler;
    }

    public void handleTicket(HelpDeskTicket ticket) {
        if (canHandleTicket(ticket)) {
            processTicket(ticket);
        } else if (nextHandler != null) {
            nextHandler.handleTicket(ticket);
        } else {
            System.out.println("No handler available to handle the ticket.");
        }
    }

    protected abstract boolean canHandleTicket(HelpDeskTicket ticket);

    protected abstract void processTicket(HelpDeskTicket ticket);
}
