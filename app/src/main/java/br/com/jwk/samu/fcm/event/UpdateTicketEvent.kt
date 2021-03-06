package br.com.jwk.samu.fcm.event

import android.content.Context
import org.greenrobot.eventbus.EventBus

class UpdateTicketEvent(val idTicket: String) : Event() {
    companion object {
        const val ACTION = "UPDATE_TICKET"
    }

    override fun execute(context: Context) {
        EventBus.getDefault().post(this)
    }
}