package app ;
import com.genexus.*;

@jakarta.xml.bind.annotation.XmlType(name = "ColParametroNavegacion", namespace ="TexplusNET")
public final  class StructSdtColParametroNavegacion implements Cloneable, java.io.Serializable
{
   public StructSdtColParametroNavegacion( )
   {
      this( -1, new ModelContext( StructSdtColParametroNavegacion.class ));
   }

   public StructSdtColParametroNavegacion( int remoteHandle ,
                                           ModelContext context )
   {
   }

   public  StructSdtColParametroNavegacion( java.util.Vector<StructSdtParametroNavegacion> value )
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

   @jakarta.xml.bind.annotation.XmlElement(name="ParametroNavegacion",namespace="TexplusNET")
   public java.util.Vector<StructSdtParametroNavegacion> getItem( )
   {
      return item;
   }

   public void setItem( java.util.Vector<StructSdtParametroNavegacion> value )
   {
      item = value;
   }

   protected  java.util.Vector<StructSdtParametroNavegacion> item = new java.util.Vector<>();
}

