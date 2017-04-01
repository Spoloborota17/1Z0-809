package com.spoloborota.ocp.lambdas.javarush;

public class Main {
	public static void main( String[] args ) {
	    Defaulable defaulable = DefaulableFactory.create( DefaultableImpl::new );
	    System.out.println( defaulable.notRequired() );
	                 
	    defaulable = DefaulableFactory.create( OverridableImpl::new );
	    System.out.println( defaulable.notRequired() );
	}
}
