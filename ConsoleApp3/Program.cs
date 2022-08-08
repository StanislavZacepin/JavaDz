// See https://aka.ms/new-console-template for more information

/*int[] arrr = new int[] { 1, 0, 2, 3, 0, 4, 5, 0 };

duplicateZeros(arrr);
void duplicateZeros(int[] arr)
{
    int[] arr2 = new int[arr.Length];
    List<int> arr3 = new List<int>();
    for (int i = 0; i < arr.Length; i++)
    {
        if(arr[i] == 0)
        {
            arr3.Add(0);
            arr3.Add(0);
        }
        else arr3.Add(arr[i]);
    }
     for (int i = 0; i < arr.Length; i++)
    {
        arr2[i] = arr3[i];
    }
    foreach (var item in arr2)
	{
        Console.WriteLine(item);
	} 
}*/

/*int[] nums = [3, 2, 2, 3], val = 3;
int val = 2;

int k = removeElement(nums, val);
public int removeElement(int[] nums, int val)
{
    int k = 0;
    List<int> arr3 = new List<int>();
    for (int i = 0; i < nums.Length; i++)
    {
        if (nums[i] != val)
        {
            arr3.Add(nums[i]);
            k++;
        }
    }
    for (int i = 0; i < nums.Length; i++)
    {
        if (i < k)
            nums[i] = arr3[i];
        else nums[i] = 0;
    }
    foreach (var item in nums)
    {
        Console.WriteLine(item);
    }
    Console.WriteLine("         ___" + k);
    return k;
}*/

using System.Text.RegularExpressions;

string s = "the sky is blue";
string ss = "  hello world  ";
string sss = "a good   example";
string s4 = "  Bob    Loves  Alice   ";

s = reverseWords(s);
ss = reverseWords(ss);
sss = reverseWords(sss);
s4 = reverseWords(s4);
s = reverseWords(s);

public string reverseWords(string s)
{
    s = Regex.Replace(s, @"\s+", " ");
    s = Regex.Replace(s, @"^\s+", String.Empty);
    s = Regex.Replace(s, @"\s+$", String.Empty);


    return s;
}