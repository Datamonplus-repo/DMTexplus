package app ;
import com.genexus.*;

@jakarta.xml.bind.annotation.XmlType(name = "ColSDTDistribuciondeUnidades", namespace ="TexplusNET")
public final  class StructSdtColSDTDistribuciondeUnidades implements Cloneable, java.io.Serializable
{
   public StructSdtColSDTDistribuciondeUnidades( )
   {
      this( -1, new ModelContext( StructSdtColSDTDistribuciondeUnidades.class ));
   }

   public StructSdtColSDTDistribuciondeUnidades( int remoteHandle ,
                                                 ModelContext context )
   {
   }

   public  StructSdtColSDTDistribuciondeUnidades( java.util.Vector<StructSdtSDTDistribuciondeUnidades> value )
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

   @jakarta.xml.bind.annotation.XmlElement(name="SDTDistribuciondeUnidades",namespace="TexplusNET")
   public java.util.Vector<StructSdtSDTDistribuciondeUnidades> getItem( )
   {
      return item;
   }

   public void setItem( java.util.Vector<StructSdtSDTDistribuciondeUnidades> value )
   {
      item = value;
   }

   protected  java.util.Vector<StructSdtSDTDistribuciondeUnidades> item = new java.util.Vector<>();
}

