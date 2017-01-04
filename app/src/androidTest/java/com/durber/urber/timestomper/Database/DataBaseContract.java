package com.durber.urber.timestomper.Database;

import android.provider.BaseColumns;


public final class DataBaseContract
{
    // To prevent someone from accidentally instantiating the contract class,
    // make the constructor private.
    private DataBaseContract() {}

    /* Inner class that defines the table contents */
    public static class TimeStampTable implements BaseColumns
    {
        public static final String NAME = "TimpeStamp";
        public static final String COLUMN_INTIME = "intime";
        public static final String COLUMN_OUTTIME = "outtime";
        public static final String COLUMN_TOTALTIME = "tottime";

        public static final String getSqlCreateEntries()
        {
            return "CREATE TABLE " + NAME + " (" +
                    _ID + " INTEGER PRIMARY KEY," +
                    COLUMN_INTIME + " TEXT," +
                    COLUMN_OUTTIME + " TEXT," +
                    COLUMN_TOTALTIME + " TEXT)";
        }

        public static final String getSqlDeleteEntries()
        {
            return "DROP TABLE IF EXISTS " + NAME;
        }



    }
}
