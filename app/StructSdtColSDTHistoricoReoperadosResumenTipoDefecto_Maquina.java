package app ;
import com.genexus.*;

@jakarta.xml.bind.annotation.XmlType(name = "ColSDTHistoricoReoperadosResumenTipoDefecto.Maquina", namespace ="TexplusNET")
public final  class StructSdtColSDTHistoricoReoperadosResumenTipoDefecto_Maquina implements Cloneable, java.io.Serializable
{
   public StructSdtColSDTHistoricoReoperadosResumenTipoDefecto_Maquina( )
   {
      this( -1, new ModelContext( StructSdtColSDTHistoricoReoperadosResumenTipoDefecto_Maquina.class ));
   }

   public StructSdtColSDTHistoricoReoperadosResumenTipoDefecto_Maquina( int remoteHandle ,
                                                                        ModelContext context )
   {
   }

   public  StructSdtColSDTHistoricoReoperadosResumenTipoDefecto_Maquina( java.util.Vector<StructSdtSDTHistoricoReoperadosResumenTipoDefecto_Maquina> value )
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

   @jakarta.xml.bind.annotation.XmlElement(name="SDTHistoricoReoperadosResumenTipoDefecto.Maquina",namespace="TexplusNET")
   public java.util.Vector<StructSdtSDTHistoricoReoperadosResumenTipoDefecto_Maquina> getItem( )
   {
      return item;
   }

   public void setItem( java.util.Vector<StructSdtSDTHistoricoReoperadosResumenTipoDefecto_Maquina> value )
   {
      item = value;
   }

   protected  java.util.Vector<StructSdtSDTHistoricoReoperadosResumenTipoDefecto_Maquina> item = new java.util.Vector<>();
}

