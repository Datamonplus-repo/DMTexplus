package app.datamon ;
import app.*;
import com.genexus.*;
import com.fasterxml.jackson.annotation.*;
import java.util.*;

@jakarta.xml.bind.annotation.XmlType(name = "SdtMenu.ITEM", namespace ="TexplusNET")
@JsonPropertyOrder(alphabetic=true)
@JsonAutoDetect(fieldVisibility=JsonAutoDetect.Visibility.NONE, getterVisibility=JsonAutoDetect.Visibility.NONE, isGetterVisibility=JsonAutoDetect.Visibility.NONE)
public final  class SdtSdtMenu_ITEM_RESTInterface extends GxGenericCollectionItem<app.datamon.SdtSdtMenu_ITEM>
{
   public SdtSdtMenu_ITEM_RESTInterface( )
   {
      super(new app.datamon.SdtSdtMenu_ITEM ());
   }

   public SdtSdtMenu_ITEM_RESTInterface( app.datamon.SdtSdtMenu_ITEM psdt )
   {
      super(psdt);
   }

   @JsonProperty("ID")
   public Short getgxTv_SdtSdtMenu_ITEM_Id( )
   {
      return ((app.datamon.SdtSdtMenu_ITEM)getSdt()).getgxTv_SdtSdtMenu_ITEM_Id() ;
   }

   @JsonProperty("ID")
   public void setgxTv_SdtSdtMenu_ITEM_Id(  Short Value )
   {
      ((app.datamon.SdtSdtMenu_ITEM)getSdt()).setgxTv_SdtSdtMenu_ITEM_Id(Value);
   }


   @JsonProperty("URL")
   public String getgxTv_SdtSdtMenu_ITEM_Url( )
   {
      return GXutil.rtrim(((app.datamon.SdtSdtMenu_ITEM)getSdt()).getgxTv_SdtSdtMenu_ITEM_Url()) ;
   }

   @JsonProperty("URL")
   public void setgxTv_SdtSdtMenu_ITEM_Url(  String Value )
   {
      ((app.datamon.SdtSdtMenu_ITEM)getSdt()).setgxTv_SdtSdtMenu_ITEM_Url(Value);
   }


   @JsonProperty("TITLE")
   public String getgxTv_SdtSdtMenu_ITEM_Title( )
   {
      return GXutil.rtrim(((app.datamon.SdtSdtMenu_ITEM)getSdt()).getgxTv_SdtSdtMenu_ITEM_Title()) ;
   }

   @JsonProperty("TITLE")
   public void setgxTv_SdtSdtMenu_ITEM_Title(  String Value )
   {
      ((app.datamon.SdtSdtMenu_ITEM)getSdt()).setgxTv_SdtSdtMenu_ITEM_Title(Value);
   }


   @JsonProperty("DESCRIPTION")
   public String getgxTv_SdtSdtMenu_ITEM_Description( )
   {
      return GXutil.rtrim(((app.datamon.SdtSdtMenu_ITEM)getSdt()).getgxTv_SdtSdtMenu_ITEM_Description()) ;
   }

   @JsonProperty("DESCRIPTION")
   public void setgxTv_SdtSdtMenu_ITEM_Description(  String Value )
   {
      ((app.datamon.SdtSdtMenu_ITEM)getSdt()).setgxTv_SdtSdtMenu_ITEM_Description(Value);
   }


   @JsonProperty("FONTAWSOME")
   public String getgxTv_SdtSdtMenu_ITEM_Fontawsome( )
   {
      return GXutil.rtrim(((app.datamon.SdtSdtMenu_ITEM)getSdt()).getgxTv_SdtSdtMenu_ITEM_Fontawsome()) ;
   }

   @JsonProperty("FONTAWSOME")
   public void setgxTv_SdtSdtMenu_ITEM_Fontawsome(  String Value )
   {
      ((app.datamon.SdtSdtMenu_ITEM)getSdt()).setgxTv_SdtSdtMenu_ITEM_Fontawsome(Value);
   }


   @JsonProperty("BADGE")
   public Short getgxTv_SdtSdtMenu_ITEM_Badge( )
   {
      return ((app.datamon.SdtSdtMenu_ITEM)getSdt()).getgxTv_SdtSdtMenu_ITEM_Badge() ;
   }

   @JsonProperty("BADGE")
   public void setgxTv_SdtSdtMenu_ITEM_Badge(  Short Value )
   {
      ((app.datamon.SdtSdtMenu_ITEM)getSdt()).setgxTv_SdtSdtMenu_ITEM_Badge(Value);
   }


