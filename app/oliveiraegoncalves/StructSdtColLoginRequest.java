package app.oliveiraegoncalves ;
import com.genexus.*;

@jakarta.xml.bind.annotation.XmlType(name = "ColLoginRequest", namespace ="TexplusNET")
public final  class StructSdtColLoginRequest implements Cloneable, java.io.Serializable
{
   public StructSdtColLoginRequest( )
   {
      this( -1, new ModelContext( StructSdtColLoginRequest.class ));
   }

   public StructSdtColLoginRequest( int remoteHandle ,
                                    ModelContext context )
   {
   }

   public  StructSdtColLoginRequest( java.util.Vector<StructSdtLoginRequest> value )
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

   @jakarta.xml.bind.annotation.XmlElement(name="LoginRequest",namespace="TexplusNET")
   public java.util.Vector<StructSdtLoginRequest> getItem( )
   {
      return item;
   }

   public void setItem( java.util.Vector<StructSdtLoginRequest> value )
   {
      item = value;
   }

   protected  java.util.Vector<StructSdtLoginRequest> item = new java.util.Vector<>();
}

