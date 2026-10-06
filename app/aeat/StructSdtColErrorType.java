package app.aeat ;
import com.genexus.*;

@jakarta.xml.bind.annotation.XmlType(name = "ColErrorType", namespace ="TexplusNET")
public final  class StructSdtColErrorType implements Cloneable, java.io.Serializable
{
   public StructSdtColErrorType( )
   {
      this( -1, new ModelContext( StructSdtColErrorType.class ));
   }

   public StructSdtColErrorType( int remoteHandle ,
                                 ModelContext context )
   {
   }

   public  StructSdtColErrorType( java.util.Vector<StructSdtErrorType> value )
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

   @jakarta.xml.bind.annotation.XmlElement(name="ErrorType",namespace="TexplusNET")
   public java.util.Vector<StructSdtErrorType> getItem( )
   {
      return item;
   }

   public void setItem( java.util.Vector<StructSdtErrorType> value )
   {
      item = value;
   }

   protected  java.util.Vector<StructSdtErrorType> item = new java.util.Vector<>();
}

