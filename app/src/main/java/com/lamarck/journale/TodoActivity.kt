package com.lamarck.journale

class TodoActivity: ItemActivity() {
    override val tag = "Todo activity"
    override fun getLayout(): Int {
        return R.layout.activity_todo
    }
}