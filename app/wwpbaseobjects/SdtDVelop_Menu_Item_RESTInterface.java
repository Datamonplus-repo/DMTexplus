package app.wwpbaseobjects ;
import app.*;
import com.genexus.*;
import com.fasterxml.jackson.annotation.*;
import java.util.*;

@jakarta.xml.bind.annotation.XmlType(name = "DVelop_Menu.Item", namespace ="TexplusNET")
@JsonPropertyOrder(alphabetic=true)
@JsonAutoDetect(fieldVisibility=JsonAutoDetect.Visibility.NONE, getterVisibility=JsonAutoDetect.Visibility.NONE, isGetterVisibility=JsonAutoDetect.Visibility.NONE)
public final  class SdtDVelop_Menu_Item_RESTInterface extends GxGenericCollectionItem<app.wwpbaseobjects.SdtDVelop_Menu_Item>
{
   public SdtDVelop_Menu_Item_RESTInterface( )
   {
      super(new app.wwpbaseobjects.SdtDVelop_Menu_Item ());
   }

   public SdtDVelop_Menu_Item_RESTInterface( app.wwpbaseobjects.SdtDVelop_Menu_Item psdt )
   {
      super(psdt);
   }

   @JsonProperty("id")
   public String getgxTv_SdtDVelop_Menu_Item_Id( )
   {
      return GXutil.rtrim(((app.wwpbaseobjects.SdtDVelop_Menu_Item)getSdt()).getgxTv_SdtDVelop_Menu_Item_Id()) ;
   }

   @JsonProperty("id")
   public void setgxTv_SdtDVelop_Menu_Item_Id(  String Value )
   {
      ((app.wwpbaseobjects.SdtDVelop_Menu_Item)getSdt()).setgxTv_SdtDVelop_Menu_Item_Id(Value);
   }


   @JsonProperty("tooltip")
   public String getgxTv_SdtDVelop_Menu_Item_Tooltip( )
   {
      return GXutil.rtrim(((app.wwpbaseobjects.SdtDVelop_Menu_Item)getSdt()).getgxTv_SdtDVelop_Menu_Item_Tooltip()) ;
   }

   @JsonProperty("tooltip")
   public void setgxTv_SdtDVelop_Menu_Item_Tooltip(  String Value )
   {
      ((app.wwpbaseobjects.SdtDVelop_Menu_Item)getSdt()).setgxTv_SdtDVelop_Menu_Item_Tooltip(Value);
   }


   @JsonProperty("link")
   public String getgxTv_SdtDVelop_Menu_Item_Link( )
   {
      return GXutil.rtrim(((app.wwpbaseobjects.SdtDVelop_Menu_Item)getSdt()).getgxTv_SdtDVelop_Menu_Item_Link()) ;
   }

   @JsonProperty("link")
   public void setgxTv_SdtDVelop_Menu_Item_Link(  String Value )
   {
      ((app.wwpbaseobjects.SdtDVelop_Menu_Item)getSdt()).setgxTv_SdtDVelop_Menu_Item_Link(Value);
   }


   @JsonProperty("linkTarget")
   public String getgxTv_SdtDVelop_Menu_Item_Linktarget( )
   {
      return GXutil.rtrim(((app.wwpbaseobjects.SdtDVelop_Menu_Item)getSdt()).getgxTv_SdtDVelop_Menu_Item_Linktarget()) ;
   }

   @JsonProperty("linkTarget")
   public void setgxTv_SdtDVelop_Menu_Item_Linktarget(  String Value )
   {
      ((app.wwpbaseobjects.SdtDVelop_Menu_Item)getSdt()).setgxTv_SdtDVelop_Menu_Item_Linktarget(Value);
   }


   @JsonProperty("iconClass")
   public String getgxTv_SdtDVelop_Menu_Item_Iconclass( )
   {
      return GXutil.rtrim(((app.wwpbaseobjects.SdtDVelop_Menu_Item)getSdt()).getgxTv_SdtDVelop_Menu_Item_Iconclass()) ;
   }

   @JsonProperty("iconClass")
   public void setgxTv_SdtDVelop_Menu_Item_Iconclass(  String Value )
   {
      ((app.wwpbaseobjects.SdtDVelop_Menu_Item)getSdt()).setgxTv_SdtDVelop_Menu_Item_Iconclass(Value);
   }


   @JsonProperty("caption")
   public String getgxTv_SdtDVelop_Menu_Item_Caption( )
   {
      return GXutil.rtrim(((app.wwpbaseobjects.SdtDVelop_Menu_Item)getSdt()).getgxTv_SdtDVelop_Menu_Item_Caption()) ;
   }

   @JsonProperty("caption")
   public void setgxTv_SdtDVelop_Menu_Item_Caption(  String Value )
   {
      ((app.wwpbaseobjects.SdtDVelop_Menu_Item)getSdt()).setgxTv_SdtDVelop_Menu_Item_Caption(Value);
   }


