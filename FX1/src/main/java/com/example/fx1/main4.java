package com.example.fx1;

import javafx.beans.InvalidationListener;
import javafx.beans.binding.IntegerBinding;
import javafx.beans.property.*;
import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;

import java.lang.constant.Constable;

public class main4 {
    public static void main(String[] args) {
        IntegerProperty integerProperty = new SimpleIntegerProperty(5);
        IntegerProperty integerProperty2 = new ReadOnlyIntegerWrapper(5);

        IntegerBinding integerBinding = new IntegerBinding() {
            {
                super.bind(integerProperty, integerProperty2);
            }

            @Override
            protected int computeValue() {
                return integerProperty.get() + integerProperty2.get();
            }
        };
        System.out.println(integerBinding.get());
        integerProperty.set(1);
        System.out.println(integerBinding.get());

//     IntegerProperty.addListener(new ChangeListener<Number>() {
//         @Override
//         public void changed(ObservableValue<? extends Number> observableValue, Number oldValue, Number newValue) {
//             System.out.println("new value = " + newValue);
//         }
//     });
//   IntegerProperty.bindBidirectional(integerProperty2);
//     integerProperty2.set(6);
//     //System.out.println(IntegerProperty.get());
//     IntegerProperty.set(7);
//     System.out.println(IntegerProperty2.get());
//        }
//    }

        class User {
            StringProperty stringProperty = new SimpleStringProperty("MAX");

            public Constable getStringProperty() {
                return stringProperty.get();
            }

            public StringProperty stringPropertyProperty() {
                return stringProperty;
            }

            public void setStringProperty(String stringProperty) {
                this.stringProperty.set(stringProperty);
            }
        }
    }
}