   @JsonProperty("COLOR")
   public String getgxTv_SdtSdtMenu_ITEM_Color( )
   {
      return GXutil.rtrim(((app.datamon.SdtSdtMenu_ITEM)getSdt()).getgxTv_SdtSdtMenu_ITEM_Color()) ;
   }

   @JsonProperty("COLOR")
   public void setgxTv_SdtSdtMenu_ITEM_Color(  String Value )
   {
      ((app.datamon.SdtSdtMenu_ITEM)getSdt()).setgxTv_SdtSdtMenu_ITEM_Color(Value);
   }


   @JsonProperty("IMAGE")
   public String getgxTv_SdtSdtMenu_ITEM_Image( )
   {
      return GXutil.getRelativeURL(((app.datamon.SdtSdtMenu_ITEM)getSdt()).getgxTv_SdtSdtMenu_ITEM_Image()) ;
   }

   @JsonProperty("IMAGE")
   public void setgxTv_SdtSdtMenu_ITEM_Image(  String Value )
   {
      ((app.datamon.SdtSdtMenu_ITEM)getSdt()).setgxTv_SdtSdtMenu_ITEM_Image(Value);
   }


   @JsonProperty("FAVORITO")
   public Boolean getgxTv_SdtSdtMenu_ITEM_Favorito( )
   {
      return ((app.datamon.SdtSdtMenu_ITEM)getSdt()).getgxTv_SdtSdtMenu_ITEM_Favorito() ;
   }

   @JsonProperty("FAVORITO")
   public void setgxTv_SdtSdtMenu_ITEM_Favorito(  Boolean Value )
   {
      ((app.datamon.SdtSdtMenu_ITEM)getSdt()).setgxTv_SdtSdtMenu_ITEM_Favorito(Value);
   }


   @JsonProperty("WINDOW")
   public Boolean getgxTv_SdtSdtMenu_ITEM_Window( )
   {
      return ((app.datamon.SdtSdtMenu_ITEM)getSdt()).getgxTv_SdtSdtMenu_ITEM_Window() ;
   }

   @JsonProperty("WINDOW")
   public void setgxTv_SdtSdtMenu_ITEM_Window(  Boolean Value )
   {
      ((app.datamon.SdtSdtMenu_ITEM)getSdt()).setgxTv_SdtSdtMenu_ITEM_Window(Value);
   }


   @JsonProperty("EXIBIR_FAVORITO")
   public Boolean getgxTv_SdtSdtMenu_ITEM_Exibir_favorito( )
   {
      return ((app.datamon.SdtSdtMenu_ITEM)getSdt()).getgxTv_SdtSdtMenu_ITEM_Exibir_favorito() ;
   }

   @JsonProperty("EXIBIR_FAVORITO")
   public void setgxTv_SdtSdtMenu_ITEM_Exibir_favorito(  Boolean Value )
   {
      ((app.datamon.SdtSdtMenu_ITEM)getSdt()).setgxTv_SdtSdtMenu_ITEM_Exibir_favorito(Value);
   }


   @JsonProperty("INFO")
   public Boolean getgxTv_SdtSdtMenu_ITEM_Info( )
   {
      return ((app.datamon.SdtSdtMenu_ITEM)getSdt()).getgxTv_SdtSdtMenu_ITEM_Info() ;
   }

   @JsonProperty("INFO")
   public void setgxTv_SdtSdtMenu_ITEM_Info(  Boolean Value )
   {
      ((app.datamon.SdtSdtMenu_ITEM)getSdt()).setgxTv_SdtSdtMenu_ITEM_Info(Value);
   }


   @JsonProperty("INFO_TEXT")
   public String getgxTv_SdtSdtMenu_ITEM_Info_text( )
   {
      return GXutil.rtrim(((app.datamon.SdtSdtMenu_ITEM)getSdt()).getgxTv_SdtSdtMenu_ITEM_Info_text()) ;
   }

   @JsonProperty("INFO_TEXT")
   public void setgxTv_SdtSdtMenu_ITEM_Info_text(  String Value )
   {
      ((app.datamon.SdtSdtMenu_ITEM)getSdt()).setgxTv_SdtSdtMenu_ITEM_Info_text(Value);
   }


   @JsonProperty("MNU_DISPLAY")
   public String getgxTv_SdtSdtMenu_ITEM_Mnu_display( )
   {
      return GXutil.rtrim(((app.datamon.SdtSdtMenu_ITEM)getSdt()).getgxTv_SdtSdtMenu_ITEM_Mnu_display()) ;
   }

