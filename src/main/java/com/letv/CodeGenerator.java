package com.letv;

import cn.org.rapid_framework.generator.GeneratorFacade;

/**
 * 功能说明: <br>
 * 系统版本: v1.0<br>
 * 开发人员: @author huadi<br>
 * 开发时间: 2017年04月12日<br>
 */
public class CodeGenerator {

    public static void main(String[] args) throws Exception {
        String templatePath = "D:\\workspace\\ssm2\\src\\main\\resources\\template";
        GeneratorFacade generatorFacade = new GeneratorFacade();
        generatorFacade.getGenerator().addTemplateRootDir(templatePath);
        generatorFacade.generateByTable("student");
    }
}
