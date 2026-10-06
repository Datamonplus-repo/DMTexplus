package app ;
import com.genexus.*;

@jakarta.xml.bind.annotation.XmlType(name = "ColFilterMtoFormulasTinteWW", namespace ="TexplusNET")
public final  class StructSdtColFilterMtoFormulasTinteWW implements Cloneable, java.io.Serializable
{
   public StructSdtColFilterMtoFormulasTinteWW( )
   {
      this( -1, new ModelContext( StructSdtColFilterMtoFormulasTinteWW.class ));
   }

   public StructSdtColFilterMtoFormulasTinteWW( int remoteHandle ,
                                                ModelContext context )
   {
   }

   public  StructSdtColFilterMtoFormulasTinteWW( java.util.Vector<StructSdtFilterMtoFormulasTinteWW> value )
   {
      item = value;
   }

   public Object clone()
   {
      Object cloned = null;
      try
      {
         cloned = super.clone();
      }catch (CloneNotSupportedException e){ ; }
      return cloned;
   }

   @jakarta.xml.bind.annotation.XmlElement(name="FilterMtoFormulasTinteWW",namespace="TexplusNET")
   public java.util.Vector<StructSdtFilterMtoFormulasTinteWW> getItem( )
   {
      return item;
   }

   public void setItem( java.util.Vector<StructSdtFilterMtoFormulasTinteWW> value )
   {
      item = value;
   }

   protected  java.util.Vector<StructSdtFilterMtoFormulasTinteWW> item = new java.util.Vector<>();
}

