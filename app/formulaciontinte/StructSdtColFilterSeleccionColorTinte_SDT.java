package app.formulaciontinte ;
import com.genexus.*;

@jakarta.xml.bind.annotation.XmlType(name = "ColFilterSeleccionColorTinte_SDT", namespace ="TexplusNET")
public final  class StructSdtColFilterSeleccionColorTinte_SDT implements Cloneable, java.io.Serializable
{
   public StructSdtColFilterSeleccionColorTinte_SDT( )
   {
      this( -1, new ModelContext( StructSdtColFilterSeleccionColorTinte_SDT.class ));
   }

   public StructSdtColFilterSeleccionColorTinte_SDT( int remoteHandle ,
                                                     ModelContext context )
   {
   }

   public  StructSdtColFilterSeleccionColorTinte_SDT( java.util.Vector<StructSdtFilterSeleccionColorTinte_SDT> value )
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

   @jakarta.xml.bind.annotation.XmlElement(name="FilterSeleccionColorTinte_SDT",namespace="TexplusNET")
   public java.util.Vector<StructSdtFilterSeleccionColorTinte_SDT> getItem( )
   {
      return item;
   }

   public void setItem( java.util.Vector<StructSdtFilterSeleccionColorTinte_SDT> value )
   {
      item = value;
   }

   protected  java.util.Vector<StructSdtFilterSeleccionColorTinte_SDT> item = new java.util.Vector<>();
}

