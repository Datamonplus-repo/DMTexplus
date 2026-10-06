package app.ficherosbasicos ;
import com.genexus.*;

@jakarta.xml.bind.annotation.XmlType(name = "SDTDuplicaccionSerie", namespace ="TexplusNET")
public final  class StructSdtSDTDuplicaccionSerie implements Cloneable, java.io.Serializable
{
   public StructSdtSDTDuplicaccionSerie( )
   {
      this( -1, new ModelContext( StructSdtSDTDuplicaccionSerie.class ));
   }

   public StructSdtSDTDuplicaccionSerie( int remoteHandle ,
                                         ModelContext context )
   {
   }

   public  StructSdtSDTDuplicaccionSerie( java.util.Vector<StructSdtSDTDuplicaccionSerie_Serie> value )
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

   @jakarta.xml.bind.annotation.XmlElement(name="Serie",namespace="TexplusNET")
   public java.util.Vector<StructSdtSDTDuplicaccionSerie_Serie> getItem( )
   {
      return item;
   }

   public void setItem( java.util.Vector<StructSdtSDTDuplicaccionSerie_Serie> value )
   {
      item = value;
   }

   protected  java.util.Vector<StructSdtSDTDuplicaccionSerie_Serie> item = new java.util.Vector<>();
}

