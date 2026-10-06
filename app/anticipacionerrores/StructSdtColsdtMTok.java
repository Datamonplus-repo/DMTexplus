package app.anticipacionerrores ;
import com.genexus.*;

@jakarta.xml.bind.annotation.XmlType(name = "ColsdtMTok", namespace ="TexplusNET")
public final  class StructSdtColsdtMTok implements Cloneable, java.io.Serializable
{
   public StructSdtColsdtMTok( )
   {
      this( -1, new ModelContext( StructSdtColsdtMTok.class ));
   }

   public StructSdtColsdtMTok( int remoteHandle ,
                               ModelContext context )
   {
   }

   public  StructSdtColsdtMTok( java.util.Vector<StructSdtsdtMTok> value )
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

   @jakarta.xml.bind.annotation.XmlElement(name="sdtMTok",namespace="TexplusNET")
   public java.util.Vector<StructSdtsdtMTok> getItem( )
   {
      return item;
   }

   public void setItem( java.util.Vector<StructSdtsdtMTok> value )
   {
      item = value;
   }

   protected  java.util.Vector<StructSdtsdtMTok> item = new java.util.Vector<>();
}

