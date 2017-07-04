package testebeanio.teste;

import java.io.File;

import org.beanio.BeanReader;
import org.beanio.StreamFactory;

import testebeanio.modelo.Funcionario;

public class BeanReaderExample {

	public static void main(String[] args) throws Exception {
		// create a StreamFactory
		StreamFactory factory = StreamFactory.newInstance();
		// load the mapping file
		factory.load("mapping.xml");

		// use a StreamFactory to create a BeanReader
		BeanReader in = factory.createReader("exemplo", new File("exemplo.csv"));
		Funcionario f;
		while ((f = (Funcionario) in.read()) != null) {
			System.out.println(f);
		}
		in.close();
	}

}
