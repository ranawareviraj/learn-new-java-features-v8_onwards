package org.example.immutable;


// Immutable class - Declared final
public final class ImmutableClass {
    // Final fields
    private final int a;

    private final CustomType customType;

    public ImmutableClass(int a, CustomType customType) {
        this.a = a;
        this.customType = customType;
    }

    // Only getter method no setter
    public int getA() {
        return a;
    }

    // Return new object for custom types to prevent modification
    public CustomType getCustomType() {
        return new CustomType(customType.getB());
    }

    public static void main(String[] args) {
        ImmutableClass immutableClass = new ImmutableClass(10, new CustomType(20));
        System.out.println("a: " + immutableClass.getA());
        System.out.println("Before change value of 'b': " + immutableClass.getCustomType().getB()); // Modification is done to a new object

        immutableClass.getCustomType().setB(30);
        System.out.println("After change value of 'b': " +immutableClass.getCustomType().getB());
    }
}
