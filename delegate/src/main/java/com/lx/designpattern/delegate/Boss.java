package com.lx.designpattern.delegate;

/**
 * boss 一般有很多奇奇怪怪的想法， 但是他不自己搞， 他找一个团队的负责人
 * 因为： 负责人更了解下面的人， 更能合理安排
 * 重点: boss手下那么多人 都了解累死了
 */
public class Boss {
    public void getIdea(String idea){
        new Leader().doing(idea);
    }
}
