package app ;
import com.genexus.*;

@jakarta.xml.bind.annotation.XmlType(name = "ColSDTPCO0002", namespace ="TexplusNET")
public final  class StructSdtColSDTPCO0002 implements Cloneable, java.io.Serializable
{
   public StructSdtColSDTPCO0002( )
   {
      this( -1, new ModelContext( StructSdtColSDTPCO0002.class ));
   }

   public StructSdtColSDTPCO0002( int remoteHandle ,
                                  ModelContext context )
   {
   }

   public  StructSdtColSDTPCO0002( java.util.Vector<StructSdtSDTPCO0002> value )
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

   @jakarta.xml.bind.annotation.XmlElement(name="SDTPCO0002",namespace="TexplusNET")
   public java.util.Vector<StructSdtSDTPCO0002> getItem( )
   {
      return item;
   }

   public void setItem( java.util.Vector<StructSdtSDTPCO0002> value )
   {
      item = value;
   }

   protected  java.util.Vector<StructSdtSDTPCO0002> item = new java.util.Vector<>();
}

