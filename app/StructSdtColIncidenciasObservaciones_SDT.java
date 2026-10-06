package app ;
import com.genexus.*;

@jakarta.xml.bind.annotation.XmlType(name = "ColIncidenciasObservaciones_SDT", namespace ="TexplusNET")
public final  class StructSdtColIncidenciasObservaciones_SDT implements Cloneable, java.io.Serializable
{
   public StructSdtColIncidenciasObservaciones_SDT( )
   {
      this( -1, new ModelContext( StructSdtColIncidenciasObservaciones_SDT.class ));
   }

   public StructSdtColIncidenciasObservaciones_SDT( int remoteHandle ,
                                                    ModelContext context )
   {
   }

   public  StructSdtColIncidenciasObservaciones_SDT( java.util.Vector<StructSdtIncidenciasObservaciones_SDT> value )
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

   @jakarta.xml.bind.annotation.XmlElement(name="IncidenciasObservaciones_SDT",namespace="TexplusNET")
   public java.util.Vector<StructSdtIncidenciasObservaciones_SDT> getItem( )
   {
      return item;
   }

   public void setItem( java.util.Vector<StructSdtIncidenciasObservaciones_SDT> value )
   {
      item = value;
   }

   protected  java.util.Vector<StructSdtIncidenciasObservaciones_SDT> item = new java.util.Vector<>();
}

