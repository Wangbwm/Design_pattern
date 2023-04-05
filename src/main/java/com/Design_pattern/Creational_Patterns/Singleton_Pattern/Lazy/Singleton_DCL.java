package com.Design_pattern.Creational_Patterns.Singleton_Pattern.Lazy;
/*
JDK �汾��JDK1.5 ��

�Ƿ� Lazy ��ʼ������

�Ƿ���̰߳�ȫ����

ʵ���Ѷȣ��ϸ���

���������ַ�ʽ����˫�����ƣ���ȫ���ڶ��߳�������ܱ��ָ����ܡ�
getInstance() �����ܶ�Ӧ�ó���ܹؼ���
 */
public class Singleton_DCL {
    private volatile static Singleton_DCL singletonDCL;
    private Singleton_DCL(){}
    public static Singleton_DCL getSingleton() {
    if (singletonDCL == null) {
        synchronized (Singleton_DCL.class) {
            if (singletonDCL == null) {
                singletonDCL = new Singleton_DCL();
            }  
        }  
    }  
    return singletonDCL;
    }  
}