// See https://aka.ms/new-console-template for more information

int[] arrr = new int[] { 1, 0, 2, 3, 0, 4, 5, 0 };

duplicateZeros(arrr);
void duplicateZeros(int[] arr)
{
    int[] arr2 = new int[arr.Length];

    for (int i = 0; i < arr.Length; i++)
    {
        if(arr[i] == 0)
        {
            arr2[i] = 0;
            if (i != arr2.Length - 1) arr2[i + 1] = 0;
            i++;
        }
        else arr2[i] = arr[i];
    }
    foreach (var item in arr2)
	{
        Console.WriteLine(item);
	} 
}
