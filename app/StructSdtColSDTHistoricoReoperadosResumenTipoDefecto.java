package app ;
import com.genexus.*;

@jakarta.xml.bind.annotation.XmlType(name = "ColSDTHistoricoReoperadosResumenTipoDefecto", namespace ="TexplusNET")
public final  class StructSdtColSDTHistoricoReoperadosResumenTipoDefecto implements Cloneable, java.io.Serializable
{
   public StructSdtColSDTHistoricoReoperadosResumenTipoDefecto( )
   {
      this( -1, new ModelContext( StructSdtColSDTHistoricoReoperadosResumenTipoDefecto.class ));
   }

   public StructSdtColSDTHistoricoReoperadosResumenTipoDefecto( int remoteHandle ,
                                                                ModelContext context )
   {
   }

   public  StructSdtColSDTHistoricoReoperadosResumenTipoDefecto( java.util.Vector<StructSdtSDTHistoricoReoperadosResumenTipoDefecto> value )
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

   @jakarta.xml.bind.annotation.XmlElement(name="SDTHistoricoReoperadosResumenTipoDefecto",namespace="TexplusNET")
   public java.util.Vector<StructSdtSDTHistoricoReoperadosResumenTipoDefecto> getItem( )
   {
      return item;
   }

   public void setItem( java.util.Vector<StructSdtSDTHistoricoReoperadosResumenTipoDefecto> value )
   {
      item = value;
   }

   protected  java.util.Vector<StructSdtSDTHistoricoReoperadosResumenTipoDefecto> item = new java.util.Vector<>();
}

