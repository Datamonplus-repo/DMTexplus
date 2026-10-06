package app.devops ;
import com.genexus.*;

@jakarta.xml.bind.annotation.XmlType(name = "ColResponseHeartBeat", namespace ="TexplusNET")
public final  class StructSdtColResponseHeartBeat implements Cloneable, java.io.Serializable
{
   public StructSdtColResponseHeartBeat( )
   {
      this( -1, new ModelContext( StructSdtColResponseHeartBeat.class ));
   }

   public StructSdtColResponseHeartBeat( int remoteHandle ,
                                         ModelContext context )
   {
   }

   public  StructSdtColResponseHeartBeat( java.util.Vector<StructSdtResponseHeartBeat> value )
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

   @jakarta.xml.bind.annotation.XmlElement(name="ResponseHeartBeat",namespace="TexplusNET")
   public java.util.Vector<StructSdtResponseHeartBeat> getItem( )
   {
      return item;
   }

   public void setItem( java.util.Vector<StructSdtResponseHeartBeat> value )
   {
      item = value;
   }

   protected  java.util.Vector<StructSdtResponseHeartBeat> item = new java.util.Vector<>();
}

