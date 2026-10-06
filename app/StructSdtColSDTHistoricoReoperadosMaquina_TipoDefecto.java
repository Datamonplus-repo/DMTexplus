package app ;
import com.genexus.*;

@jakarta.xml.bind.annotation.XmlType(name = "ColSDTHistoricoReoperadosMaquina.TipoDefecto", namespace ="TexplusNET")
public final  class StructSdtColSDTHistoricoReoperadosMaquina_TipoDefecto implements Cloneable, java.io.Serializable
{
   public StructSdtColSDTHistoricoReoperadosMaquina_TipoDefecto( )
   {
      this( -1, new ModelContext( StructSdtColSDTHistoricoReoperadosMaquina_TipoDefecto.class ));
   }

   public StructSdtColSDTHistoricoReoperadosMaquina_TipoDefecto( int remoteHandle ,
                                                                 ModelContext context )
   {
   }

   public  StructSdtColSDTHistoricoReoperadosMaquina_TipoDefecto( java.util.Vector<StructSdtSDTHistoricoReoperadosMaquina_TipoDefecto> value )
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

   @jakarta.xml.bind.annotation.XmlElement(name="SDTHistoricoReoperadosMaquina.TipoDefecto",namespace="TexplusNET")
   public java.util.Vector<StructSdtSDTHistoricoReoperadosMaquina_TipoDefecto> getItem( )
   {
      return item;
   }

   public void setItem( java.util.Vector<StructSdtSDTHistoricoReoperadosMaquina_TipoDefecto> value )
   {
      item = value;
   }

   protected  java.util.Vector<StructSdtSDTHistoricoReoperadosMaquina_TipoDefecto> item = new java.util.Vector<>();
}

