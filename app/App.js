import React from 'react';
import { StyleSheet, Text, View, Button, TouchableOpacity } from 'react-native';

import SocketIOClient from 'socket.io-client';

this.socket = SocketIOClient('http://192.168.208.184:3000');

export default class App extends React.Component {
	forwardPressed() {
		socket.emit('forward-arrow');
	}

	forwardReleased() {
		socket.emit('forward-arrow-release');
	}

	backPressed() {
		socket.emit('backward-arrow');
	}

	backReleased() {
		socket.emit('backward-arrow-release');
	}

	leftPressed() {
		socket.emit('left-arrow');
	}

	leftReleased() {
		socket.emit('left-arrow-release');
	}

	rightPressed() {
		socket.emit('right-arrow');
	}

	rightReleased() {
		socket.emit('right-arrow-release');
	}


  render() {
  	

    return (
      <View style={styles.container}>
		<TouchableOpacity onPressIn={this.forwardPressed} onPressOut={this.forwardReleased} style={styles.forward}>
		     <Text>Forward</Text>
		</TouchableOpacity>
		<TouchableOpacity onPressIn={this.backPressed} onPressOut={this.backReleased} style={styles.back}>
		     <Text>Back</Text>
		</TouchableOpacity>
		<TouchableOpacity onPressIn={this.leftPressed} onPressOut={this.leftReleased} style={styles.left}>
		     <Text>Left</Text>
		</TouchableOpacity>
		<TouchableOpacity onPressIn={this.rightPressed} onPressOut={this.rightReleased} style={styles.right}>
		     <Text>Right</Text>
		</TouchableOpacity>
      </View>
    );
  }
}

const styles = StyleSheet.create({
  container: {
    flex: 1,
    backgroundColor: '#fff',
    alignItems: 'center',
    justifyContent: 'center',
  },
  forward: {
  	top: 0,
  },
  back: {
  	bottom: 0,
  },
  left: {
  	left: 0,
  },
  right: {
  	right: 0,
  },
});
