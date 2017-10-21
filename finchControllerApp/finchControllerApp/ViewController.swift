//
//  ViewController.swift
//  finchControllerApp
//
//  Created by Elliott Coleman on 19/10/2017.
//  Copyright © 2017 Elliott Coleman. All rights reserved.
//

import UIKit
import SocketIO



class ViewController: UIViewController {
    
    let socket = SocketIOClient(socketURL: URL(string: "http://localhost:3000")!, config: [.log(true), .compress])

    override func viewDidLoad() {
        super.viewDidLoad()
        // Do any additional setup after loading the view, typically from a nib.
        
        
        
        socket.on(clientEvent: .connect) {data, ack in
            print("socket connected")
        }
        
        /*socket.on("currentAmount") {data, ack in
            if let cur = data[0] as? Double {
                socket.emitWithAck("canUpdate", cur).timingOut(after: 0) {data in
                    socket.emit("update", ["amount": cur + 2.50])
                }
                
                ack.with("Got your currentAmount", "dude")
            }
        }*/
        
        
        
        socket.connect()
        
    }
    
    @IBAction func leftButtonWasPressed(_ sender: UIButton) {
        socket.emit("left-arrow")
    }
    
    @IBAction func leftButtonWasReleased(_ sender: UIButton) {
        print("released")
        socket.emit("left-arrow-release")
    }
    
    @IBAction func forwardButtonWasPressed(_ sender: UIButton) {
        socket.emit("forward-arrow")
    }
    
    @IBAction func forwardButtonWasReleased(_ sender: UIButton) {
        socket.emit("forward-arrow-release")
    }
    
    @IBAction func rightButtonWasPressed(_ sender: UIButton) {
        socket.emit("right-arrow")
    }
    
    @IBAction func rightButtonWasReleased(_ sender: UIButton) {
        socket.emit("right-arrow-release")
    }
    
    @IBAction func backButtonWasPressed(_ sender: UIButton) {
        socket.emit("backward-arrow")
    }
    
    @IBAction func backButtonWasReleased(_ sender: UIButton) {
        socket.emit("backward-arrow-release")
    }
    
    override func didReceiveMemoryWarning() {
        super.didReceiveMemoryWarning()
        // Dispose of any resources that can be recreated.
    }


}

