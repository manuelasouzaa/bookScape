package com.example.projeto.migrations

import androidx.room.migration.Migration
import androidx.sqlite.db.SupportSQLiteDatabase

val Migration_1_2 = object : Migration(1, 2) {
    override fun migrate(db: SupportSQLiteDatabase) {
        db.execSQL(
            """
                CREATE TABLE IF NOT EXISTS BookList (
                `idList` TEXT PRIMARY KEY NOT NULL,
                `emailUser` TEXT NOT NULL,
                `list` TEXT)
            """
        )
    }
}

val Migration_2_3 = object : Migration(2, 3) {
    override fun migrate(db: SupportSQLiteDatabase) {
        db.execSQL(
            """ALTER TABLE User ADD name TEXT"""
        )
    }
}