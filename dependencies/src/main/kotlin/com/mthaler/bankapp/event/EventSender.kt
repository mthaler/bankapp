package com.mthaler.bankapp.event

interface EventSender {

    fun sendEvent(e: Event)
}