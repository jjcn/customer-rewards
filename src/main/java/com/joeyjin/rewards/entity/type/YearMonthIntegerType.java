package com.joeyjin.rewards.entity.type;

import org.hibernate.type.AbstractSingleColumnStandardBasicType;
import org.hibernate.type.descriptor.java.JavaType;
import org.hibernate.type.descriptor.jdbc.JdbcType;
import org.hibernate.type.descriptor.sql.IntegerTypeDescriptor;

import java.time.YearMonth;

/**
 * Convert YearMonth to Integer for Hibernate persistence.
 */
public class YearMonthIntegerType extends AbstractSingleColumnStandardBasicType<YearMonth> {

    public static final YearMonthIntegerType INSTANCE = new YearMonthIntegerType();

    public YearMonthIntegerType() {
        super((JdbcType) IntegerTypeDescriptor.INSTANCE, (JavaType<YearMonth>) YearMonthTypeDescriptor.INSTANCE);
    }

    public String getName() {
        return "yearMonth2int";
    }

    @Override
    protected boolean registerUnderJavaType() {
        return true;
    }
}