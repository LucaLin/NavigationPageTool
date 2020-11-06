# NavigationPageTool
使用kotlin的一個Navigation的簡易範例，包含換頁效果與參數傳送

### 一、 換頁效果

step 1：在gradle中導入所需套件

*專案層級的gradle中：

dependencies {

        //your dependencies here
        //...
        classpath "androidx.navigation:navigation-safe-args-gradle-plugin:2.0.0"
    }

    
*應用程式的gradle中：

        apply plugin: 'androidx.navigation.safeargs.kotlin'



step 2：在res資料夾中建立navigation resourse,並建立一個navigation resource file

![image](https://github.com/LucaLin/NavigationPageTool/blob/main/screenshots/3.PNG)


step 3：建立兩個空白的fragment

![image](https://github.com/LucaLin/NavigationPageTool/blob/main/screenshots/5.PNG)

step 4：在my_navigation.xml中有圖形化介面可操作，點選「add」可看到剛才新增的fragment

![image](https://github.com/LucaLin/NavigationPageTool/blob/main/screenshots/6.PNG)

navagation分為三部分：

1 destination：指定跳頁的目的地

2 action：跳頁的動作內容

3 argument：傳送的參數

實現跳頁的動畫可以在action中編輯，或是使用設定頁設定，一樣會在xml中出現相關的代碼

![image](https://github.com/LucaLin/NavigationPageTool/blob/main/screenshots/7.PNG)


![image](https://github.com/LucaLin/NavigationPageTool/blob/main/screenshots/8.PNG)

step 5：點選跳頁動作

我在fragment中加入一個button，在點擊事件中使用navController來執行action，參數內容就是剛才的action id

![image](https://github.com/LucaLin/NavigationPageTool/blob/main/screenshots/9.PNG)

現在來看一下效果吧！

<img src="https://github.com/LucaLin/NavigationPageTool/blob/main/screenshots/1.gif" width="320" height="600"/>
