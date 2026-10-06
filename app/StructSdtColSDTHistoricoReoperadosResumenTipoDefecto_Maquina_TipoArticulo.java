package app ;
import com.genexus.*;

@jakarta.xml.bind.annotation.XmlType(name = "ColSDTHistoricoReoperadosResumenTipoDefecto.Maquina.TipoArticulo", namespace ="TexplusNET")
public final  class StructSdtColSDTHistoricoReoperadosResumenTipoDefecto_Maquina_TipoArticulo implements Cloneable, java.io.Serializable
{
   public StructSdtColSDTHistoricoReoperadosResumenTipoDefecto_Maquina_TipoArticulo( )
   {
      this( -1, new ModelContext( StructSdtColSDTHistoricoReoperadosResumenTipoDefecto_Maquina_TipoArticulo.class ));
   }

   public StructSdtColSDTHistoricoReoperadosResumenTipoDefecto_Maquina_TipoArticulo( int remoteHandle ,
                                                                                     ModelContext context )
   {
   }

   public  StructSdtColSDTHistoricoReoperadosResumenTipoDefecto_Maquina_TipoArticulo( java.util.Vector<StructSdtSDTHistoricoReoperadosResumenTipoDefecto_Maquina_TipoArticulo> value )
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

   @jakarta.xml.bind.annotation.XmlElement(name="SDTHistoricoReoperadosResumenTipoDefecto.Maquina.TipoArticulo",namespace="TexplusNET")
   public java.util.Vector<StructSdtSDTHistoricoReoperadosResumenTipoDefecto_Maquina_TipoArticulo> getItem( )
   {
      return item;
   }

   public void setItem( java.util.Vector<StructSdtSDTHistoricoReoperadosResumenTipoDefecto_Maquina_TipoArticulo> value )
   {
      item = value;
   }

   protected  java.util.Vector<StructSdtSDTHistoricoReoperadosResumenTipoDefecto_Maquina_TipoArticulo> item = new java.util.Vector<>();
}

