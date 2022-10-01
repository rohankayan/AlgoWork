class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
       Map<String, List<String>> anagramMap = new HashMap<>();
        
        for( String s : strs){
            
            char[] charArray = s.toCharArray();
            Arrays.sort(charArray);
            
            String temp = new String(charArray);
            List<String> list = anagramMap.getOrDefault(temp, new ArrayList<String>());
            list.add(s);
            anagramMap.put(temp,list);
        }
        List<List<String>> results = new ArrayList<>();
        
        for(List<String> value: anagramMap.values()){
            results.add(value);
        }
        return results;  
    }
}