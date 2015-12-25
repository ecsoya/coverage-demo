package org.ecsoya.demos.coverage;

import static org.junit.Assert.*;

import org.eclipse.swt.SWT;
import org.eclipse.swt.layout.FillLayout;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Shell;
import org.junit.Test;

public class CardTest {

	@Test
	public void test() {
		Display display = new Display();
		Shell shell = new Shell(display);
		shell.setLayout(new FillLayout());

		Card card = new Card(shell, SWT.NONE);
		String name = "Ecsoya";
		card.setName(name);

		try {
			assertEquals(name, card.getName());
		} catch (Exception e) {
			fail(e.getMessage());
		} finally {
			display.dispose();
		}

	}

}
