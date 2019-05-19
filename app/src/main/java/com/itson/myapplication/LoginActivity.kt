package com.itson.myapplication

import android.os.Bundle
import android.support.constraint.ConstraintSet
import android.support.v7.app.AppCompatActivity
import android.support.v7.widget.CardView
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import com.google.firebase.auth.FirebaseAuth
import com.google.android.gms.common.SignInButton


class LoginActivity : AppCompatActivity() {

    //TextViews
    private var mEmailTextView: TextView? = null

    //Buttons
    private var mLoginButton: Button? = null
    private var mRegisterButton: Button? = null
    private var mFacebookButton: Button? = null
    private var mGoogleButton: SignInButton? = null

    //EditTexts
    private var mEmailEditText: EditText? = null
    private var mUserNameEditText: EditText? = null
    private var mUserPassword: EditText? = null

    //CardView
    private var mCredentialsCardView: CardView? = null
    private var mInvalidLoginPopup: CardView? = null

    private var mFirebaseAuth: FirebaseAuth? = null


    //https://alertajovenkotlin.firebaseapp.com/__/auth/handler

    private val mOriginalConstraintSet = ConstraintSet()


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.login)

        mGoogleButton = findViewById(R.id.google_login)



    }
}
