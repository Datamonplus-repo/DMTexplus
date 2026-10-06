package app ;
import com.genexus.*;

@jakarta.xml.bind.annotation.XmlType(name = "ColSDTtblLhipro", namespace ="TexplusNET")
public final  class StructSdtColSDTtblLhipro implements Cloneable, java.io.Serializable
{
   public StructSdtColSDTtblLhipro( )
   {
      this( -1, new ModelContext( StructSdtColSDTtblLhipro.class ));
   }

   public StructSdtColSDTtblLhipro( int remoteHandle ,
                                    ModelContext context )
   {
   }

   public  StructSdtColSDTtblLhipro( java.util.Vector<StructSdtSDTtblLhipro> value )
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

   @jakarta.xml.bind.annotation.XmlElement(name="SDTtblLhipro",namespace="TexplusNET")
   public java.util.Vector<StructSdtSDTtblLhipro> getItem( )
   {
      return item;
   }

   public void setItem( java.util.Vector<StructSdtSDTtblLhipro> value )
   {
      item = value;
   }

   protected  java.util.Vector<StructSdtSDTtblLhipro> item = new java.util.Vector<>();
}

