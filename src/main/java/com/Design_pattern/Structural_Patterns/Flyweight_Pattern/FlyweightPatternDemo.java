package com.Design_pattern.Structural_Patterns.Flyweight_Pattern;

import com.Design_pattern.Structural_Patterns.Flyweight_Pattern.shape.ShapeFactory;
import com.Design_pattern.Structural_Patterns.Flyweight_Pattern.shape.impl.Circle;
/*
��Ԫģʽ�����仰˵���ǹ��������ĳЩ������Ҫ�ظ�������������ֻ��Ҫ�õ���һ����������ʹ�á�
��Ϊ����ģʽ��������ǰ���������ж���ͨ��ĳ�ֹ���ȥ�жϵ�ǰ��������Ƿ��������ԭ�ж�������Ӧ�޸ĺ�õ���Ҫ��Ч���������Ͻ̵̳�ʵ����
������20����ͬЧ����Բ������ͬ��ɫ��Բֻ��Ҫ����һ�α�ɣ���ͬ��ɫ��ֻ��Ҫ����ԭ�ж��󣬸ı�������ֵ��ɡ�����ģʽ�£�ͬһ��ɫ��Բ��Ȼλ�ò�ͬ�������ַ����ͬһ����
����˵��ģʽ�����ڽ��ע�ص�һ����������

��һ�������ӣ�һ����Ϸ���в�ͬ��Ӣ�۽�ɫ��ͬһ���͵Ľ�ɫҲ�в�ͬ���Ե�Ӣ�ۣ���̿����͵�Ӣ���кܶ����������ģʽ��ƣ�
����Ӣ����������ȥ����ԭ��ͬһ���͵�Ӣ��ʵ����Ȼ�������Ӧ���Խ����޸ģ���ɵõ�������õ�������Ӣ�ۣ�����˵�㴴���˵�һ���̿���Ӣ�ۣ�
Ȼ����Ҫ��Ƶڶ����̿���Ӣ�ۣ������õ�һ��Ӣ�۸ı����Եõ��ڶ����̿�Ӣ�ۣ����µĴ̿�Ӣ���ǵ����ˣ�����һ���̿�Ӣ�۵�����Ҳ��֮�����ڶ�����ͬ�����������Ȼ�ǲ����Եġ�
 */
public class FlyweightPatternDemo {
   private static final String colors[] = 
      { "Red", "Green", "Blue", "White", "Black" };
   public static void main(String[] args) {
 
      for(int i=0; i < 20; ++i) {
         Circle circle =
            (Circle) ShapeFactory.getCircle(getRandomColor());
         circle.setX(getRandomX());
         circle.setY(getRandomY());
         circle.setRadius(100);
         circle.draw();
      }
   }
   private static String getRandomColor() {
      return colors[(int)(Math.random()*colors.length)];
   }
   private static int getRandomX() {
      return (int)(Math.random()*100 );
   }
   private static int getRandomY() {
      return (int)(Math.random()*100);
   }
}