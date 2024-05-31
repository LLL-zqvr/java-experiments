package com.example.practice01;
import com.example.practice01.entity.Apple;
import org.w3c.dom.ls.LSOutput;

import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.function.Function;
import java.util.stream.Collectors;

import static com.example.practice01.resource.DatabaseUtils.appleList;

public class Test {
    public static void main(String[] args) {

    }
    //获取指定颜色的苹果
    private static List<Apple> getStreamColor(Apple.Color color){
        return appleList().stream()
                .filter(a ->a.getColor() == color)
                .toList();
    }
    //将苹果重量收集新的集合，并打印输出
    private static void printListWeight(){
        appleList().stream()
                .map(Apple::getWeight)
                .toList()
                .forEach(System.out::println);
    }
    //以苹果Id逆序排序并打出
    private static void printListSortedById(){
        appleList().stream()
                .sorted(Comparator.comparing(Apple::getId).reversed())
                .toList()
                .forEach(a -> {
                    System.out.println(a.getId() +" " + a.getColor() + " " + a.getWeight());
                });
    }
    //得到两个集合中Id相同的苹果
    private static List<Apple> getApples(List<Apple> apples){
        return appleList().stream()
                .filter(a -> apples.stream()
                        .anyMatch(oa -> a.getId() == oa.getId())
                )
                .toList();
    }
    //将所有的苹果颜色映射成新的set集合
    private static void appleSet(){
                 appleList().stream()
                .map(Apple::getColor)
                .collect(Collectors.toSet())
                         .forEach(System.out::println);
    }
    //基于颜色分组苹果
    private static Map<Apple.Color,List<Apple>> appleMapByColor(){
        return appleList().stream()
                .collect(Collectors.groupingBy(Apple::getColor));

    }
    //基于Id分组苹果并获取其重量
    private static void appleMapById(){
         appleList().stream()
                .collect(Collectors.toMap(Apple::getId, a -> a))
                .forEach((k,v) -> {
                            System.out.println(k + " " + v.getWeight());
                        }
                        );
    }
    //

}
