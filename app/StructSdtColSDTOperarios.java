package app ;
import com.genexus.*;

@jakarta.xml.bind.annotation.XmlType(name = "ColSDTOperarios", namespace ="TexplusNET")
public final  class StructSdtColSDTOperarios implements Cloneable, java.io.Serializable
{
   public StructSdtColSDTOperarios( )
   {
      this( -1, new ModelContext( StructSdtColSDTOperarios.class ));
   }

   public StructSdtColSDTOperarios( int remoteHandle ,
                                    ModelContext context )
   {
   }

   public  StructSdtColSDTOperarios( java.util.Vector<StructSdtSDTOperarios> value )
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

   @jakarta.xml.bind.annotation.XmlElement(name="SDTOperarios",namespace="TexplusNET")
   public java.util.Vector<StructSdtSDTOperarios> getItem( )
   {
      return item;
   }

   public void setItem( java.util.Vector<StructSdtSDTOperarios> value )
   {
      item = value;
   }

   protected  java.util.Vector<StructSdtSDTOperarios> item = new java.util.Vector<>();
}

