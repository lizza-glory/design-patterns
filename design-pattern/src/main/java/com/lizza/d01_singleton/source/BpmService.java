package com.lizza.d01_singleton.source;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

/**
 * @Desc:
 * @author: lizza1643@gmail.com
 * @date: 2020-07-11
 */
@Scope("prototype")
@Service("bpmService")
public class BpmService {

    static {
        System.out.println("BPM Service Init");
    }
}
