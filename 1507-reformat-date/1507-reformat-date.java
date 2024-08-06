class Solution {
       public String reformatDate(String date) {
        String[] dateArray = date.split(" ");
        StringBuilder convertedDate = new StringBuilder();
        StringBuilder day = new StringBuilder();
        Map<String, String> monthMap = new HashMap<>();
        monthMap.put("Jan", "01");
        monthMap.put("Feb", "02");
        monthMap.put("Mar", "03");
        monthMap.put("Apr", "04");
        monthMap.put("May", "05");
        monthMap.put("Jun", "06");
        monthMap.put("Jul", "07");
        monthMap.put("Aug", "08");
        monthMap.put("Sep", "09");
        monthMap.put("Oct", "10");
        monthMap.put("Nov", "11");
        monthMap.put("Dec", "12");

        for (char c : dateArray[0].toCharArray()) {
            if (Character.isDigit(c)) {
                day.append(c);
            }
        }
        if (day.toString().length() == 1) {
            day.insert(0, "0");
        }

        convertedDate.append(dateArray[2]);
        convertedDate.append("-");
        convertedDate.append(monthMap.get(dateArray[1]));
        convertedDate.append("-");
        convertedDate.append(day);
        return convertedDate.toString();
    }
}