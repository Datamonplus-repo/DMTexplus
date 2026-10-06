package app.datamon ;
import com.genexus.*;

@jakarta.xml.bind.annotation.XmlType(name = "ColSdtUser", namespace ="TexplusNET")
public final  class StructSdtColSdtUser implements Cloneable, java.io.Serializable
{
   public StructSdtColSdtUser( )
   {
      this( -1, new ModelContext( StructSdtColSdtUser.class ));
   }

   public StructSdtColSdtUser( int remoteHandle ,
                               ModelContext context )
   {
   }

   public  StructSdtColSdtUser( java.util.Vector<StructSdtSdtUser> value )
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

   @jakarta.xml.bind.annotation.XmlElement(name="SdtUser",namespace="TexplusNET")
   public java.util.Vector<StructSdtSdtUser> getItem( )
   {
      return item;
   }

   public void setItem( java.util.Vector<StructSdtSdtUser> value )
   {
      item = value;
   }

   protected  java.util.Vector<StructSdtSdtUser> item = new java.util.Vector<>();
}

