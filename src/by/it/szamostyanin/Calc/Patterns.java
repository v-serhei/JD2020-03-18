package by.it.szamostyanin.Calc;

public interface Patterns {
    String OPERATION="(?<=[^{,=*/+-])[=*/+-]";
    String SCALAR="((-?)([0-9.])+)";
    String VECTOR="\\{((-?([0-9.])+),?)+}";
    String MATRIX="\\{((\\{((-?([0-9.])+),?)+}),?)+}";
}
