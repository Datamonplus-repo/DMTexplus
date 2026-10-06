package app.formulaciontinte ;
import com.genexus.*;

@jakarta.xml.bind.annotation.XmlType(name = "LANYAD_SDT", namespace ="TexplusNET")
public final  class StructSdtLANYAD_SDT implements Cloneable, java.io.Serializable
{
   public StructSdtLANYAD_SDT( )
   {
      this( -1, new ModelContext( StructSdtLANYAD_SDT.class ));
   }

   public StructSdtLANYAD_SDT( int remoteHandle ,
                               ModelContext context )
   {
   }

   public  StructSdtLANYAD_SDT( java.util.Vector<StructSdtLANYAD_SDT_LANYAD_SDTItem> value )
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

   @jakarta.xml.bind.annotation.XmlElement(name="LANYAD_SDTItem",namespace="TexplusNET")
   public java.util.Vector<StructSdtLANYAD_SDT_LANYAD_SDTItem> getItem( )
   {
      return item;
   }

   public void setItem( java.util.Vector<StructSdtLANYAD_SDT_LANYAD_SDTItem> value )
   {
      item = value;
   }

   protected  java.util.Vector<StructSdtLANYAD_SDT_LANYAD_SDTItem> item = new java.util.Vector<>();
}

