package org.hustzl.controller;


import org.hustzl.form.RuleForm;
import org.hustzl.service.SystemAdminService;
import org.hustzl.vo.ResultVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RestController;

/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author yuechuhaoxi020609
 * @since 2022-06-29
 */
@RestController
@RequestMapping("/systemAdmin")
public class SystemAdminController {
    @Autowired
    private SystemAdminService systemAdminService;

    @GetMapping("/login")
    public ResultVO login(RuleForm ruleForm) {
        ResultVO resultVO = this.systemAdminService.login(ruleForm);
        return resultVO;
    }
}

