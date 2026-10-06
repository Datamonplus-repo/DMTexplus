package app ;
import com.genexus.*;

@jakarta.xml.bind.annotation.XmlType(name = "ColSDTHistoricoReoperadosTipoDefecto", namespace ="TexplusNET")
public final  class StructSdtColSDTHistoricoReoperadosTipoDefecto implements Cloneable, java.io.Serializable
{
   public StructSdtColSDTHistoricoReoperadosTipoDefecto( )
   {
      this( -1, new ModelContext( StructSdtColSDTHistoricoReoperadosTipoDefecto.class ));
   }

   public StructSdtColSDTHistoricoReoperadosTipoDefecto( int remoteHandle ,
                                                         ModelContext context )
   {
   }

   public  StructSdtColSDTHistoricoReoperadosTipoDefecto( java.util.Vector<StructSdtSDTHistoricoReoperadosTipoDefecto> value )
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

   @jakarta.xml.bind.annotation.XmlElement(name="SDTHistoricoReoperadosTipoDefecto",namespace="TexplusNET")
   public java.util.Vector<StructSdtSDTHistoricoReoperadosTipoDefecto> getItem( )
   {
      return item;
   }

   public void setItem( java.util.Vector<StructSdtSDTHistoricoReoperadosTipoDefecto> value )
   {
      item = value;
   }

   protected  java.util.Vector<StructSdtSDTHistoricoReoperadosTipoDefecto> item = new java.util.Vector<>();
}

