package com.todo.model;

import lombok.Data;
import org.springframework.data.annotation.Id;

import java.math.BigInteger;

/**
 * Created by sebastian on 24.06.16.
 */
@Data
public class AbstractDocument {

    @Id
    private BigInteger id;

    public BigInteger getId() {
        return id;
    }

    @Override
    public boolean equals(Object obj) {

        if (this == obj) {
            return true;
        }

        if (this.id == null || obj == null || !(this.getClass().equals(obj.getClass()))) {
            return false;
        }

        AbstractDocument that = (AbstractDocument) obj;

        return this.id.equals(that.getId());
    }

    /*
     * (non-Javadoc)
     * @see java.lang.Object#hashCode()
     */
    @Override
    public int hashCode() {
        return id == null ? 0 : id.hashCode();
    }
}
