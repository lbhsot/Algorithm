# 说明:
开发工具默认为AndroidStudio,下文的设置项是指AndroidStudio的设置项

# 规范

## 命名规范
#### 1.包命名
全部单词用小写字母   
eg:   
	```
	cn.block12.mojigo   
	```
#### 2.类和接口命名   
使用大驼峰规则，用名词或名词词组命名，每个单词的首字母大写。   
eg:   
activity类，命名以Activity为后缀，如：`LoginActivity`   
fragment类，命名以Fragment为后缀，如：`ShareDialogFragment`   
service类，命名以Service为后缀，如：`DownloadService`   
adapter类，命名以Adapter为后缀，如：`CouponListAdapter`   
工具类，命名以Util为后缀，如：`FileUtil`   
对外提供的interface, 实现的时候，实现类命名规范是`xxxImpl`   
#### 3.方法命名   
使用小驼峰规则，用动词命名，第一个单词的首字母小写，其他单词的首字母大写。   
eg:   
	`initView();`   
	`startCamera();`   
#### 4.控件命名   
常用控件缩写   
TextView        -->tv   
Button          -->btn   
ImageView       -->iv   
EditText        -->et   
LinearLayout    -->llayout   
ReleativeLayout -->rlayout   
FrameLayout     -->flayout   
ScrollView      -->scrollView   
xml中：<控件缩写>\_<类名>\_<功能>   
eg：   
`btn_user_login`         
`et_user_username`   
java类中：使用驼峰命名法，变量前加m   
eg：   
`mBtnLogin`   
`mEtUsername`   
#### 5.常量命名
全部为大写单词，单词之间用下划线分开。   
eg：   
```
public final static int PAGE_SIZE = 20;   
```
#### 6.变量命名   
使用驼峰命名法，变量前加m   
eg：   
```
private int mPageOffset;
```   
#### 7.layout布局命名   
<功能>\_<组件类型>\_<具体页面>   
功能\_activity\_页面，为Activity的命名格式   
功能\_fragment\_页面，为Fragment的命名格式      
功能\_dialog\_页面，为Dialog的命名格式   
功能\_item\_list\_页面，为ListView的item命名格式   
功能\_item\_grid\_页面，为GridView的item命名格式   
功能\_header\_list\_页面，为ListView的HeaderView命名格式   
功能\_footer\_list\_页面，为ListView的FooterView命名格式   
eg:   
```
microblog_activity_details        //blog详情页面  
microblog_fragement_list       //blog列表界面   
...
```   
#### 8.strings的命名   
<类名>\_{<范围>\_}<逻辑名>   
eg：   
`<string name="blog_upvote_like">点赞</string>    //BlogActivity 点赞`   
`<string name="login_username">用户名</string>         //login界面用户名`   
#### 9.colors的命名   
前缀{\_控件}{\_范围}{\_后缀}，控件、范围、后缀可选，但控件和范围至少要有一个。   
背景颜色，添加bg前缀   
文本颜色，添加tv前缀   
分割线颜色，添加div前缀   
区分状态时，默认状态的颜色，添加normal后缀   
区分状态时，按下时的颜色，添加pressed后缀   
区分状态时，选中时的颜色，添加selected后缀   
区分状态时，不可用时的颜色，添加disable后缀   
eg:   
    `<color name="bg_login">#FFFFFF</color>          //login界面背景颜色`   
    `<color name="tv_cancel_login">#FFFFFF</color>   //login界面cancel按钮字体颜色`   
    `<color name="bg_submit_normal">#FFFFFF</color>  //提交按钮正常颜色`   
