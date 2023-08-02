package com.joeyjin.rewards.entity.type;

import org.hibernate.type.AbstractSingleColumnStandardBasicType;
import org.hibernate.type.descriptor.sql.IntegerTypeDescriptor;

import java.time.YearMonth;

/**
 * Convert YearMonth to Integer for Hibernate persistence.
 */
public class YearMonthIntegerType extends AbstractSingleColumnStandardBasicType<YearMonth> {

    public static final YearMonthIntegerType INSTANCE = new YearMonthIntegerType();

    public YearMonthIntegerType() {
        super(IntegerTypeDescriptor.INSTANCE, YearMonthTypeDescriptor.INSTANCE);
    }

    public String getName() {
        return "yearMonth2int";
    }

    @Override
    protected boolean registerUnderJavaType() {
        return true;
    }
}