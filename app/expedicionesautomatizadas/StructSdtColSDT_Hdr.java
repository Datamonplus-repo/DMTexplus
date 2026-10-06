package app.expedicionesautomatizadas ;
import com.genexus.*;

@jakarta.xml.bind.annotation.XmlType(name = "ColSDT_Hdr", namespace ="TexplusNET")
public final  class StructSdtColSDT_Hdr implements Cloneable, java.io.Serializable
{
   public StructSdtColSDT_Hdr( )
   {
      this( -1, new ModelContext( StructSdtColSDT_Hdr.class ));
   }

   public StructSdtColSDT_Hdr( int remoteHandle ,
                               ModelContext context )
   {
   }

   public  StructSdtColSDT_Hdr( java.util.Vector<StructSdtSDT_Hdr> value )
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

   @jakarta.xml.bind.annotation.XmlElement(name="SDT_Hdr",namespace="TexplusNET")
   public java.util.Vector<StructSdtSDT_Hdr> getItem( )
   {
      return item;
   }

   public void setItem( java.util.Vector<StructSdtSDT_Hdr> value )
   {
      item = value;
   }

   protected  java.util.Vector<StructSdtSDT_Hdr> item = new java.util.Vector<>();
}

