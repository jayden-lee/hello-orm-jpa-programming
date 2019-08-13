package com.jayden.tutorial.domain.common;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

import javax.persistence.Column;
import javax.persistence.Embeddable;

import java.util.Objects;

import static com.google.common.base.Preconditions.checkArgument;
import static java.util.regex.Pattern.matches;
import static org.apache.commons.lang3.StringUtils.isNotEmpty;

@Embeddable
public class Email {

    @Column(name = "EMAIL")
    private String address;

    protected Email() {

    }

    public Email(String address) {
        checkArgument(isNotEmpty(address), "address must be provided");
        checkArgument(checkAddress(address), "Invalid email address: " + address);
        this.address = address;
    }

    /**
     * 정규식으로 이메일 형식 체크
     *
     * @param address String 이메일 주소
     * @return boolean
     */
    private boolean checkAddress(String address) {
        return matches("[\\w~\\-.+]+@[\\w~\\-]+(\\.[\\w~\\-]+)+", address);
    }

    /**
     * 로컬 파트 반환
     *
     * @return String
     */
    public String getName() {
        String[] tokens = address.split("@");
        if (tokens.length == 2) {
            return tokens[0];
        }

        return null;
    }

    /**
     * 도메인 이름 반환
     *
     * @return String
     */
    public String getDomain() {
        String[] tokens = address.split("@");
        if (tokens.length == 2) {
            return tokens[1];
        }

        return null;
    }

    /**
     * 이메일 반환
     *
     * @return String
     */
    public String getAddress() {
        return address;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Email email = (Email) o;
        return Objects.equals(address, email.address);
    }

    @Override
    public int hashCode() {
        return Objects.hash(address);
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this, ToStringStyle.SHORT_PREFIX_STYLE)
                .append("address", address)
                .toString();
    }

}
