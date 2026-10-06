package app ;
import com.genexus.*;

@jakarta.xml.bind.annotation.XmlType(name = "ColSDTResumenTipoColorante", namespace ="TexplusNET")
public final  class StructSdtColSDTResumenTipoColorante implements Cloneable, java.io.Serializable
{
   public StructSdtColSDTResumenTipoColorante( )
   {
      this( -1, new ModelContext( StructSdtColSDTResumenTipoColorante.class ));
   }

   public StructSdtColSDTResumenTipoColorante( int remoteHandle ,
                                               ModelContext context )
   {
   }

   public  StructSdtColSDTResumenTipoColorante( java.util.Vector<StructSdtSDTResumenTipoColorante> value )
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

   @jakarta.xml.bind.annotation.XmlElement(name="SDTResumenTipoColorante",namespace="TexplusNET")
   public java.util.Vector<StructSdtSDTResumenTipoColorante> getItem( )
   {
      return item;
   }

   public void setItem( java.util.Vector<StructSdtSDTResumenTipoColorante> value )
   {
      item = value;
   }

   protected  java.util.Vector<StructSdtSDTResumenTipoColorante> item = new java.util.Vector<>();
}

