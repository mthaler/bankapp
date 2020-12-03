package com.mthaler.bankapp.event

class FixedDepositCreatedEvent : Event {

    private var eventData: Map<String, Any>? = null

    override fun getEventType(): String {
        return "FixedDepositCreatedEvent"
    }

    override fun setEventData(eventData: Map<String, Any>) {
        this.eventData = eventData
    }

    override fun getEventData(): Map<String, Any> {
        return eventData!!
    }
}