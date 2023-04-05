package com.Design_pattern.Creational_Patterns.Singleton_Pattern.Lazy;
/*
�Ƿ� Lazy ��ʼ������

�Ƿ���̰߳�ȫ����

ʵ���Ѷȣ���

���������ַ�ʽ�߱��ܺõ� lazy loading���ܹ��ڶ��߳��кܺõĹ��������ǣ�Ч�ʺܵͣ�99% ����²���Ҫͬ����
�ŵ㣺��һ�ε��òų�ʼ���������ڴ��˷ѡ�
ȱ�㣺������� synchronized ���ܱ�֤��������������Ӱ��Ч�ʡ�
getInstance() �����ܶ�Ӧ�ó����Ǻܹؼ����÷���ʹ�ò�̫Ƶ������
 */
public class Singleton_Safe {
    private static Singleton_Safe instance;
    private Singleton_Safe(){}
    public static synchronized Singleton_Safe getInstance() {
        if (instance == null) {  
            instance = new Singleton_Safe();
        }  
        return instance;  
    }  
}