   @JsonProperty("authorizationKey")
   public String getgxTv_SdtDVelop_Menu_Item_Authorizationkey( )
   {
      return GXutil.rtrim(((app.wwpbaseobjects.SdtDVelop_Menu_Item)getSdt()).getgxTv_SdtDVelop_Menu_Item_Authorizationkey()) ;
   }

   @JsonProperty("authorizationKey")
   public void setgxTv_SdtDVelop_Menu_Item_Authorizationkey(  String Value )
   {
      ((app.wwpbaseobjects.SdtDVelop_Menu_Item)getSdt()).setgxTv_SdtDVelop_Menu_Item_Authorizationkey(Value);
   }


   @JsonProperty("additionalData")
   public String getgxTv_SdtDVelop_Menu_Item_Additionaldata( )
   {
      return GXutil.rtrim(((app.wwpbaseobjects.SdtDVelop_Menu_Item)getSdt()).getgxTv_SdtDVelop_Menu_Item_Additionaldata()) ;
   }

   @JsonProperty("additionalData")
   public void setgxTv_SdtDVelop_Menu_Item_Additionaldata(  String Value )
   {
      ((app.wwpbaseobjects.SdtDVelop_Menu_Item)getSdt()).setgxTv_SdtDVelop_Menu_Item_Additionaldata(Value);
   }


   @JsonProperty("submenuImage")
   public String getgxTv_SdtDVelop_Menu_Item_Submenuimage( )
   {
      return GXutil.getRelativeURL(((app.wwpbaseobjects.SdtDVelop_Menu_Item)getSdt()).getgxTv_SdtDVelop_Menu_Item_Submenuimage()) ;
   }

   @JsonProperty("submenuImage")
   public void setgxTv_SdtDVelop_Menu_Item_Submenuimage(  String Value )
   {
      ((app.wwpbaseobjects.SdtDVelop_Menu_Item)getSdt()).setgxTv_SdtDVelop_Menu_Item_Submenuimage(Value);
   }


   @JsonProperty("subItems")
   @JsonInclude(JsonInclude.Include.NON_EMPTY)
   public Vector<app.wwpbaseobjects.SdtDVelop_Menu_Item_RESTInterface> getgxTv_SdtDVelop_Menu_Item_Subitems( )
   {
      return SdtDVelop_Menu_Item_RESTInterfacefromGXObjectCollection(((app.wwpbaseobjects.SdtDVelop_Menu_Item)getSdt()).getgxTv_SdtDVelop_Menu_Item_Subitems()) ;
   }

   @JsonProperty("subItems")
   public void setgxTv_SdtDVelop_Menu_Item_Subitems(  Vector<app.wwpbaseobjects.SdtDVelop_Menu_Item_RESTInterface> Value )
   {
      ((app.wwpbaseobjects.SdtDVelop_Menu_Item)getSdt()).setgxTv_SdtDVelop_Menu_Item_Subitems(SdtDVelop_Menu_Item_RESTInterfacetoGXObjectCollection(Value));
   }


   int remoteHandle = -1;
   private GXBaseCollection<app.wwpbaseobjects.SdtDVelop_Menu_Item> SdtDVelop_Menu_Item_RESTInterfacetoGXObjectCollection( Vector<app.wwpbaseobjects.SdtDVelop_Menu_Item_RESTInterface> collection )
   {
      GXBaseCollection<app.wwpbaseobjects.SdtDVelop_Menu_Item> result = new GXBaseCollection<app.wwpbaseobjects.SdtDVelop_Menu_Item>(app.wwpbaseobjects.SdtDVelop_Menu_Item.class, "DVelop_Menu.Item", "TexplusNET.DVelop_Menu", remoteHandle);
      for (int i = 0; i < collection.size(); i++)
      {
         result.add((app.wwpbaseobjects.SdtDVelop_Menu_Item)collection.elementAt(i).getSdt());
      }
      return result ;
   }

   private Vector<app.wwpbaseobjects.SdtDVelop_Menu_Item_RESTInterface> SdtDVelop_Menu_Item_RESTInterfacefromGXObjectCollection( GXBaseCollection<app.wwpbaseobjects.SdtDVelop_Menu_Item> collection )
   {
      Vector<app.wwpbaseobjects.SdtDVelop_Menu_Item_RESTInterface> result = new Vector<app.wwpbaseobjects.SdtDVelop_Menu_Item_RESTInterface>();
      for (int i = 0; i < collection.size(); i++)
      {
         result.addElement(new app.wwpbaseobjects.SdtDVelop_Menu_Item_RESTInterface((app.wwpbaseobjects.SdtDVelop_Menu_Item)collection.elementAt(i)));
      }
      return result ;
   }

}

