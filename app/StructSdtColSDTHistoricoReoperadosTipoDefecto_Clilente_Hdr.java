package app ;
import com.genexus.*;

@jakarta.xml.bind.annotation.XmlType(name = "ColSDTHistoricoReoperadosTipoDefecto.Clilente.Hdr", namespace ="TexplusNET")
public final  class StructSdtColSDTHistoricoReoperadosTipoDefecto_Clilente_Hdr implements Cloneable, java.io.Serializable
{
   public StructSdtColSDTHistoricoReoperadosTipoDefecto_Clilente_Hdr( )
   {
      this( -1, new ModelContext( StructSdtColSDTHistoricoReoperadosTipoDefecto_Clilente_Hdr.class ));
   }

   public StructSdtColSDTHistoricoReoperadosTipoDefecto_Clilente_Hdr( int remoteHandle ,
                                                                      ModelContext context )
   {
   }

   public  StructSdtColSDTHistoricoReoperadosTipoDefecto_Clilente_Hdr( java.util.Vector<StructSdtSDTHistoricoReoperadosTipoDefecto_Clilente_Hdr> value )
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

   @jakarta.xml.bind.annotation.XmlElement(name="SDTHistoricoReoperadosTipoDefecto.Clilente.Hdr",namespace="TexplusNET")
   public java.util.Vector<StructSdtSDTHistoricoReoperadosTipoDefecto_Clilente_Hdr> getItem( )
   {
      return item;
   }

   public void setItem( java.util.Vector<StructSdtSDTHistoricoReoperadosTipoDefecto_Clilente_Hdr> value )
   {
      item = value;
   }

   protected  java.util.Vector<StructSdtSDTHistoricoReoperadosTipoDefecto_Clilente_Hdr> item = new java.util.Vector<>();
}

