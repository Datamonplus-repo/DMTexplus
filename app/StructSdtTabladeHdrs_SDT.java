package app ;
import com.genexus.*;

@jakarta.xml.bind.annotation.XmlType(name = "TabladeHdrs_SDT", namespace ="TexplusNET")
public final  class StructSdtTabladeHdrs_SDT implements Cloneable, java.io.Serializable
{
   public StructSdtTabladeHdrs_SDT( )
   {
      this( -1, new ModelContext( StructSdtTabladeHdrs_SDT.class ));
   }

   public StructSdtTabladeHdrs_SDT( int remoteHandle ,
                                    ModelContext context )
   {
   }

   public  StructSdtTabladeHdrs_SDT( java.util.Vector<StructSdtTabladeHdrs_SDT_TabladeHdrs_SDTItem> value )
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

   @jakarta.xml.bind.annotation.XmlElement(name="TabladeHdrs_SDTItem",namespace="TexplusNET")
   public java.util.Vector<StructSdtTabladeHdrs_SDT_TabladeHdrs_SDTItem> getItem( )
   {
      return item;
   }

   public void setItem( java.util.Vector<StructSdtTabladeHdrs_SDT_TabladeHdrs_SDTItem> value )
   {
      item = value;
   }

   protected  java.util.Vector<StructSdtTabladeHdrs_SDT_TabladeHdrs_SDTItem> item = new java.util.Vector<>();
}