#### 10.drawable的文件命名
drawable用来放资源文件，只保留drawable-xhdpi，drawable-xxhdpi，drawable-xxxhdpi，分别对应720p，1080p，2K+ 的屏幕尺寸   
前缀{\_控件}{\_范围}{\_后缀}，控件、范围、后缀可选   
图标类，添加ic前缀   
背景类，添加bg前缀   
分隔类，添加div前缀   
默认类，添加def前缀   
区分状态时，默认状态，添加normal后缀   
区分状态时，按下时的状态，添加pressed后缀   
区分状态时，选中时的状态，添加selected后缀   
区分状态时，不可用时的状态，添加disable后缀   
多种状态的，添加selector后缀（一般为ListView的selector或按钮的selector）   
eg:   
    ic\_actionbar\_add            //actionbar的添加图标   
    ic\_cancel\_login\_pressed     //login页面取消按钮按下时的图标   
#### 11.mipmap的命名规范
mipmap文件夹目前只用来放logo   
命名统一为 ic\_launcher.png   
不同分辨率logo尺寸   
mipmap-mdip     --> 48\*48px   
mipmap-hdpi     --> 72\*72px   
mipmap-xhdpi    --> 96\*96px   
mipmap-xxhdpi   --> 144\*144px   
mipmap-xxxhdpi  --> 192\*192px   
#### 12.动画文件命名
{范围\_}{控件\_}动画类型\_动画方向   
eg:   
`login_username_fade_in.xml`  	//login页面username淡入动画   
## 注释
#### 1.文件头注释
注明作者，时间，功能
eg：   
```
/**
 * Created by zhe on 2017/2/21.
 * 拍照页面
*/
 public class CameraActivity extends BaseActivity{

}
```
#### 2.方法注释
注明方法作用，参数含义，返回值说明
eg：   
```
/**
* GPS是否打开
*
* @param context 上下文环境
* @return true已打开，false未打开
 */
public boolean isGpsEnabled(Context context) {

}
```
#### 3.变量和常量注释   
优先采用右侧//来注释，若注释说明太长则在上方添加注释。   
eg：   
```
public static final int TYPE_USER = 1;                // 普通用户   
public static final int TYPE_AUTHOR = 2;                 // 作者

int id;                // 形象id
String name;           // 形象名称
String introduce;      // 形象简介
```
## 书写规范
#### 1.统一使用UTF-8编码   
AndroidStudio-Preferences-Editor-FileEncodings   
#### 2.花括号不要单独一行，和它前面的代码同一行。而且，花括号与前面的代码之间用一个空格隔开。   
```
public void method() {   
}  
```  
#### 3.空格的使用
(1) if、else、for、switch、while等逻辑关键字与后面的语句留一个空格隔开。   
(2) 运算符两边各用一个空格隔开。   
(3) 方法的每个参数之间用一个空格隔开   
#### 4.空行的使用
将逻辑相关的代码段用空行隔开，以提高可读性。空行也只空一行，不要空多行   
(1) 两个方法之间   
(2) 方法内的两个逻辑段之间   
(3) 方法内的局部变量和方法的第一条逻辑语句之间   
(4) 常量和变量之间   
#### 5.一行声明一个变量，不要一行声明多个变量，这样有利于写注释。
```
private String param1; // 参数1   
private String param2; // 参数2   
```
#### 6.不使用魔法数字
所有其他类，方法中用到的，都要在所需要类的上方定义，在用到的地方引用   
#### 7.用于UI展示的字符串统一在strings.xml中定义，然后在代码和布局文件中引用。
#### 8.颜色值统一在colors.xml中定义，然后在代码和布局文件中引用
#### 9.xml中设置的文本，测试后记得删除
## AndroidStudio设置
#### 1.格式化代码
默认快捷键为Crtl+Alt+L
#### 2.删除多余import
默认快捷键为Crtl+Alt+O
## git规范
#### 1.小步提交
#### 2.每次提交的描述要为fixed+解决问题的编号+问题描述
eg:   
	`git commit -m 'fixed #4766 上传视频限制在5分钟以内'`   
## manifest规范   
#### 1.申请的权限写在application节点上方，且不要重复
#### 2.所有Activity，Service，BroadcastReceive，Content Provider都需要在manifest中注册

