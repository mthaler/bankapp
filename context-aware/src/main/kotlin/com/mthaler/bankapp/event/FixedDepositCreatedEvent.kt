package com.mthaler.bankapp.event

class FixedDepositCreatedEvent : Event {

    override var eventData: Map<String, Any>? = null

    override val eventType: String?
        get() = "FixedDepositCreatedEvent"
}