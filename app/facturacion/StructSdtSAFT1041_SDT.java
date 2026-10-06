package app.facturacion ;
import com.genexus.*;

@jakarta.xml.bind.annotation.XmlType(name = "SAFT1041_SDT", namespace ="TexplusNET")
public final  class StructSdtSAFT1041_SDT implements Cloneable, java.io.Serializable
{
   public StructSdtSAFT1041_SDT( )
   {
      this( -1, new ModelContext( StructSdtSAFT1041_SDT.class ));
   }

   public StructSdtSAFT1041_SDT( int remoteHandle ,
                                 ModelContext context )
   {
   }

   public  StructSdtSAFT1041_SDT( java.util.Vector<StructSdtSAFT1041_SDT_Item> value )
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
   public java.util.Vector<StructSdtSAFT1041_SDT_Item> getItem( )
   {
      return item;
   }

   public void setItem( java.util.Vector<StructSdtSAFT1041_SDT_Item> value )
   {
      item = value;
   }

   protected  java.util.Vector<StructSdtSAFT1041_SDT_Item> item = new java.util.Vector<>();
}

