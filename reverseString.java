// Reverse the character array with the same data structure
class Solution {
    public void reverseString(char[] s) {
        int n=s.length;
        char temp;
        for(int i=0;i<s.length/2;i++){
            temp=s[i];
            int j=n-i-1;
            s[i] =s[j];
            s[j]=temp;
        }
    
    }
}
