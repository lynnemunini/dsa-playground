class Solution {
    public String[] uncommonFromSentences(String s1, String s2) {
        List<String> list = new ArrayList<>();
        var s1List = new ArrayList<>(Arrays.asList(s1.split(" ")));
        var s2List = new ArrayList<>(Arrays.asList(s2.split(" ")));
        for (String s: s1List) {
            var temp = new ArrayList<>(s1List);
            temp.set(temp.indexOf(s), "");
            if (!s2List.contains(s) && !temp.contains(s)) list.add(s);
        }

        for (String s: s2List) {
            var temp = new ArrayList<>(s2List);
            temp.set(temp.indexOf(s), "");
            if (!s1List.contains(s) && !temp.contains(s)) list.add(s);
        }

        return list.toArray(new String[0]);
    }
}