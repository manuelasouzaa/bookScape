package com.example.projeto.database

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase
import com.example.projeto.database.dao.BookDao
import com.example.projeto.database.dao.BookListDao
import com.example.projeto.database.dao.UserDao
import com.example.projeto.migrations.Migration_1_2
import com.example.projeto.migrations.Migration_2_3
import com.example.projeto.model.Book
import com.example.projeto.model.User

@Database(entities = [User::class, Book::class], version = 3)

abstract class LibraryDatabase: RoomDatabase() {

    abstract fun userDao(): UserDao
    abstract fun bookDao(): BookDao
    abstract fun bookListDao(): BookListDao

    companion object {
        @Volatile
        private var db: LibraryDatabase? = null

        fun instance(context: Context): LibraryDatabase {
            return db?: Room.databaseBuilder(
                context,
                LibraryDatabase::class.java,
                "db"
            ).addMigrations(Migration_1_2, Migration_2_3)
                .build()
        }
    }

}