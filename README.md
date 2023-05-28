<<<<<<< HEAD
# Activity #3

### Задание #1
В классе **EditProfileActivity** по клику на `ImageView` с `id=imageview_photo` покажите Alert Dialog с выбором действия. Используйте реализацию диалога указанную в [примере](https://material.io/components/dialogs/android#simple-dialog), в качестве элементов массива добавьте элементы “Сделать фото” и “Выбрать фото”

По клику на кнопку Сделать фото запросите у пользователя Runtime Permission на использование камеры. Обработайте следующие возможные сценарии:

1. Пользователя выдал разрешение на использование камеры → отобразите в ImageView ресурс `R.drawable.cat`
2. Пользователь не разрешил использовать камеру первый раз → ничего не делаем
3. Пользователь еще раз запросил разрешение на использование камеры после отмены → покажите Rationale Dialog, и объясните зачем вам камера

   В качестве реализации Rationale Dialog используйте [простой Alert Dialog](https://material.io/components/dialogs/android#alert-dialog) с двумя кнопками: “Дать доступ” и “Отмена”. По клику на кнопку “Дать доступ” повторно запросите разрешение, по клику на кнопку “Отмена” закройте диалоговое окно

4. Пользователь повторно запретил использовать камеру → Покажите диалоговое окно с одной кнопкой → “Открыть настройки”. По клику на кнопку отправьте пользователя в настройки приложения, с возможностью поменять разрешение

> 💡 В этом задании вам не нужно использовать какое либо кеширование/флаги и прочее. Реализуйте все с использованием ResultApi и методов Activity

### Задание #2
По клику на кнопку “Выбрать фото” откройте экран выбора фото из галлереи, после того как вы получите URI фотографии в `ActivityResultCallback` вызовите метод `populateImage`, чтобы отобразить полученную фотографию в ImageView

> 💡 Используйте готовый контракт из класса `ActivityResultContracts` для открытия пикера медиафайлов

<img src="art/Untitled.png" width="720">

### Задание #3
1. Создайте класс-наследник Activity **FillFormActivity** и добавьте в нее 3 EditText для ввода имени, фамилии и возраста, и кнопку “Применить”
2. В **EditProfileActivity** по клику на кнопку “Редактировать профиль” откройте **FillFormActivity** с запросом результата, используя ResultApi
3. По нажатию на кнопку “Применить” на **FillFormActivity** заберите введенный текст из 3 полей и отправьте результат на запустившую ее Activity, тоесть на **EditProfileActivity**
4. В **EditProfileActivity** обработайте полученный результат и отобразите контент в соответствующих TextView
5. Реализуйте функцию `openSenderApp` так, чтобы она отправляла явный интент в Telegram, в качестве extras отправьте картинку полученную из галлереи и контент TextView

<img src="art/Untitled%201.png" width="720">
=======
# Activity #2 Homework

Создайте в модуле **sender** класс **SenderActivity**. Добавьте в него три кнопки: **“To Google Maps”**, **“Send Email”** и **“Open Receiver”**. Добавьте пустые обработчики нажатий на эти кнопки.

1. По клику на кнопку **“To Google Maps”**, используя явный `Intent` вызовите `Activity` приложения Google Maps. После того как Google Maps поймает ваш Intent, в нем должны отобразиться ближайшие к текущей геолокации места по тэгу “*Рестораны”*

    <img src="art/Untitled.png" width="520">

2. По клику на кнопку **“Send Email”** отправьте неявный `Intent` в метод `startActivity()` Этот `Intent` должны уметь обработать любые почтовые клиенты(если они реализовали `intent-filter` согласно контракту).
   В качестве адресата используйте ящик *android@otus.ru*, тему и содержание письма придумайте сами.

    <img src="art/Untitled%201.png" width="520">

3. По клику на кнопку **“Open Receiver”** отправьте неявный `Intent` со следующими параметрами:

   - `action = Action.SEND`
   - `type = “text/plain”`
   - `category = Category.DEFAULT`

   В качестве extras отправьте три объекта String. В качестве значений extras используйте любой набор данных из файла *payload.txt*, который лежит в корне проекта **sender**.

   В модуле **receiver** зарегистрируйте `intent-filter`, таким образом, чтобы он поймал отправленный выше `Intent` и открыл **ReceiverActivity**. Полученные из `Intent` extras отобразите в соответсвующих полях:

    - title → `titleTextView`
    - year → `yearTextView`
    - description → `descriptionTextView`
    - В зависимости от названия фильма отобразите картинку которая лежит в ресурсах(*res/drawable*) в `posterImageView`

> 💡 Чтобы достать ресурс, используйте метод [Context.getDrawable()](https://developer.android.com/reference/android/content/Context#getDrawable(int)), а чтобы поменять картинку в ImageView используйте метод [setImageDrawable()](https://developer.android.com/reference/android/widget/ImageView#setImageDrawable(android.graphics.drawable.Drawable))

<img src="art/Untitled%202.png" width="720">
>>>>>>> homework/activity_02
