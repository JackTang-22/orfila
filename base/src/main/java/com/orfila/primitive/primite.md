
    值类型:
       1. 整数型:
          byte   8位
          short  16位
          int    32位
          long   64位
       2. 浮点型:
          float   32位
          double  64位
       3. 字符型:
          char    16位  存储unicode编码
       4. bool型:
          boolean  true 和 false

     引用类型: 除值类型以外的数据类型
     区别:
      1. 基本类型指向具体的值，引用类型指向数据对象的地址
      2. 基本类型在变量声明后会立刻分配内存空间，引用类型不会分配内存，只是存储了一个内存地址
      3. 基本类型使用时赋值需要赋具体的值，判断使用==，引用类型赋值可以赋值为null，判断使用equals方法
     数据类型转换:
      1. 自动转换: 小数据->大数据，转换前后数据类型要兼容，整形和浮点计算后，会转换成浮点
      2. 强制转化: 引用类型也可以强制转换
     装箱和拆箱:
         Byte <-> byte
         Short <-> short
         Integer <-> int
         Long <-> long
         Float <-> float
         Double <-> double
         Character <-> char
         Boolean <-> boolean
     包装类:使得基本数据类型可以和引用数据类型转化
     装箱: 值类型转换为引用类型   valueOf 方法实现
     拆箱: 引用类型转换为值类型   xxxValue 方法实现
     自动装箱会隐式的创建对象
     自动装箱和拆箱的设计依赖享元模式的设计模式实现