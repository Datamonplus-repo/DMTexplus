package app ;
import com.genexus.*;

@jakarta.xml.bind.annotation.XmlType(name = "ColSdtPCO0005", namespace ="TexplusNET")
public final  class StructSdtColSdtPCO0005 implements Cloneable, java.io.Serializable
{
   public StructSdtColSdtPCO0005( )
   {
      this( -1, new ModelContext( StructSdtColSdtPCO0005.class ));
   }

   public StructSdtColSdtPCO0005( int remoteHandle ,
                                  ModelContext context )
   {
   }

   public  StructSdtColSdtPCO0005( java.util.Vector<StructSdtSdtPCO0005> value )
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

   @jakarta.xml.bind.annotation.XmlElement(name="SdtPCO0005",namespace="TexplusNET")
   public java.util.Vector<StructSdtSdtPCO0005> getItem( )
   {
      return item;
   }

   public void setItem( java.util.Vector<StructSdtSdtPCO0005> value )
   {
      item = value;
   }

   protected  java.util.Vector<StructSdtSdtPCO0005> item = new java.util.Vector<>();
}

