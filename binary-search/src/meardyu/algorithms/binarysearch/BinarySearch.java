//package meardyu.algorithms.binarysearch;
//
//import java.util.Arrays;
//
//import edu.princeton.cs.algs4.In;
//import edu.princeton.cs.algs4.StdIn;
//import edu.princeton.cs.algs4.StdOut;
//
///**
// *
// * @author maerdyu
// *
// */
//public class BinarySearch {
//
//	// ��������������
//	public static int rank(int key, int[] a) {
//		int lo = 0;
//		int hi = a.length - 1;
//		while (hi > lo) {
//			int mid = lo + (hi - lo) / 2; // ?: difference (lo+hi)/2
//			if (a[mid] < key) // ? >=
//				lo = mid + 1; // W: +1
//			else if (a[mid] > key)
//				hi = mid - 1;
//			else
//				return mid;
//		}
//		return -1;
//	}
//
//	public static void main(String[] args) {
//		int[] whitelist = new In("tinyW.txt").readAllInts();
//		Arrays.sort(whitelist);
//		while (!StdIn.isEmpty()) {
//			int key = StdIn.readInt();
//			if (rank(key, whitelist) < 0)
//				StdOut.println(key);
//		}
//	}
//}
