姓名：廖灿坤 学号：202230441480
在brach中有着相关代码 lib是支持的jar包 web中是相关的代码 .idea中是模块设置文件
web中里面的webinf的classes是相关的类 lib是配置文件
admin是后台管理文件，css是样式，fonts是字体其他都是用户界面的东西
ecommerce_project/
│
├───WebContent/                     # 存放网页和JSP文件的根目录
│   ├───WEB-INF/                    # Web应用的配置文件和资源
│   │   ├───web.xml                 # 配置文件，定义Servlet、监听器、过滤器等
│   │   ├───lib/                    # 存放JAR包的目录
│   │   └───classes/                # 编译后的类文件存放目录
│   ├───index.jsp                   # 首页
│   ├───user_register.jsp           # 用户注册页面
│   ├───user_login.jsp              # 用户登录页面
│   ├───user_center.jsp             # 用户个人中心页面
│   ├───goods_list.jsp              # 商品列表页面
│   ├───goods_detail.jsp            # 商品详情页面
│   ├───order_list.jsp              # 订单列表页面
│   └───admin/                      # 管理员页面目录
│       ├───admin_goods_edit.jsp    # 商品编辑页面
│       ├───admin_goods_list.jsp    # 商品列表页面
│       └───admin_order_manage.jsp  # 订单管理页面
│
├───src/                            # Java源代码文件
│   ├───servlet/                    # Servlet文件夹，处理用户请求的业务逻辑
│   │   ├───UserRegisterServlet.java     # 用户注册Servlet
│   │   ├───UserLoginServlet.java        # 用户登录Servlet
│   │   ├───UserLogoutServlet.java       # 用户注销Servlet
│   │   ├───UserChangePwdServlet.java    # 修改密码Servlet
│   │   ├───GoodsBuyServlet.java         # 商品购买Servlet
│   │   ├───GoodsDeleteServlet.java      # 商品删除Servlet
│   │   ├───GoodsDetailServlet.java      # 商品详情Servlet
│   │   ├───GoodsListServlet.java        # 商品列表Servlet
│   │   ├───AdminGoodsEditServlet.java   # 管理员商品编辑Servlet
│   │   └───AdminOrderManageServlet.java # 管理员订单管理Servlet
│   ├───model/                        # 模型类文件夹，定义数据对象
│   │   ├───User.java                 # 用户类
│   │   ├───Goods.java                # 商品类
│   │   ├───Order.java                # 订单类
│   │   ├───Type.java                 # 商品类型类
│   │   └───Page.java                 # 分页类
│   ├───service/                      # 业务层，处理数据库交互
│   │   ├───UserService.java           # 用户相关业务逻辑
│   │   ├───GoodsService.java          # 商品相关业务逻辑
│   │   ├───OrderService.java          # 订单相关业务逻辑
│   │   └───TypeService.java           # 商品类型相关业务逻辑
│   ├───dao/                          # 数据访问层，数据库操作
│   │   ├───UserDao.java              # 用户数据操作
│   │   ├───GoodsDao.java             # 商品数据操作
│   │   ├───OrderDao.java             # 订单数据操作
│   │   └───TypeDao.java              # 商品类型数据操作
│   └───utils/                        # 工具类文件夹
│       ├───DBUtils.java              # 数据库连接工具类
│       ├───EmailUtils.java           # 邮件发送工具类
│       └───FileUploadUtils.java      # 文件上传工具类
│
├───picture/                         # 存放商品图片的目录
│
└───logs/                            # 存放日志文件的目录

