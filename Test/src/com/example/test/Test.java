package com.example.test;

import dao.ZhangWuDAO;
import domain.ZhangWu;

public class Test {

    private static ZhangWuDAO dao = new ZhangWuDAO();

    public static void main(String[] args) {

        ZhangWu zhangWu = new ZhangWu(0, "工资收入", 8000, "现金", "2016-10-31", "又开工资");
        int rows = dao.insert(zhangWu);
        if (rows != 0) {
            System.out.println("插入成功");
        }
    }
}
