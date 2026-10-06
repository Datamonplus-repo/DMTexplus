package app.oliveiraegoncalves.v1 ;
import com.genexus.*;

@jakarta.xml.bind.annotation.XmlType(name = "ColLoginResponse", namespace ="TexplusNET")
public final  class StructSdtColLoginResponse implements Cloneable, java.io.Serializable
{
   public StructSdtColLoginResponse( )
   {
      this( -1, new ModelContext( StructSdtColLoginResponse.class ));
   }

   public StructSdtColLoginResponse( int remoteHandle ,
                                     ModelContext context )
   {
   }

   public  StructSdtColLoginResponse( java.util.Vector<StructSdtLoginResponse> value )
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

   @jakarta.xml.bind.annotation.XmlElement(name="LoginResponse",namespace="TexplusNET")
   public java.util.Vector<StructSdtLoginResponse> getItem( )
   {
      return item;
   }

   public void setItem( java.util.Vector<StructSdtLoginResponse> value )
   {
      item = value;
   }

   protected  java.util.Vector<StructSdtLoginResponse> item = new java.util.Vector<>();
}

