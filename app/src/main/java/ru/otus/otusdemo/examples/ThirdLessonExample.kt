package ru.otus.otusdemo.examples


//=================ActivityResult между MainActivity и SeconActivity
//class MainActivity : AppCompatActivity() {
//
//    private var currentName = "Alexey"
//    lateinit var currentNameTextView: TextView
//
//    private val resultContract =
//        registerForActivityResult(ContractMainActivityAndSecondActivity()) { result ->
//            if(result == null || result == ""){
//                Toast.makeText(this,"Имя не изменено", Toast.LENGTH_SHORT).show()
//                return@registerForActivityResult
//            }
//            currentName = result
//            currentNameTextView.text = currentName
//        }
//
//    override fun onCreate(savedInstanceState: Bundle?) {
//        super.onCreate(savedInstanceState)
//        setContentView(R.layout.activity_main)
//        val button = findViewById<Button>(R.id.mainActivityButton)
//        currentNameTextView = findViewById(R.id.currentName)
//        currentNameTextView.text = currentName
//        button.setOnClickListener {
//            resultContract.launch(currentName)
//        }
//    }
//}

//class SecondActivity : AppCompatActivity() {
//
//    override fun onCreate(savedInstanceState: Bundle?) {
//        super.onCreate(savedInstanceState)
//        setContentView(R.layout.activity_second)
//        val textView = findViewById<TextView>(R.id.userInput)
//        textView.text = intent.extras?.getString("userInput")
//
//        val editText = findViewById<EditText>(R.id.editText)
//
//        val button = findViewById<Button>(R.id.sendResult)
//        button.setOnClickListener {
//            val intent = Intent().putExtra("resultKey", editText.text.toString())
//            setResult(RESULT_OK, intent)
//            finish()
//        }
//    }
//
//    override fun onBackPressed() {
//        super.onBackPressed()
//        setResult(RESULT_CANCELED)
//    }
//}

//Загрузка картинок из галлереи
//=================
//val resultContract = registerForActivityResult(ActivityResultContracts.GetContent()) { result ->
//    findViewById<ImageView>(R.id.image).setImageURI(result)
//}
//
//
//
//override fun onCreate(savedInstanceState: Bundle?) {
//    super.onCreate(savedInstanceState)
//    setContentView(R.layout.activity_main)
//
//    val button = findViewById<Button>(R.id.mainActivityButton).setOnClickListener {
//        resultContract.launch("image/*")
//    }
//}

//=== Пермишен на камеру и получение картинки с камеры
//class MainActivity : AppCompatActivity() {
//
//    val camera = registerForActivityResult(ActivityResultContracts.TakePicturePreview()) { bitmap ->
//        findViewById<ImageView>(R.id.image).setImageBitmap(bitmap)
//    }
//
//    private val permissionCamera = registerForActivityResult(ActivityResultContracts.RequestPermission()) { granted ->
//
//        when {
//            granted -> {
//                //Пермишен к камере получен, запускаем камеру
//
//                camera.launch(null)
//            }
//            !shouldShowRequestPermissionRationale(Manifest.permission.CAMERA) -> {
//                // пользователь нажал "не спрашивать больше"
//                val intent = Intent(Settings.ACTION_APPLICATION_DETAILS_SETTINGS).apply {
//                    val uri = Uri.fromParts("package", packageName, null)
//                    data = uri
//                }
//                startActivity(intent)
//            }
//            else -> {
//                //Пользователь просто отклонил, без "не спрашивать больше"
//                Toast.makeText(this, "Ну сорян, не хочешь не надо", Toast.LENGTH_SHORT).show()
//            }
//        }
//    }
//
//    override fun onCreate(savedInstanceState: Bundle?) {
//        super.onCreate(savedInstanceState)
//        setContentView(R.layout.activity_main)
//
//        findViewById<Button>(R.id.mainActivityButton).setOnClickListener {
//            permissionCamera.launch(Manifest.permission.CAMERA)
//        }
//    }

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
//Notification permission

//https://otus.ru/polls/56119/
