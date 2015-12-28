package org.ecsoya.demos.coverage;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;

import org.eclipse.swt.SWT;
import org.eclipse.swt.layout.FillLayout;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Shell;
import org.junit.Test;

public class CardTest {

	@Test
	public void test() {
		Display display = Display.getCurrent();
		Shell shell = new Shell(display);
		shell.setLayout(new FillLayout());

		Card card = new Card(shell, SWT.NONE);
		String name = "Ecsoya";
		card.setName(name);

		assertEquals(name, card.getName());

		card.setName(null);

		assertEquals("", "");

		display.dispose();

		assertNull(card.getName());
	}

}
