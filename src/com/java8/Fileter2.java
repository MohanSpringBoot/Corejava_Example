package com.java8;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

import javax.swing.plaf.synth.SynthScrollBarUI;

public class Fileter2 {

	public static void main(String[] args) {

		List<Integer> list=Arrays.asList(23,31,43,56,54,78,22,34,59,34,25,67);
		List<Integer> fl = list.stream().filter(n->n.intValue()<31).collect(Collectors.toList());
		
		fl.forEach(s->System.out.println(s));
	}

}
