package com.billcom.addcontract.controller;

import com.billcom.addcontract.service.ThreadService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/thread")
@CrossOrigin(origins = "*", allowedHeaders = "*")
@RequiredArgsConstructor
public class ThreadController{

    final ThreadService thread;


    @GetMapping("/StartNewThread")
    public int startNewThread() {
        return thread.startNewThread();
    }

    @GetMapping("/StopAllThreads")
    public void killAllThreads() {
        thread.killAllThreads();
    }

    @GetMapping("/StopThreadById")
    public String killThreadById(@RequestParam int id){
        return thread.killThreadById(id);
    }

    @GetMapping("/GetThreadsNumber")
    public int getThreadsNumber(){
        return thread.getThreadsNumber();
    }

    @GetMapping("GetThreadInfo")
    public Object getThreadInfo(int id){
        return thread.getThreadInfo(id);
    }

    @GetMapping("GetStreamInfo")
    public Object getStreamInfo(int id){
        return thread.getStreamInfo(id);
    }

}
