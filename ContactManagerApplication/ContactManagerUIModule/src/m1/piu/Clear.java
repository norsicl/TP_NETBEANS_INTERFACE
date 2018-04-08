/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package m1.piu;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import org.openide.*;
import org.openide.awt.ActionID;
import org.openide.awt.ActionReference;
import org.openide.awt.ActionRegistration;
import org.openide.util.NbBundle.Messages;

@ActionID(
        category = "File",
        id = "m1.piu.Clear"
)
@ActionRegistration(
        iconBase = "m1/piu/trash.png",
        displayName = "#CTL_Clear"
)
@ActionReference(path = "Menu/File", position = 1400)
@Messages("CTL_Clear=Clear")
public final class Clear implements ActionListener {

    @Override
    public void actionPerformed(ActionEvent e) {

        if(NotifyDescriptor.YES_OPTION == DialogDisplayer.getDefault().notify(new NotifyDescriptor.Confirmation("Etes vous sur de vouloir réaliser l'action clear ?"))){
            DialogDisplayer.getDefault().notify(new NotifyDescriptor.Message("Tous est supprimé.", NotifyDescriptor.WARNING_MESSAGE));
        }
        // TODO implement action body
    }
}
