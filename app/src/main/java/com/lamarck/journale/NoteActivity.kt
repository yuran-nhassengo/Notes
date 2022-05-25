package com.lamarck.journale

class NoteActivity : ItemActivity() {
    override val tag ="Note activity"
    override fun getActivityTitle() =R.string.app_name
    override fun getLayout() = R.layout.activity_note
}