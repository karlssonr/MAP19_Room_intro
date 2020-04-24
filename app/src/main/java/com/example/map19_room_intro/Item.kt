package com.example.map19_room_intro

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey


@Entity
class Item(
    @PrimaryKey(autoGenerate = true) var id: Int,
    @ColumnInfo(name = "name") var name: String?,
    @ColumnInfo(name = "done") var done: Boolean = false,
    @ColumnInfo(name = "category") var category: String?) {


}