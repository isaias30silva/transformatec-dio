let invoices = [
    {
        name:"Mercado",
        number: 3456,
        amount: "500,00",
        due: "10/06/2022"
    },    
    {
        name:"Farmacia",
        number: 7865,
        amount: "100,00",
        due: "10/06/2022"
    },    
    {
        name:"Conserto",
        number: 9889,
        amount: "1500,00",
        due: "10/06/2022"
    },    
    {
        name:"Escola",
        number: 8897,
        amount: "750,00",
        due: "10/06/2022"
    }
]

export function getInvoices() {
    return invoices
}

export function getInvoice(number){
    return invoices.find(
        (invoice) => invoice.number === number
    )
}

export function deleteInvoice(number){
    invoices = invoices.filter(invoice => invoice.number !== number)
}