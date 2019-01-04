
var app = require('express')();
var http = require('http').Server(app);
var io = require('socket.io')(http);
import * as fs from 'fs-extra';


// io.on('connection', function(socket){
//   console.log('a user connected');
// });
var absoluteDirPath = 'D:/myproject/Star/node-demo/socket/user_data/user.json'
http.listen(2222, function () {
  console.log('listening on http://localhost:2222');
});

io.on('connection', function (client) {
  client.on('message', (userData, callback) => {
    console.log("USERDATA :::::::::: " + JSON.stringify(userData));
    callback({ 'success': 'This Response from server .. Cheers..' });
    
  })
  client.on('getUserDetails', (userData, callback) => {
    console.log("USERDATA :::::::::: " + JSON.stringify(userData));

    var contents = fs.readFileSync(absoluteDirPath, 'utf8');

						var  = JSON.parse(contents);

    callback({ 'success': 'This Response from server .. Cheers..' });
    
  })
});