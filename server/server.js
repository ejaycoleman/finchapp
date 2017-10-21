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
  	socket.emit('move-left');
  });

  socket.on('right-arrow', function() {
  	socket.emit('move-right');
  });

  socket.on('forward-arrow', function() {
  	socket.emit('move-forward');
  });

  socket.on('backward-arrow', function() {
  	socket.emit('move-backwards');
  });

  socket.on('foo', function() {
  	console.log("ok");
  })


});

http.listen(3000, function(){
  console.log('listening on *:3000');
});