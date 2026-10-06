package app ;
import com.genexus.*;

@jakarta.xml.bind.annotation.XmlType(name = "ColAppTool", namespace ="http://tempuri.org/")
public final  class StructSdtColAppTool implements Cloneable, java.io.Serializable
{
   public StructSdtColAppTool( )
   {
      this( -1, new ModelContext( StructSdtColAppTool.class ));
   }

   public StructSdtColAppTool( int remoteHandle ,
                               ModelContext context )
   {
   }

   public  StructSdtColAppTool( java.util.Vector<StructSdtAppTool> value )
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

   @jakarta.xml.bind.annotation.XmlElement(name="AppTool",namespace="http://tempuri.org/")
   public java.util.Vector<StructSdtAppTool> getItem( )
   {
      return item;
   }

   public void setItem( java.util.Vector<StructSdtAppTool> value )
   {
      item = value;
   }

   protected  java.util.Vector<StructSdtAppTool> item = new java.util.Vector<>();
}

