package app.ficherosbasicos ;
import com.genexus.*;

@jakarta.xml.bind.annotation.XmlType(name = "DuplicarArticulos_SDT", namespace ="TexplusNET")
public final  class StructSdtDuplicarArticulos_SDT implements Cloneable, java.io.Serializable
{
   public StructSdtDuplicarArticulos_SDT( )
   {
      this( -1, new ModelContext( StructSdtDuplicarArticulos_SDT.class ));
   }

   public StructSdtDuplicarArticulos_SDT( int remoteHandle ,
                                          ModelContext context )
   {
   }

   public  StructSdtDuplicarArticulos_SDT( java.util.Vector<StructSdtDuplicarArticulos_SDT_DuplicarArticulos_SDTItem> value )
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

   @jakarta.xml.bind.annotation.XmlElement(name="DuplicarArticulos_SDTItem",namespace="TexplusNET")
   public java.util.Vector<StructSdtDuplicarArticulos_SDT_DuplicarArticulos_SDTItem> getItem( )
   {
      return item;
   }

   public void setItem( java.util.Vector<StructSdtDuplicarArticulos_SDT_DuplicarArticulos_SDTItem> value )
   {
      item = value;
   }

   protected  java.util.Vector<StructSdtDuplicarArticulos_SDT_DuplicarArticulos_SDTItem> item = new java.util.Vector<>();
}

