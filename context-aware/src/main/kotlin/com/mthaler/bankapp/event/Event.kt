package com.mthaler.bankapp.event

interface Event {

    val eventType: String?

    var eventData: Map<String, Any>?
}