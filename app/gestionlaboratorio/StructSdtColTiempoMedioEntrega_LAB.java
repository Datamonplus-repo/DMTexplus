package app.gestionlaboratorio ;
import com.genexus.*;

@jakarta.xml.bind.annotation.XmlType(name = "ColTiempoMedioEntrega_LAB", namespace ="TexplusNET")
public final  class StructSdtColTiempoMedioEntrega_LAB implements Cloneable, java.io.Serializable
{
   public StructSdtColTiempoMedioEntrega_LAB( )
   {
      this( -1, new ModelContext( StructSdtColTiempoMedioEntrega_LAB.class ));
   }

   public StructSdtColTiempoMedioEntrega_LAB( int remoteHandle ,
                                              ModelContext context )
   {
   }

   public  StructSdtColTiempoMedioEntrega_LAB( java.util.Vector<StructSdtTiempoMedioEntrega_LAB> value )
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

   @jakarta.xml.bind.annotation.XmlElement(name="TiempoMedioEntrega_LAB",namespace="TexplusNET")
   public java.util.Vector<StructSdtTiempoMedioEntrega_LAB> getItem( )
   {
      return item;
   }

   public void setItem( java.util.Vector<StructSdtTiempoMedioEntrega_LAB> value )
   {
      item = value;
   }

   protected  java.util.Vector<StructSdtTiempoMedioEntrega_LAB> item = new java.util.Vector<>();
}

