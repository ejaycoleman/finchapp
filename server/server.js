var app = require('express')();
var http = require('http').Server(app);
var io = require('socket.io')(http);

io.on('connection', function(socket){
  console.log('a user connected');

  io.emit('newuser');

  
  socket.on('disconnect', function(){
    console.log('user disconnected');
  });

  socket.on('left-arrow', function() {
  	io.emit('move-left');
  });

  socket.on('left-arrow-release', function() {
  	console.log("released");
  	io.emit('stop-move-left');
  });

  socket.on('right-arrow', function() {
  	io.emit('move-right');
  });

  socket.on('right-arrow-release', function() {
  	io.emit('stop-move-right');
  });

  socket.on('forward-arrow', function() {
  	io.emit('move-forward');
  });

  socket.on('forward-arrow-release', function() {
  	io.emit('stop-move-forward');
  });

  socket.on('backward-arrow', function() {
  	io.emit('move-back');
  });

  socket.on('backward-arrow-release', function() {
  	io.emit('stop-move-back');
  });

  socket.on('foo', function() {
  	console.log("ok");
  })


});

http.listen(3000, function(){
  console.log('listening on *:3000');
});