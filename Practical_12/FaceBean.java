package Practical_12;

import java.beans.*;

public class FaceBean implements java.io.Serializable {
    private int mMouthWidth = 90;

    private PropertyChangeSupport mPcs = new PropertyChangeSupport(this);
    private VetoableChangeSupport mVcs = new VetoableChangeSupport(this);

    public int getMouthWidth() {
        return mMouthWidth;
    }
    
    public void setMouthWidth(int mw) throws PropertyVetoException {
        int oldMouthWidth = mMouthWidth;
        mMouthWidth = mw;
        mPcs.firePropertyChange("mouthWidth", oldMouthWidth, mw);
        mVcs.fireVetoableChange("mouthWidth", oldMouthWidth, mw);
    }

    public void addPropertyChangeListener(PropertyChangeListener listener) {
        mPcs.addPropertyChangeListener(listener);
    }
    
    public void removePropertyChangeListener(PropertyChangeListener listener) {
        mPcs.removePropertyChangeListener(listener);
    }

    public void addVetoableChangeListener(VetoableChangeListener listener) {
        mVcs.addVetoableChangeListener(listener);
    }

    public void removeVetoableChangeListener(VetoableChangeListener listener) {
        mVcs.removeVetoableChangeListener(listener);
    }
}