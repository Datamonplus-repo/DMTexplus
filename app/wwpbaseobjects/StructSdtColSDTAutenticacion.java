package app.wwpbaseobjects ;
import com.genexus.*;

@jakarta.xml.bind.annotation.XmlType(name = "ColSDTAutenticacion", namespace ="TexplusNET")
public final  class StructSdtColSDTAutenticacion implements Cloneable, java.io.Serializable
{
   public StructSdtColSDTAutenticacion( )
   {
      this( -1, new ModelContext( StructSdtColSDTAutenticacion.class ));
   }

   public StructSdtColSDTAutenticacion( int remoteHandle ,
                                        ModelContext context )
   {
   }

   public  StructSdtColSDTAutenticacion( java.util.Vector<StructSdtSDTAutenticacion> value )
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

   @jakarta.xml.bind.annotation.XmlElement(name="SDTAutenticacion",namespace="TexplusNET")
   public java.util.Vector<StructSdtSDTAutenticacion> getItem( )
   {
      return item;
   }

   public void setItem( java.util.Vector<StructSdtSDTAutenticacion> value )
   {
      item = value;
   }

   protected  java.util.Vector<StructSdtSDTAutenticacion> item = new java.util.Vector<>();
}

