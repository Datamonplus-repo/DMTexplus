package app.ingenieria ;
import com.genexus.*;

@jakarta.xml.bind.annotation.XmlType(name = "ColMRParProSDT", namespace ="TexplusNET")
public final  class StructSdtColMRParProSDT implements Cloneable, java.io.Serializable
{
   public StructSdtColMRParProSDT( )
   {
      this( -1, new ModelContext( StructSdtColMRParProSDT.class ));
   }

   public StructSdtColMRParProSDT( int remoteHandle ,
                                   ModelContext context )
   {
   }

   public  StructSdtColMRParProSDT( java.util.Vector<StructSdtMRParProSDT> value )
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

   @jakarta.xml.bind.annotation.XmlElement(name="MRParProSDT",namespace="TexplusNET")
   public java.util.Vector<StructSdtMRParProSDT> getItem( )
   {
      return item;
   }

   public void setItem( java.util.Vector<StructSdtMRParProSDT> value )
   {
      item = value;
   }

   protected  java.util.Vector<StructSdtMRParProSDT> item = new java.util.Vector<>();
}

