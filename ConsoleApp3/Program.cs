// See https://aka.ms/new-console-template for more information

int[] arrr = new int[] { 1, 0, 2, 3, 0, 4, 5, 0 };

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
}
