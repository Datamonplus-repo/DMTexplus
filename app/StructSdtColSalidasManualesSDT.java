package app ;
import com.genexus.*;

@jakarta.xml.bind.annotation.XmlType(name = "ColSalidasManualesSDT", namespace ="TexplusNET")
public final  class StructSdtColSalidasManualesSDT implements Cloneable, java.io.Serializable
{
   public StructSdtColSalidasManualesSDT( )
   {
      this( -1, new ModelContext( StructSdtColSalidasManualesSDT.class ));
   }

   public StructSdtColSalidasManualesSDT( int remoteHandle ,
                                          ModelContext context )
   {
   }

   public  StructSdtColSalidasManualesSDT( java.util.Vector<StructSdtSalidasManualesSDT> value )
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

   @jakarta.xml.bind.annotation.XmlElement(name="SalidasManualesSDT",namespace="TexplusNET")
   public java.util.Vector<StructSdtSalidasManualesSDT> getItem( )
   {
      return item;
   }

   public void setItem( java.util.Vector<StructSdtSalidasManualesSDT> value )
   {
      item = value;
   }

   protected  java.util.Vector<StructSdtSalidasManualesSDT> item = new java.util.Vector<>();
}

