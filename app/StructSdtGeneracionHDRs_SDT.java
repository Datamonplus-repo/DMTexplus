package app ;
import com.genexus.*;

@jakarta.xml.bind.annotation.XmlType(name = "GeneracionHDRs_SDT", namespace ="TexplusNET")
public final  class StructSdtGeneracionHDRs_SDT implements Cloneable, java.io.Serializable
{
   public StructSdtGeneracionHDRs_SDT( )
   {
      this( -1, new ModelContext( StructSdtGeneracionHDRs_SDT.class ));
   }

   public StructSdtGeneracionHDRs_SDT( int remoteHandle ,
                                       ModelContext context )
   {
   }

   public  StructSdtGeneracionHDRs_SDT( java.util.Vector<StructSdtGeneracionHDRs_SDT_Item> value )
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
   public java.util.Vector<StructSdtGeneracionHDRs_SDT_Item> getItem( )
   {
      return item;
   }

   public void setItem( java.util.Vector<StructSdtGeneracionHDRs_SDT_Item> value )
   {
      item = value;
   }

   protected  java.util.Vector<StructSdtGeneracionHDRs_SDT_Item> item = new java.util.Vector<>();
}

