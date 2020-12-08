package com.example.practice.git.git;

public class Feature {
    public void feature1(){
        System.out.println("feature1");
        //新版
        //尝试在目前commitID上添加新的代码
        //最新的Commit ID是：c172b27ac9b751484aa158706387a18f9cd24cb5
        //尝试使用git commit --amend命令是否可以新加代码且不更改CommitID
        System.out.println("当前版本号是：c726c90ad511d764be673aa00ca35f23b1617c24");
    }

    public void feature2(){
        System.out.println("feature2");
    }
}
