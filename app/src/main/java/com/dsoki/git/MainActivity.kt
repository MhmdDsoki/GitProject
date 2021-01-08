package com.dsoki.git

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        //init git : initialization a git repo.
        //Un versioned filed :we told git we want to use this files with git
        //but we still not tracked them(mean it we want to do a backup for thee files we will tracked them
        //but if we want to fix tis we use git + command to tell him wht we want to do
        //git add gradlew we want to add our tracked file list to git.

        //red mean un versioned green mean they are added and is versioned
        //if you want to ignore any file which has important data you use git ignore at project  and . + file name
        //git add gradlew
        //git add . : add all the files in repos and sub-directories to our git repo
        //commit it just a snapshot of ur changes of the files you edit with the add commit.
        //git commit -m "message that you attach to.. the changes "
        println("this is the second commit")
    }
}
