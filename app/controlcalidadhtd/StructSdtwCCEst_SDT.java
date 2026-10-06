package app.controlcalidadhtd ;
import com.genexus.*;

@jakarta.xml.bind.annotation.XmlType(name = "wCCEst_SDT", namespace ="TexplusNET")
public final  class StructSdtwCCEst_SDT implements Cloneable, java.io.Serializable
{
   public StructSdtwCCEst_SDT( )
   {
      this( -1, new ModelContext( StructSdtwCCEst_SDT.class ));
   }

   public StructSdtwCCEst_SDT( int remoteHandle ,
                               ModelContext context )
   {
   }

   public  StructSdtwCCEst_SDT( java.util.Vector<StructSdtwCCEst_SDT_Item> value )
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

   @jakarta.xml.bind.annotation.XmlElement(name="Item",namespace="TexplusNET")
   public java.util.Vector<StructSdtwCCEst_SDT_Item> getItem( )
   {
      return item;
   }

   public void setItem( java.util.Vector<StructSdtwCCEst_SDT_Item> value )
   {
      item = value;
   }

   protected  java.util.Vector<StructSdtwCCEst_SDT_Item> item = new java.util.Vector<>();
}

