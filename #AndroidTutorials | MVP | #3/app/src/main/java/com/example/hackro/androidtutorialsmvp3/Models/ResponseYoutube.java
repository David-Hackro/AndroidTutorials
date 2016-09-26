
package com.example.hackro.androidtutorialsmvp3.Models;

import java.util.ArrayList;
import java.util.List;


public class ResponseYoutube {

    private String kind;
    private String etag;
    private String nextPageToken;
    private String regionCode;
    private PageInfo pageInfo;
    private List<Item> items = new ArrayList<Item>();

    /**
     * No args constructor for use in serialization
     * 
     */
    public ResponseYoutube() {
    }

    /**
     * 
     * @param regionCode
     * @param etag
     * @param items
     * @param pageInfo
     * @param nextPageToken
     * @param kind
     */
    public ResponseYoutube(String kind, String etag, String nextPageToken, String regionCode, PageInfo pageInfo, List<Item> items) {
        this.kind = kind;
        this.etag = etag;
        this.nextPageToken = nextPageToken;
        this.regionCode = regionCode;
        this.pageInfo = pageInfo;
        this.items = items;
    }

    /**
     * 
     * @return
     *     The kind
     */
    public String getKind() {
        return kind;
    }

    /**
     * 
     * @param kind
     *     The kind
     */
    public void setKind(String kind) {
        this.kind = kind;
    }

    /**
     * 
     * @return
     *     The etag
     */
    public String getEtag() {
        return etag;
    }

    /**
     * 
     * @param etag
     *     The etag
     */
    public void setEtag(String etag) {
        this.etag = etag;
    }

    /**
     * 
     * @return
     *     The nextPageToken
     */
    public String getNextPageToken() {
        return nextPageToken;
    }

    /**
     * 
     * @param nextPageToken
     *     The nextPageToken
     */
    public void setNextPageToken(String nextPageToken) {
        this.nextPageToken = nextPageToken;
    }

    /**
     * 
     * @return
     *     The regionCode
     */
    public String getRegionCode() {
        return regionCode;
    }

    /**
     * 
     * @param regionCode
     *     The regionCode
     */
    public void setRegionCode(String regionCode) {
        this.regionCode = regionCode;
    }

    /**
     * 
     * @return
     *     The pageInfo
     */
    public PageInfo getPageInfo() {
        return pageInfo;
    }

    /**
     * 
     * @param pageInfo
     *     The pageInfo
     */
    public void setPageInfo(PageInfo pageInfo) {
        this.pageInfo = pageInfo;
    }

    /**
     * 
     * @return
     *     The items
     */
    public List<Item> getItems() {
        return items;
    }

    /**
     * 
     * @param items
     *     The items
     */
    public void setItems(List<Item> items) {
        this.items = items;
    }

}
