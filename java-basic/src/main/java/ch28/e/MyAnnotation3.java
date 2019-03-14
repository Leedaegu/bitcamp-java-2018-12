package ch28.e;

public @interface MyAnnotation3 {
  String value() default "오호라"; //선택 입력(입력을 안해도 된다).
}
