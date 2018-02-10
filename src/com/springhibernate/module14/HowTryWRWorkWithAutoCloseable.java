package com.springhibernate.module14;

public class HowTryWRWorkWithAutoCloseable {
	//AutoCloseable is an Interface which provides a method close which is a replica of finally block
	
	//Inner static class implementing AutoCloseable interface and its method Close
	static class MyResource implements AutoCloseable{

		@Override
		public void close() throws Exception {
			System.out.println("Closing My Resource Object, Doing Finally Block Job here in Autocloseable close method");
		}
		
	}

	private static void tryWithoutResourceException() throws Exception {
		try(MyResource resource = new MyResource();){
			System.out.println("Object created in try with resources block, no finally block required to close objects");
			throw new Exception("Exception in try with resources block");
		}
	}

	private static void tryWithResourceException() throws Exception{
		MyResource resource = null;
		try{
			resource = new MyResource();
			System.out.println("Object created in try without resource block");
			throw new Exception("Exception in try without resources block");
		}finally{//if finally Block not provided will return compile error stating finally block is needed to complete try block
			if(resource!=null){
				resource.close();
			}
		}
	}
	
	public static void main(String[] args) {
	try{
		tryWithResourceException();
	}catch(Exception e){
		e.printStackTrace();
	}
	
	try{
		tryWithoutResourceException();
	}catch(Exception e){
		e.printStackTrace();
	}
		
	}

}
