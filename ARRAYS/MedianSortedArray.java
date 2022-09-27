public class Solution{
public double findMedianSortedArrays(int[] nums1, int[] nums2) {
int i,j,k;
double x;
i=0;
j=0;
k=0;

int arr[]=new int[2000];
while(i<nums1.length && j<nums2.length)
{
    if(nums1[i]<nums2[j])
    {
        arr[k++]=nums1[i++];
    }
    else
    {
        arr[k++]=nums2[j++];
    }
}
if(i<nums1.length)
{
    while(i<nums1.length)
    {
        arr[k++]=nums1[i++];
    }
}
else
{
    while(j<nums2.length)
    {
        arr[k++]=nums2[j++];
    }
}
k--;
if(k%2==0)
{
   x=arr[k/2];
}
else
{
    x=(arr[(k-1)/2]+arr[(k+1)/2])/2.0;
}
return x;
}
}
