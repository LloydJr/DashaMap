package com.github.zipcodewilmington;



/**
 * @author xtofer
 * @version 1.0.0
 * @date 10/21/19 9:05 AM
 */
public class DashaMap {

    private String alphabet = "abcdefghijklmnopqrstuvwxyz";
    Node[] map = new Node[26];

        public DashaMap(){
            for (int i = 0; i < alphabet.length(); i++) {
                map[i] = new Node();
                map[i].setKey(String.valueOf(alphabet.charAt(i)));
            }
        }

    public Node[] getMap() {
        return map;
    }
}
