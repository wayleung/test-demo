//引用模块
var express = require('express')
var proxy = require('http-proxy-middleware')
var app  = express()
//静态资源直接访问
//如dist/js/jquery.js  访问路径为 http://localhost/js/jquery.js 在script标签中src="js/jquery.js"
app.use(express.static('dist'))

//api子目录下的都是用8080代理 
// 在我的源代码后端是8080端口开启 其中有两个controller  UserController  TestController
//UserController requestMapping是"/api"  访问http://localhost/api/users 相当于访问 http://localhost:8080/api/users
//TestController requestMapping是"/test" 访问http://localhost/test/users不能访问
//
const apiProxy = proxy('/api', { target: 'http://localhost:8080',changeOrigin: true });//将服务器代理到localhost:8080端口上[本地服务器为localhost:3000]
app.use('/api/*', apiProxy);


app.get('/index.html', function (req, res) {
   res.sendFile( __dirname + "/src/" + "index.html" );
})

app.get('/login.html', function (req, res) {
	res.sendFile( __dirname + "/src/" + "login.html" ); 
})
// app.get('*',function(req,res){
// 	res.sendFile( __dirname + "/src/" + "index.html" );
// })

app.listen(80,function(){
	console.log('connect successfully')
})