
/* First created by JCasGen Sat Jul 25 21:50:44 CEST 2009 */
package org.apache.uima.lucas.indexer.types.test;

import org.apache.uima.jcas.JCas;
import org.apache.uima.jcas.JCasRegistry;
import org.apache.uima.cas.impl.CASImpl;
import org.apache.uima.cas.impl.FSGenerator;
import org.apache.uima.cas.FeatureStructure;
import org.apache.uima.cas.impl.TypeImpl;
import org.apache.uima.cas.Type;
import org.apache.uima.cas.impl.FeatureImpl;
import org.apache.uima.cas.Feature;
import org.apache.uima.jcas.cas.TOP_Type;

/** 
 * Updated by JCasGen Sat Jul 25 21:50:44 CEST 2009
 * @generated */
public class FeatureStructure2_Type extends TOP_Type {
  /** @generated */
  protected FSGenerator getFSGenerator() {return fsGenerator;}
  /** @generated */
  private final FSGenerator fsGenerator = 
    new FSGenerator() {
      public FeatureStructure createFS(int addr, CASImpl cas) {
  			 if (FeatureStructure2_Type.this.useExistingInstance) {
  			   // Return eq fs instance if already created
  		     FeatureStructure fs = FeatureStructure2_Type.this.jcas.getJfsFromCaddr(addr);
  		     if (null == fs) {
  		       fs = new FeatureStructure2(addr, FeatureStructure2_Type.this);
  			   FeatureStructure2_Type.this.jcas.putJfsFromCaddr(addr, fs);
  			   return fs;
  		     }
  		     return fs;
        } else return new FeatureStructure2(addr, FeatureStructure2_Type.this);
  	  }
    };
  /** @generated */
  public final static int typeIndexID = FeatureStructure2.typeIndexID;
  /** @generated 
     @modifiable */
  public final static boolean featOkTst = JCasRegistry.getFeatOkTst("org.apache.uima.lucas.indexer.types.test.FeatureStructure2");
 
  /** @generated */
  final Feature casFeat_feature1;
  /** @generated */
  final int     casFeatCode_feature1;
  /** @generated */ 
  public String getFeature1(int addr) {
        if (featOkTst && casFeat_feature1 == null)
      jcas.throwFeatMissing("feature1", "org.apache.uima.lucas.indexer.types.test.FeatureStructure2");
    return ll_cas.ll_getStringValue(addr, casFeatCode_feature1);
  }
  /** @generated */    
  public void setFeature1(int addr, String v) {
        if (featOkTst && casFeat_feature1 == null)
      jcas.throwFeatMissing("feature1", "org.apache.uima.lucas.indexer.types.test.FeatureStructure2");
    ll_cas.ll_setStringValue(addr, casFeatCode_feature1, v);}
    
  
 
  /** @generated */
  final Feature casFeat_feature2;
  /** @generated */
  final int     casFeatCode_feature2;
  /** @generated */ 
  public String getFeature2(int addr) {
        if (featOkTst && casFeat_feature2 == null)
      jcas.throwFeatMissing("feature2", "org.apache.uima.lucas.indexer.types.test.FeatureStructure2");
    return ll_cas.ll_getStringValue(addr, casFeatCode_feature2);
  }
  /** @generated */    
  public void setFeature2(int addr, String v) {
        if (featOkTst && casFeat_feature2 == null)
      jcas.throwFeatMissing("feature2", "org.apache.uima.lucas.indexer.types.test.FeatureStructure2");
    ll_cas.ll_setStringValue(addr, casFeatCode_feature2, v);}
    
  
 
  /** @generated */
  final Feature casFeat_feature3;
  /** @generated */
  final int     casFeatCode_feature3;
  /** @generated */ 
  public int getFeature3(int addr) {
        if (featOkTst && casFeat_feature3 == null)
      jcas.throwFeatMissing("feature3", "org.apache.uima.lucas.indexer.types.test.FeatureStructure2");
    return ll_cas.ll_getRefValue(addr, casFeatCode_feature3);
  }
  /** @generated */    
  public void setFeature3(int addr, int v) {
        if (featOkTst && casFeat_feature3 == null)
      jcas.throwFeatMissing("feature3", "org.apache.uima.lucas.indexer.types.test.FeatureStructure2");
    ll_cas.ll_setRefValue(addr, casFeatCode_feature3, v);}
    
   /** @generated */
  public String getFeature3(int addr, int i) {
        if (featOkTst && casFeat_feature3 == null)
      jcas.throwFeatMissing("feature3", "org.apache.uima.lucas.indexer.types.test.FeatureStructure2");
    if (lowLevelTypeChecks)
      return ll_cas.ll_getStringArrayValue(ll_cas.ll_getRefValue(addr, casFeatCode_feature3), i, true);
    jcas.checkArrayBounds(ll_cas.ll_getRefValue(addr, casFeatCode_feature3), i);
	return ll_cas.ll_getStringArrayValue(ll_cas.ll_getRefValue(addr, casFeatCode_feature3), i);
  }
   
  /** @generated */ 
  public void setFeature3(int addr, int i, String v) {
        if (featOkTst && casFeat_feature3 == null)
      jcas.throwFeatMissing("feature3", "org.apache.uima.lucas.indexer.types.test.FeatureStructure2");
    if (lowLevelTypeChecks)
      ll_cas.ll_setStringArrayValue(ll_cas.ll_getRefValue(addr, casFeatCode_feature3), i, v, true);
    jcas.checkArrayBounds(ll_cas.ll_getRefValue(addr, casFeatCode_feature3), i);
    ll_cas.ll_setStringArrayValue(ll_cas.ll_getRefValue(addr, casFeatCode_feature3), i, v);
  }
 



  /** initialize variables to correspond with Cas Type and Features
	* @generated */
  public FeatureStructure2_Type(JCas jcas, Type casType) {
    super(jcas, casType);
    casImpl.getFSClassRegistry().addGeneratorForType((TypeImpl)this.casType, getFSGenerator());

 
    casFeat_feature1 = jcas.getRequiredFeatureDE(casType, "feature1", "uima.cas.String", featOkTst);
    casFeatCode_feature1  = (null == casFeat_feature1) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_feature1).getCode();

 
    casFeat_feature2 = jcas.getRequiredFeatureDE(casType, "feature2", "uima.cas.String", featOkTst);
    casFeatCode_feature2  = (null == casFeat_feature2) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_feature2).getCode();

 
    casFeat_feature3 = jcas.getRequiredFeatureDE(casType, "feature3", "uima.cas.StringArray", featOkTst);
    casFeatCode_feature3  = (null == casFeat_feature3) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_feature3).getCode();

  }
}



    