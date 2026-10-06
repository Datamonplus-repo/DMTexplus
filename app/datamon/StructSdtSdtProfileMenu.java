package app.datamon ;
import com.genexus.*;

@jakarta.xml.bind.annotation.XmlType(name = "SdtProfileMenu", namespace ="TexplusNET")
public final  class StructSdtSdtProfileMenu implements Cloneable, java.io.Serializable
{
   public StructSdtSdtProfileMenu( )
   {
      this( -1, new ModelContext( StructSdtSdtProfileMenu.class ));
   }

   public StructSdtSdtProfileMenu( int remoteHandle ,
                                   ModelContext context )
   {
   }

   public  StructSdtSdtProfileMenu( java.util.Vector<StructSdtSdtProfileMenu_Menu> value )
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

   @jakarta.xml.bind.annotation.XmlElement(name="Menu",namespace="TexplusNET")
   public java.util.Vector<StructSdtSdtProfileMenu_Menu> getItem( )
   {
      return item;
   }

   public void setItem( java.util.Vector<StructSdtSdtProfileMenu_Menu> value )
   {
      item = value;
   }

   protected  java.util.Vector<StructSdtSdtProfileMenu_Menu> item = new java.util.Vector<>();
}

