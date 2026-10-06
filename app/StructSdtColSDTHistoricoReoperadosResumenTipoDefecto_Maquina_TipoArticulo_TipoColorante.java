package app ;
import com.genexus.*;

@jakarta.xml.bind.annotation.XmlType(name = "ColSDTHistoricoReoperadosResumenTipoDefecto.Maquina.TipoArticulo.TipoColorante", namespace ="TexplusNET")
public final  class StructSdtColSDTHistoricoReoperadosResumenTipoDefecto_Maquina_TipoArticulo_TipoColorante implements Cloneable, java.io.Serializable
{
   public StructSdtColSDTHistoricoReoperadosResumenTipoDefecto_Maquina_TipoArticulo_TipoColorante( )
   {
      this( -1, new ModelContext( StructSdtColSDTHistoricoReoperadosResumenTipoDefecto_Maquina_TipoArticulo_TipoColorante.class ));
   }

   public StructSdtColSDTHistoricoReoperadosResumenTipoDefecto_Maquina_TipoArticulo_TipoColorante( int remoteHandle ,
                                                                                                   ModelContext context )
   {
   }

   public  StructSdtColSDTHistoricoReoperadosResumenTipoDefecto_Maquina_TipoArticulo_TipoColorante( java.util.Vector<StructSdtSDTHistoricoReoperadosResumenTipoDefecto_Maquina_TipoArticulo_TipoColorante> value )
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

   @jakarta.xml.bind.annotation.XmlElement(name="SDTHistoricoReoperadosResumenTipoDefecto.Maquina.TipoArticulo.TipoColorante",namespace="TexplusNET")
   public java.util.Vector<StructSdtSDTHistoricoReoperadosResumenTipoDefecto_Maquina_TipoArticulo_TipoColorante> getItem( )
   {
      return item;
   }

   public void setItem( java.util.Vector<StructSdtSDTHistoricoReoperadosResumenTipoDefecto_Maquina_TipoArticulo_TipoColorante> value )
   {
      item = value;
   }

   protected  java.util.Vector<StructSdtSDTHistoricoReoperadosResumenTipoDefecto_Maquina_TipoArticulo_TipoColorante> item = new java.util.Vector<>();
}

