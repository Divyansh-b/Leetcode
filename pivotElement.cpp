#include <iostream>
using namespace std;
int getPivot(int arr[], int size)
{

  int s = 0;
  int e = size - 1;
  int mid = s + (e - s) / 2;

  while (s < e)
  {
    if (arr[mid] >= arr[0])
    {
      s = mid + 1;
    }
    else
    {
      e = mid;
    }
    mid = s + (e - s) / 2;
  }
  return s;
}
int main()
{
  int arr[100];

  int size;
  cin >> size;
  for (int i = 0; i < size; i++)
  {
    cin >> arr[i];
  }
  cout << getPivot(arr, size);
}
