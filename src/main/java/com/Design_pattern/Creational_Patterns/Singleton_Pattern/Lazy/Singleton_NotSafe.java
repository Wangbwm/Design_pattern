package com.Design_pattern.Creational_Patterns.Singleton_Pattern.Lazy;
/*
�Ƿ� Lazy ��ʼ������

�Ƿ���̰߳�ȫ����

ʵ���Ѷȣ���

���������ַ�ʽ���������ʵ�ַ�ʽ������ʵ������������ǲ�֧�ֶ��̡߳���Ϊû�м��� synchronized�������ϸ��������������㵥��ģʽ��
���ַ�ʽ lazy loading �����ԣ���Ҫ���̰߳�ȫ���ڶ��̲߳�������������
 */
public class Singleton_NotSafe {
    private static Singleton_NotSafe instance;
    private Singleton_NotSafe(){}
  
    public static Singleton_NotSafe getInstance() {
        if (instance == null) {  
            instance = new Singleton_NotSafe();
        }  
        return instance;  
    }  
}