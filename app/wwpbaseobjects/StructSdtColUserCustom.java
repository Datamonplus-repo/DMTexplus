package app.wwpbaseobjects ;
import com.genexus.*;

@jakarta.xml.bind.annotation.XmlType(name = "ColUserCustom", namespace ="TexplusNET")
public final  class StructSdtColUserCustom implements Cloneable, java.io.Serializable
{
   public StructSdtColUserCustom( )
   {
      this( -1, new ModelContext( StructSdtColUserCustom.class ));
   }

   public StructSdtColUserCustom( int remoteHandle ,
                                  ModelContext context )
   {
   }

   public  StructSdtColUserCustom( java.util.Vector<StructSdtUserCustom> value )
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

   @jakarta.xml.bind.annotation.XmlElement(name="UserCustom",namespace="TexplusNET")
   public java.util.Vector<StructSdtUserCustom> getItem( )
   {
      return item;
   }

   public void setItem( java.util.Vector<StructSdtUserCustom> value )
   {
      item = value;
   }

   protected  java.util.Vector<StructSdtUserCustom> item = new java.util.Vector<>();
}

