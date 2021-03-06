/*
 * This file is generated by jOOQ.
*/
package com.htl.domain.tables.pojos;


import com.htl.domain.tables.interfaces.ILctTent;

import java.time.LocalDateTime;

import javax.annotation.Generated;


/**
 * This class is generated by jOOQ.
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.10.7"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class LctTent implements ILctTent {

    private static final long serialVersionUID = 408052801;

    private String        pkId;
    private String        sName;
    private String        sCode;
    private String        sContact;
    private String        sManager;
    private String        jConfig;
    private Integer       iOrder;
    private String        rLocationId;
    private String        rYardId;
    private Boolean       isActive;
    private String        zSigma;
    private String        zLanguage;
    private String        zCreateBy;
    private LocalDateTime zCreateTime;
    private String        zUpdateBy;
    private LocalDateTime zUpdateTime;

    public LctTent() {}

    public LctTent(LctTent value) {
        this.pkId = value.pkId;
        this.sName = value.sName;
        this.sCode = value.sCode;
        this.sContact = value.sContact;
        this.sManager = value.sManager;
        this.jConfig = value.jConfig;
        this.iOrder = value.iOrder;
        this.rLocationId = value.rLocationId;
        this.rYardId = value.rYardId;
        this.isActive = value.isActive;
        this.zSigma = value.zSigma;
        this.zLanguage = value.zLanguage;
        this.zCreateBy = value.zCreateBy;
        this.zCreateTime = value.zCreateTime;
        this.zUpdateBy = value.zUpdateBy;
        this.zUpdateTime = value.zUpdateTime;
    }

    public LctTent(
        String        pkId,
        String        sName,
        String        sCode,
        String        sContact,
        String        sManager,
        String        jConfig,
        Integer       iOrder,
        String        rLocationId,
        String        rYardId,
        Boolean       isActive,
        String        zSigma,
        String        zLanguage,
        String        zCreateBy,
        LocalDateTime zCreateTime,
        String        zUpdateBy,
        LocalDateTime zUpdateTime
    ) {
        this.pkId = pkId;
        this.sName = sName;
        this.sCode = sCode;
        this.sContact = sContact;
        this.sManager = sManager;
        this.jConfig = jConfig;
        this.iOrder = iOrder;
        this.rLocationId = rLocationId;
        this.rYardId = rYardId;
        this.isActive = isActive;
        this.zSigma = zSigma;
        this.zLanguage = zLanguage;
        this.zCreateBy = zCreateBy;
        this.zCreateTime = zCreateTime;
        this.zUpdateBy = zUpdateBy;
        this.zUpdateTime = zUpdateTime;
    }

    @Override
    public String getPkId() {
        return this.pkId;
    }

    @Override
    public LctTent setPkId(String pkId) {
        this.pkId = pkId;
        return this;
    }

    @Override
    public String getSName() {
        return this.sName;
    }

    @Override
    public LctTent setSName(String sName) {
        this.sName = sName;
        return this;
    }

    @Override
    public String getSCode() {
        return this.sCode;
    }

    @Override
    public LctTent setSCode(String sCode) {
        this.sCode = sCode;
        return this;
    }

    @Override
    public String getSContact() {
        return this.sContact;
    }

    @Override
    public LctTent setSContact(String sContact) {
        this.sContact = sContact;
        return this;
    }

    @Override
    public String getSManager() {
        return this.sManager;
    }

    @Override
    public LctTent setSManager(String sManager) {
        this.sManager = sManager;
        return this;
    }

    @Override
    public String getJConfig() {
        return this.jConfig;
    }

    @Override
    public LctTent setJConfig(String jConfig) {
        this.jConfig = jConfig;
        return this;
    }

    @Override
    public Integer getIOrder() {
        return this.iOrder;
    }

    @Override
    public LctTent setIOrder(Integer iOrder) {
        this.iOrder = iOrder;
        return this;
    }

    @Override
    public String getRLocationId() {
        return this.rLocationId;
    }

    @Override
    public LctTent setRLocationId(String rLocationId) {
        this.rLocationId = rLocationId;
        return this;
    }

    @Override
    public String getRYardId() {
        return this.rYardId;
    }

    @Override
    public LctTent setRYardId(String rYardId) {
        this.rYardId = rYardId;
        return this;
    }

    @Override
    public Boolean getIsActive() {
        return this.isActive;
    }

    @Override
    public LctTent setIsActive(Boolean isActive) {
        this.isActive = isActive;
        return this;
    }

    @Override
    public String getZSigma() {
        return this.zSigma;
    }

    @Override
    public LctTent setZSigma(String zSigma) {
        this.zSigma = zSigma;
        return this;
    }

    @Override
    public String getZLanguage() {
        return this.zLanguage;
    }

    @Override
    public LctTent setZLanguage(String zLanguage) {
        this.zLanguage = zLanguage;
        return this;
    }

    @Override
    public String getZCreateBy() {
        return this.zCreateBy;
    }

    @Override
    public LctTent setZCreateBy(String zCreateBy) {
        this.zCreateBy = zCreateBy;
        return this;
    }

    @Override
    public LocalDateTime getZCreateTime() {
        return this.zCreateTime;
    }

    @Override
    public LctTent setZCreateTime(LocalDateTime zCreateTime) {
        this.zCreateTime = zCreateTime;
        return this;
    }

    @Override
    public String getZUpdateBy() {
        return this.zUpdateBy;
    }

    @Override
    public LctTent setZUpdateBy(String zUpdateBy) {
        this.zUpdateBy = zUpdateBy;
        return this;
    }

    @Override
    public LocalDateTime getZUpdateTime() {
        return this.zUpdateTime;
    }

    @Override
    public LctTent setZUpdateTime(LocalDateTime zUpdateTime) {
        this.zUpdateTime = zUpdateTime;
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("LctTent (");

        sb.append(pkId);
        sb.append(", ").append(sName);
        sb.append(", ").append(sCode);
        sb.append(", ").append(sContact);
        sb.append(", ").append(sManager);
        sb.append(", ").append(jConfig);
        sb.append(", ").append(iOrder);
        sb.append(", ").append(rLocationId);
        sb.append(", ").append(rYardId);
        sb.append(", ").append(isActive);
        sb.append(", ").append(zSigma);
        sb.append(", ").append(zLanguage);
        sb.append(", ").append(zCreateBy);
        sb.append(", ").append(zCreateTime);
        sb.append(", ").append(zUpdateBy);
        sb.append(", ").append(zUpdateTime);

        sb.append(")");
        return sb.toString();
    }

    // -------------------------------------------------------------------------
    // FROM and INTO
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public void from(ILctTent from) {
        setPkId(from.getPkId());
        setSName(from.getSName());
        setSCode(from.getSCode());
        setSContact(from.getSContact());
        setSManager(from.getSManager());
        setJConfig(from.getJConfig());
        setIOrder(from.getIOrder());
        setRLocationId(from.getRLocationId());
        setRYardId(from.getRYardId());
        setIsActive(from.getIsActive());
        setZSigma(from.getZSigma());
        setZLanguage(from.getZLanguage());
        setZCreateBy(from.getZCreateBy());
        setZCreateTime(from.getZCreateTime());
        setZUpdateBy(from.getZUpdateBy());
        setZUpdateTime(from.getZUpdateTime());
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public <E extends ILctTent> E into(E into) {
        into.from(this);
        return into;
    }

    public LctTent(io.vertx.core.json.JsonObject json) {
        fromJson(json);
    }
}
