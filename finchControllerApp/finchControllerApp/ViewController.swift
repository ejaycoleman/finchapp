//
//  ViewController.swift
//  finchControllerApp
//
//  Created by Elliott Coleman on 19/10/2017.
//  Copyright © 2017 Elliott Coleman. All rights reserved.
//

import UIKit
import Socket



class ViewController: UIViewController {

    override func viewDidLoad() {
        super.viewDidLoad()
        // Do any additional setup after loading the view, typically from a nib.
        
        var inputStream: InputStream!
        var outputStream: OutputStream!
        
        /*var host :NSHost = NSHost(address: addr)
        var inp :NSInputStream?
        var out :NSOutputStream?*/
        
        //Stream.getStreamsToHost(hostname: addr, port: port, inputStream: , outputStream: , )
        
        var readStream: Unmanaged<CFReadStream>?
        var writeStream: Unmanaged<CFWriteStream>?
        
        // 2
        CFStreamCreatePairWithSocketToHost(kCFAllocatorDefault,
                                           "localhost" as CFString,
                                           2004,
                                           &readStream,
                                           &writeStream)
        
        inputStream = readStream!.takeRetainedValue()
        outputStream = writeStream!.takeRetainedValue()
        inputStream.schedule(in: .current, forMode: .commonModes)
        outputStream.schedule(in: .current, forMode: .commonModes)
        inputStream.open()
        outputStream.open()
        /*let inputStream = inp!
        let outputStream = out!
        inputStream.open()
        outputStream.open()
        
        var readByte :UInt8 = 0
        while inputStream.hasBytesAvailable {
            inputStream.read(&readByte, maxLength: 1)
        }*/
        
        // buffer is a UInt8 array containing bytes of the string "Jonathan Yaniv.".
        //outputStream.write(&buffer, maxLength: buffer.count)

        
    }

    override func didReceiveMemoryWarning() {
        super.didReceiveMemoryWarning()
        // Dispose of any resources that can be recreated.
    }


}

