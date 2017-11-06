package com.maolian.entity;

import java.math.BigDecimal;
import java.util.Date;

public class HsrBlock {
    private String hash;

    private Long confirmations;

    private Long size;

    private Long height;

    private Long version;

    private String merkleroot;

    private BigDecimal mint;

    private Date time;

    private Long nonce;

    private String bits;

    private BigDecimal difficulty;

    private String blocktrust;

    private String chaintrust;

    private String previousblockhash;

    private String nextblockhash;

    private String flags;

    private String proofhash;

    private Long entropybit;

    private String modifier;

    private String modifierv2;

    private String signature;

    public String getHash() {
        return hash;
    }

    public void setHash(String hash) {
        this.hash = hash == null ? null : hash.trim();
    }

    public Long getConfirmations() {
        return confirmations;
    }

    public void setConfirmations(Long confirmations) {
        this.confirmations = confirmations;
    }

    public Long getSize() {
        return size;
    }

    public void setSize(Long size) {
        this.size = size;
    }

    public Long getHeight() {
        return height;
    }

    public void setHeight(Long height) {
        this.height = height;
    }

    public Long getVersion() {
        return version;
    }

    public void setVersion(Long version) {
        this.version = version;
    }

    public String getMerkleroot() {
        return merkleroot;
    }

    public void setMerkleroot(String merkleroot) {
        this.merkleroot = merkleroot == null ? null : merkleroot.trim();
    }

    public BigDecimal getMint() {
        return mint;
    }

    public void setMint(BigDecimal mint) {
        this.mint = mint;
    }

    public Date getTime() {
        return time;
    }

    public void setTime(Date time) {
        this.time = time;
    }

    public Long getNonce() {
        return nonce;
    }

    public void setNonce(Long nonce) {
        this.nonce = nonce;
    }

    public String getBits() {
        return bits;
    }

    public void setBits(String bits) {
        this.bits = bits == null ? null : bits.trim();
    }

    public BigDecimal getDifficulty() {
        return difficulty;
    }

    public void setDifficulty(BigDecimal difficulty) {
        this.difficulty = difficulty;
    }

    public String getBlocktrust() {
        return blocktrust;
    }

    public void setBlocktrust(String blocktrust) {
        this.blocktrust = blocktrust == null ? null : blocktrust.trim();
    }

    public String getChaintrust() {
        return chaintrust;
    }

    public void setChaintrust(String chaintrust) {
        this.chaintrust = chaintrust == null ? null : chaintrust.trim();
    }

    public String getPreviousblockhash() {
        return previousblockhash;
    }

    public void setPreviousblockhash(String previousblockhash) {
        this.previousblockhash = previousblockhash == null ? null : previousblockhash.trim();
    }

    public String getNextblockhash() {
        return nextblockhash;
    }

    public void setNextblockhash(String nextblockhash) {
        this.nextblockhash = nextblockhash == null ? null : nextblockhash.trim();
    }

    public String getFlags() {
        return flags;
    }

    public void setFlags(String flags) {
        this.flags = flags == null ? null : flags.trim();
    }

    public String getProofhash() {
        return proofhash;
    }

    public void setProofhash(String proofhash) {
        this.proofhash = proofhash == null ? null : proofhash.trim();
    }

    public Long getEntropybit() {
        return entropybit;
    }

    public void setEntropybit(Long entropybit) {
        this.entropybit = entropybit;
    }

    public String getModifier() {
        return modifier;
    }

    public void setModifier(String modifier) {
        this.modifier = modifier == null ? null : modifier.trim();
    }

    public String getModifierv2() {
        return modifierv2;
    }

    public void setModifierv2(String modifierv2) {
        this.modifierv2 = modifierv2 == null ? null : modifierv2.trim();
    }

    public String getSignature() {
        return signature;
    }

    public void setSignature(String signature) {
        this.signature = signature == null ? null : signature.trim();
    }
}