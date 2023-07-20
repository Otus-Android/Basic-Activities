package ru.otus.otusdemo.examples

//https://otus.ru/polls/56118/


//=====Открыть звонилку

//val uri = Uri.parse("tel:8-906-123")
//val intent = Intent(Intent.ACTION_DIAL, uri)
//
//startActivity(intent)

//=====Неявный Intent на др activity
//<intent-filter>
//<action android:name="PleaseShowSecondActivity" />
//<category android:name="android.intent.category.DEFAULT" />
//</intent-filter>

//val intent = Intent("PleaseShowSecondActivity")
//startActivity(intent)

//===== Делаем кастомную активити для отправки почты
//<intent-filter>
//<action android:name="android.intent.action.SEND"/>
//<category android:name="android.intent.category.DEFAULT"/>
//<data android:mimeType="text/plain"/>
//</intent-filter>


//===Множественный выбор
//<intent-filter>
//<action android:name="android.intent.action.VIEW"/>
//<action android:name="android.intent.action.SENDTO"/>
//<data android:scheme="mailto"/>
//<category android:name="android.intent.category.DEFAULT"/>
//<category android:name="android.intent.category.BROWSABLE"/>
//</intent-filter>

//val emailIntent = Intent(Intent.ACTION_SENDTO).apply {
//    data = Uri.parse("mailto:abc@xyz.com")
//}
//startActivity(Intent.createChooser(emailIntent, "Send feedback"))

//singleTop.
// Он ведет себя почти так же, как и standard, что означает,
// что экземпляров singleTop Activity можно создать столько, сколько мы захотим.
// Единственное отличие состоит в том, что если уже есть экземпляр Activity
// с таким же типом наверху стека в вызывающей задаче,
// не будет создано никакого нового Activity, вместо этого Intent будет отправлен
// существующему экземпляру Activity через метод onNewIntent().

//single task
// Activity с singleTask launchMode разрешено иметь только один экземпляр в системе
// (аля синглтон). Если в системе уже существует экземпляр Activity,
// вся задача, удерживающая экземпляр, будет перемещен наверх,
// а Intent будет предоставлен через метод onNewIntent(). В противном случае будет создано новое Activity
// и помещено в соответствующую задачу.

//ResultActivity
//val resultContract = registerForActivityResult(MyContractSecondActivity()) { result -> }

//class MyContractSecondActivity : ActivityResultContract<String, String?>() {
//
//    override fun createIntent(context: Context, input: String): Intent {
//        return Intent(context, SecondActivity::class.java)
//    }
//
//    override fun parseResult(resultCode: Int, intent: Intent?): String? {
//        if (intent == null) return null
//        if (resultCode != Activity.RESULT_OK) return null
//
//        return intent.getStringExtra("test")
//    }
//}

// resultContract.launch("")

//         val intent = Intent().putExtra("test","otus")
//            setResult(RESULT_OK, intent)
//            finish()


// Permission
// <uses-permission android_name="android.permission.INTERNET"/>
//
//private val resultContract =
//    registerForActivityResult(ActivityResultContracts.RequestPermission()) { granted ->
//        if (!granted) {
//            val dontShowAgain = !shouldShowRequestPermissionRationale(Manifest.permission.CAMERA)
//            if(dontShowAgain){
//                val intent = Intent(Settings.ACTION_APPLICATION_DETAILS_SETTINGS).apply {
//                    val uri = Uri.fromParts("package", packageName, null)
//                    data = uri
//                }
//                startActivity(intent)
//            }
//
//        }else {
//            //TODO:
//        }
//    }

//Загрузка картинок
//    val resultContract = registerForActivityResult(ActivityResultContracts.GetContent()) { result ->
//        findViewById<ImageView>(R.id.image).setImageURI(result)
//    }
//
//    val button = findViewById<Button>(R.id.button).setOnClickListener {
//        resultContract.launch("image/*")
//    }

//<activity
//android:name=".another.SecondActivity"
//android:launchMode="singleTask"
//android:exported="true">
//
//<intent-filter>
//<action android:name="android.intent.action.SEND"/>
//<category android:name="android.intent.category.DEFAULT"/>
//<data android:mimeType="text/plain"/>
//</intent-filter>
//</activity>




//Access Location (Background/Coarse/Fine)
//Access Body Sensors/Physical Activity
//Make Phone Calls (w/out going through Dialer)
//Access the Camera
//Record Audio
//Access Account Information
//Read/Write to external media (real or emulated)
//Read the Calendar
//Read the Call Log
//Read Contacts
//Read/Send SMS
//Read/Send MMS