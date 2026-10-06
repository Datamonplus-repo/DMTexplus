package app ;
import com.genexus.*;

@jakarta.xml.bind.annotation.XmlType(name = "ColSDTHistoricoReoperadosMaquina.TipoDefecto.Hdr", namespace ="TexplusNET")
public final  class StructSdtColSDTHistoricoReoperadosMaquina_TipoDefecto_Hdr implements Cloneable, java.io.Serializable
{
   public StructSdtColSDTHistoricoReoperadosMaquina_TipoDefecto_Hdr( )
   {
      this( -1, new ModelContext( StructSdtColSDTHistoricoReoperadosMaquina_TipoDefecto_Hdr.class ));
   }

   public StructSdtColSDTHistoricoReoperadosMaquina_TipoDefecto_Hdr( int remoteHandle ,
                                                                     ModelContext context )
   {
   }

   public  StructSdtColSDTHistoricoReoperadosMaquina_TipoDefecto_Hdr( java.util.Vector<StructSdtSDTHistoricoReoperadosMaquina_TipoDefecto_Hdr> value )
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

   @jakarta.xml.bind.annotation.XmlElement(name="SDTHistoricoReoperadosMaquina.TipoDefecto.Hdr",namespace="TexplusNET")
   public java.util.Vector<StructSdtSDTHistoricoReoperadosMaquina_TipoDefecto_Hdr> getItem( )
   {
      return item;
   }

   public void setItem( java.util.Vector<StructSdtSDTHistoricoReoperadosMaquina_TipoDefecto_Hdr> value )
   {
      item = value;
   }

   protected  java.util.Vector<StructSdtSDTHistoricoReoperadosMaquina_TipoDefecto_Hdr> item = new java.util.Vector<>();
}

