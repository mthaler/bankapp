package com.mthaler.bankapp.event

import java.util.Properties

class MessagingEventSender : EventSender {

    private var messagingProperties: Properties? = null

    fun setMessagingProperties(messagingProperties: Properties?) {
        this.messagingProperties = messagingProperties
    }

    override fun sendEvent(e: Event) {
        // -- send event to the messaging middleware
    }
}