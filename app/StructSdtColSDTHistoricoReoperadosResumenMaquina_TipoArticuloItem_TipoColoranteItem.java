package app ;
import com.genexus.*;

@jakarta.xml.bind.annotation.XmlType(name = "ColSDTHistoricoReoperadosResumenMaquina.TipoArticuloItem.TipoColoranteItem", namespace ="TexplusNET")
public final  class StructSdtColSDTHistoricoReoperadosResumenMaquina_TipoArticuloItem_TipoColoranteItem implements Cloneable, java.io.Serializable
{
   public StructSdtColSDTHistoricoReoperadosResumenMaquina_TipoArticuloItem_TipoColoranteItem( )
   {
      this( -1, new ModelContext( StructSdtColSDTHistoricoReoperadosResumenMaquina_TipoArticuloItem_TipoColoranteItem.class ));
   }

   public StructSdtColSDTHistoricoReoperadosResumenMaquina_TipoArticuloItem_TipoColoranteItem( int remoteHandle ,
                                                                                               ModelContext context )
   {
   }

   public  StructSdtColSDTHistoricoReoperadosResumenMaquina_TipoArticuloItem_TipoColoranteItem( java.util.Vector<StructSdtSDTHistoricoReoperadosResumenMaquina_TipoArticuloItem_TipoColoranteItem> value )
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

   @jakarta.xml.bind.annotation.XmlElement(name="SDTHistoricoReoperadosResumenMaquina.TipoArticuloItem.TipoColoranteItem",namespace="TexplusNET")
   public java.util.Vector<StructSdtSDTHistoricoReoperadosResumenMaquina_TipoArticuloItem_TipoColoranteItem> getItem( )
   {
      return item;
   }

   public void setItem( java.util.Vector<StructSdtSDTHistoricoReoperadosResumenMaquina_TipoArticuloItem_TipoColoranteItem> value )
   {
      item = value;
   }

   protected  java.util.Vector<StructSdtSDTHistoricoReoperadosResumenMaquina_TipoArticuloItem_TipoColoranteItem> item = new java.util.Vector<>();
}

