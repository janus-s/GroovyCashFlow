package org.kaktus.groovycashflow.model

class Payment {
    Date date
    BigDecimal value

    static belongsTo = [account: Account, fundingSource: FundingSource]
    static mappedBy = [date: "payment_date", value: "payment_value"]

    static constraints = {
        value blank: false
    }
}
