package com.lamarck.journale

class TodoActivity: ItemActivity() {
    override val tag = "Todo activity"
    override fun getActivityTitle() =R.string.app_name
    override fun getLayout(): Int {
        return R.layout.activity_todo
    }
}