   @JsonProperty("MNU_DISPLAY")
   public void setgxTv_SdtSdtMenu_ITEM_Mnu_display(  String Value )
   {
      ((app.datamon.SdtSdtMenu_ITEM)getSdt()).setgxTv_SdtSdtMenu_ITEM_Mnu_display(Value);
   }


   @JsonProperty("MNU_UPDATE")
   public String getgxTv_SdtSdtMenu_ITEM_Mnu_update( )
   {
      return GXutil.rtrim(((app.datamon.SdtSdtMenu_ITEM)getSdt()).getgxTv_SdtSdtMenu_ITEM_Mnu_update()) ;
   }

   @JsonProperty("MNU_UPDATE")
   public void setgxTv_SdtSdtMenu_ITEM_Mnu_update(  String Value )
   {
      ((app.datamon.SdtSdtMenu_ITEM)getSdt()).setgxTv_SdtSdtMenu_ITEM_Mnu_update(Value);
   }


   @JsonProperty("MNU_INSERT")
   public String getgxTv_SdtSdtMenu_ITEM_Mnu_insert( )
   {
      return GXutil.rtrim(((app.datamon.SdtSdtMenu_ITEM)getSdt()).getgxTv_SdtSdtMenu_ITEM_Mnu_insert()) ;
   }

   @JsonProperty("MNU_INSERT")
   public void setgxTv_SdtSdtMenu_ITEM_Mnu_insert(  String Value )
   {
      ((app.datamon.SdtSdtMenu_ITEM)getSdt()).setgxTv_SdtSdtMenu_ITEM_Mnu_insert(Value);
   }


   @JsonProperty("MNU_DELETE")
   public String getgxTv_SdtSdtMenu_ITEM_Mnu_delete( )
   {
      return GXutil.rtrim(((app.datamon.SdtSdtMenu_ITEM)getSdt()).getgxTv_SdtSdtMenu_ITEM_Mnu_delete()) ;
   }

   @JsonProperty("MNU_DELETE")
   public void setgxTv_SdtSdtMenu_ITEM_Mnu_delete(  String Value )
   {
      ((app.datamon.SdtSdtMenu_ITEM)getSdt()).setgxTv_SdtSdtMenu_ITEM_Mnu_delete(Value);
   }


   @JsonProperty("ITEMS")
   @JsonInclude(JsonInclude.Include.NON_EMPTY)
   public Vector<app.datamon.SdtSdtMenu_ITEM_RESTInterface> getgxTv_SdtSdtMenu_ITEM_Items( )
   {
      return SdtSdtMenu_ITEM_RESTInterfacefromGXObjectCollection(((app.datamon.SdtSdtMenu_ITEM)getSdt()).getgxTv_SdtSdtMenu_ITEM_Items()) ;
   }

   @JsonProperty("ITEMS")
   public void setgxTv_SdtSdtMenu_ITEM_Items(  Vector<app.datamon.SdtSdtMenu_ITEM_RESTInterface> Value )
   {
      ((app.datamon.SdtSdtMenu_ITEM)getSdt()).setgxTv_SdtSdtMenu_ITEM_Items(SdtSdtMenu_ITEM_RESTInterfacetoGXObjectCollection(Value));
   }


   int remoteHandle = -1;
   private GXBaseCollection<app.datamon.SdtSdtMenu_ITEM> SdtSdtMenu_ITEM_RESTInterfacetoGXObjectCollection( Vector<app.datamon.SdtSdtMenu_ITEM_RESTInterface> collection )
   {
      GXBaseCollection<app.datamon.SdtSdtMenu_ITEM> result = new GXBaseCollection<app.datamon.SdtSdtMenu_ITEM>(app.datamon.SdtSdtMenu_ITEM.class, "SdtMenu.ITEM", "TexplusNET.SdtMenu", remoteHandle);
      for (int i = 0; i < collection.size(); i++)
      {
         result.add((app.datamon.SdtSdtMenu_ITEM)collection.elementAt(i).getSdt());
      }
      return result ;
   }

   private Vector<app.datamon.SdtSdtMenu_ITEM_RESTInterface> SdtSdtMenu_ITEM_RESTInterfacefromGXObjectCollection( GXBaseCollection<app.datamon.SdtSdtMenu_ITEM> collection )
   {
      Vector<app.datamon.SdtSdtMenu_ITEM_RESTInterface> result = new Vector<app.datamon.SdtSdtMenu_ITEM_RESTInterface>();
      for (int i = 0; i < collection.size(); i++)
      {
         result.addElement(new app.datamon.SdtSdtMenu_ITEM_RESTInterface((app.datamon.SdtSdtMenu_ITEM)collection.elementAt(i)));
      }
      return result ;
   }

}

