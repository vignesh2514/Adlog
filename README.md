# Adlog
Advertisement Logging

[![](https://jitpack.io/v/vignesh2514/Adlog.svg)](https://jitpack.io/#vignesh2514/Adlog)


#Basic Setup of gradle

#Add this in your app level gradle

allprojects {
		repositories {
			...
			maven { url 'https://jitpack.io' }
		}
	}
        
#Add this dependency in your project level gradle

dependencies {
	        implementation 'com.github.vignesh2514:Adlog:0.1'
	}
        
 #Basic Setup of POST request
 
 #1.Add Permisiion in your Manifest
 <uses-permission android:name="android.permission.INTERNET"/>


#2.Declare this in your activity Globally to start the 

    val client = RestClient()
#3.Post Params using where
 client.addParam("email", "User mail id")
            client.addParam("password", "User password")

#4.Execute and Get the response through 
                val response = client.executePost()  



