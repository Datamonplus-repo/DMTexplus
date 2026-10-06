package app.calidad ;
import com.genexus.*;

@jakarta.xml.bind.annotation.XmlType(name = "wwImprimirRCNCGrid1SDT", namespace ="TexplusNET")
public final  class StructSdtwwImprimirRCNCGrid1SDT implements Cloneable, java.io.Serializable
{
   public StructSdtwwImprimirRCNCGrid1SDT( )
   {
      this( -1, new ModelContext( StructSdtwwImprimirRCNCGrid1SDT.class ));
   }

   public StructSdtwwImprimirRCNCGrid1SDT( int remoteHandle ,
                                           ModelContext context )
   {
   }

   public  StructSdtwwImprimirRCNCGrid1SDT( java.util.Vector<StructSdtwwImprimirRCNCGrid1SDT_wwImprimirRCNCGrid1SDTItem> value )
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

   @jakarta.xml.bind.annotation.XmlElement(name="wwImprimirRCNCGrid1SDTItem",namespace="TexplusNET")
   public java.util.Vector<StructSdtwwImprimirRCNCGrid1SDT_wwImprimirRCNCGrid1SDTItem> getItem( )
   {
      return item;
   }

   public void setItem( java.util.Vector<StructSdtwwImprimirRCNCGrid1SDT_wwImprimirRCNCGrid1SDTItem> value )
   {
      item = value;
   }

   protected  java.util.Vector<StructSdtwwImprimirRCNCGrid1SDT_wwImprimirRCNCGrid1SDTItem> item = new java.util.Vector<>();
}

