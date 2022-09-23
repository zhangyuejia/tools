package com.zhangyj.cmdexecutor.core.service;


import com.zhangyj.cmdexecutor.core.common.config.CmdConfig;

/**
 * @author zhangyj
 */
public interface CmdService<T extends CmdConfig> {

    /**
     * 执行命令
     * @throws Exception 异常
     */
    void exec() throws Exception;

    /**
     * 获取配置类
     * @return 配置类
     */
    T getConfig();

    /**
     * 设置配置类
     * @param c 配置类
     */
    void setConfig(T c);
}
