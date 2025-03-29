package app.domain.services;

import app.domain.models.Dealer;
import app.domain.models.Invoice;
import app.domain.ports.DealerPort;
import app.domain.ports.InvoicePort;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DealerService {

    @Autowired
    private DealerPort dealerPort;

    @Autowired
    private InvoicePort invoicePort;

    public void generateInvoice(Invoice invoice) throws Exception {
        Dealer dealer = dealerPort.findByUserId(invoice.getDealerId());
        if (dealer == null) {
            throw new Exception("Dealer not found.");
        }

        // Validate if the invoice contains valid products and amounts.
        if (invoice.getAmount() <= 0) {
            throw new Exception("Invalid invoice amount.");
        }

        invoicePort.saveInvoice(invoice);
    }

    // Additional methods can be added to handle order and invoice operations.
}
