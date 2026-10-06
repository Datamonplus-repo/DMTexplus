package app.anticipacionerrores ;
import com.genexus.*;

@jakarta.xml.bind.annotation.XmlType(name = "ColsdtMDef", namespace ="TexplusNET")
public final  class StructSdtColsdtMDef implements Cloneable, java.io.Serializable
{
   public StructSdtColsdtMDef( )
   {
      this( -1, new ModelContext( StructSdtColsdtMDef.class ));
   }

   public StructSdtColsdtMDef( int remoteHandle ,
                               ModelContext context )
   {
   }

   public  StructSdtColsdtMDef( java.util.Vector<StructSdtsdtMDef> value )
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

   @jakarta.xml.bind.annotation.XmlElement(name="sdtMDef",namespace="TexplusNET")
   public java.util.Vector<StructSdtsdtMDef> getItem( )
   {
      return item;
   }

   public void setItem( java.util.Vector<StructSdtsdtMDef> value )
   {
      item = value;
   }

   protected  java.util.Vector<StructSdtsdtMDef> item = new java.util.Vector<>();
}

