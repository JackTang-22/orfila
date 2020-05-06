
    String是不可变对象只要创建变会一直存在，直到gc回收
    jdk7开始，switch语句中可以使用String
    Integer.parseInt("10") -> 字符串转换为int
    "".split(xxx) -> 切分字符串，返回String[]
    从Java7开始，substring()方法会创建一个新的char数组，而不是使用已经存在的
    String是不可变的，StringBuilder和StringBuffer都是可变的
    StringBuffer是同步的，线程安全的，效率低
    StringBuilder是非同步的，非线程安全，效率比StringBuffer高
    
    String是字符串常量，StringBuffer和StringBuilder都是字符串变量，后两者的字符内容可变，而前者创建后内容不可变；
    StringBuffer是线程安全的，而StringBuilder是非线程安全的，线程安全会带来额外的系统开销，所以StringBuilder的效率比
    StringBuffer高；String的每次修改操作都是在内存中重新new一个对象出来，而StringBuffer、StringBuilder则不用，且提
    供了一定的缓存功能，默认16个字节数组的大小，超过默认的数组长度时扩容为原来字节数组的长度*2+2，所以使用StringBuffer和
    StringBuilder 时可以适当考虑下初始化大小，以便通过减少扩容次数来提高代码的高效性。
    
    String chenmo = "沉默";
    String wanger = "王二";
    System.out.println(chenmo + wanger);
    
    String chenmo = "\u6C89\u9ED8";
    String wanger = "\u738B\u4E8C";
    System.out.println((new StringBuilder(String.valueOf(chenmo))).append(wanger).toString());
    
    字符串拼接 + 会被替换成StringBuilder的append方法
    
    String不可变是因为在JDK中String类被声明为一个final类，且类内部的value字节数组也是final的，只有当字符串
    是不可变时字符串池才有可能实现，字符串池的实现可以在运行时节约很多heap空间，因为不同的字符串变量都指向池中
    的同一个字符串；如果字符串是可变的则会引起很严重的安全问题，譬如数据库的用户名密码都是以字符串的形式传入来
    获得数据库的连接，或者在 socket 编程中主机名和端口都是以字符串的形式传入，因为字符串是不可变的，所以它的值
    是不可改变的，否则黑客们可以钻到空子改变字符串指向的对象的值造成安全漏洞；因为字符串是不可变的，所以是多线程
    安全的，同一个字符串实例可以被多个线程共享，这样便不用因为线程安全问题而使用同步，字符串自己便是线程安全的；
    因为字符串是不可变的所以在它创建的时候hashcode就被缓存了，不变性也保证了hash码的唯一性，不需要重新计算，
    这就使得字符串很适合作为Map的键，字符串的处理速度要快过其它的键对象，这就是HashMap中的键往往都使用字符串的原因
    
    在java的class文件中有专门的部分用来存储编译期间生成的字面常量和符号引用，这部分叫做class文件常量池，在运行期间
    对应着方法区的运行时常量池，所以String str = "hello world"; 在编译期间生成了字面常量和符号引用，运行期间字面
    常量"hello world"被存储在运行时常量池（只保存了一份），而通过new关键字来生成对象是在堆区进行的，堆区进行对象
    生成的过程是不会去检测该对象是否已经存在的，所以通过new来创建的一定是不同的对象，即使字符串的内容是相同的。
    
    String str = new String("abc"); 一共创建了多少个对象
    在运行期间只创建了一个对象（堆上的"abc"对象）
    类加载过程中在运行时常量池中先创建了一个"abc"对象
    
    
   
    
    

    