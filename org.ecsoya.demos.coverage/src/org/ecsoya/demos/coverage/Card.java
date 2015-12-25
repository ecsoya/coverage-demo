package org.ecsoya.demos.coverage;

import org.eclipse.swt.SWT;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Text;

public class Card extends Composite {

	private Text nameText;

	public Card(Composite parent, int style) {
		super(parent, style);

		setLayout(new GridLayout(2, false));
		
		Label label = new Label(this, SWT.NONE);
		label.setText("Name:");
		
		nameText = new Text(this, SWT.BORDER);
		nameText.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true, false));
		
	}

	public String getName() {
		if (nameText.isDisposed()){
			return null;
		}
		return nameText.getText();
	}

	public void setName(String name) {
		nameText.setText(name == null?"":name);
	}

}
