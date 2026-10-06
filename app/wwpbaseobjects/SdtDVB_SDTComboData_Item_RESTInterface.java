package app.wwpbaseobjects ;
import app.*;
import com.genexus.*;
import com.fasterxml.jackson.annotation.*;
import java.util.*;

@jakarta.xml.bind.annotation.XmlType(name = "DVB_SDTComboData.Item", namespace ="")
@JsonPropertyOrder(alphabetic=true)
@JsonAutoDetect(fieldVisibility=JsonAutoDetect.Visibility.NONE, getterVisibility=JsonAutoDetect.Visibility.NONE, isGetterVisibility=JsonAutoDetect.Visibility.NONE)
public final  class SdtDVB_SDTComboData_Item_RESTInterface extends GxGenericCollectionItem<app.wwpbaseobjects.SdtDVB_SDTComboData_Item>
{
   public SdtDVB_SDTComboData_Item_RESTInterface( )
   {
      super(new app.wwpbaseobjects.SdtDVB_SDTComboData_Item ());
   }

   public SdtDVB_SDTComboData_Item_RESTInterface( app.wwpbaseobjects.SdtDVB_SDTComboData_Item psdt )
   {
      super(psdt);
   }

   @JsonProperty("ID")
   public String getgxTv_SdtDVB_SDTComboData_Item_Id( )
   {
      return GXutil.rtrim(((app.wwpbaseobjects.SdtDVB_SDTComboData_Item)getSdt()).getgxTv_SdtDVB_SDTComboData_Item_Id()) ;
   }

   @JsonProperty("ID")
   public void setgxTv_SdtDVB_SDTComboData_Item_Id(  String Value )
   {
      ((app.wwpbaseobjects.SdtDVB_SDTComboData_Item)getSdt()).setgxTv_SdtDVB_SDTComboData_Item_Id(Value);
   }


   @JsonProperty("T")
   public String getgxTv_SdtDVB_SDTComboData_Item_Title( )
   {
      return GXutil.rtrim(((app.wwpbaseobjects.SdtDVB_SDTComboData_Item)getSdt()).getgxTv_SdtDVB_SDTComboData_Item_Title()) ;
   }

   @JsonProperty("T")
   public void setgxTv_SdtDVB_SDTComboData_Item_Title(  String Value )
   {
      ((app.wwpbaseobjects.SdtDVB_SDTComboData_Item)getSdt()).setgxTv_SdtDVB_SDTComboData_Item_Title(Value);
   }


   @JsonProperty("Type")
   public String getgxTv_SdtDVB_SDTComboData_Item_Type( )
   {
      return GXutil.rtrim(((app.wwpbaseobjects.SdtDVB_SDTComboData_Item)getSdt()).getgxTv_SdtDVB_SDTComboData_Item_Type()) ;
   }

   @JsonProperty("Type")
   public void setgxTv_SdtDVB_SDTComboData_Item_Type(  String Value )
   {
      ((app.wwpbaseobjects.SdtDVB_SDTComboData_Item)getSdt()).setgxTv_SdtDVB_SDTComboData_Item_Type(Value);
   }


   @JsonProperty("C")
   @JsonInclude(JsonInclude.Include.NON_EMPTY)
   public Vector<app.wwpbaseobjects.SdtDVB_SDTComboData_Item_RESTInterface> getgxTv_SdtDVB_SDTComboData_Item_Children( )
   {
      return SdtDVB_SDTComboData_Item_RESTInterfacefromGXObjectCollection(((app.wwpbaseobjects.SdtDVB_SDTComboData_Item)getSdt()).getgxTv_SdtDVB_SDTComboData_Item_Children()) ;
   }

   @JsonProperty("C")
   public void setgxTv_SdtDVB_SDTComboData_Item_Children(  Vector<app.wwpbaseobjects.SdtDVB_SDTComboData_Item_RESTInterface> Value )
   {
      ((app.wwpbaseobjects.SdtDVB_SDTComboData_Item)getSdt()).setgxTv_SdtDVB_SDTComboData_Item_Children(SdtDVB_SDTComboData_Item_RESTInterfacetoGXObjectCollection(Value));
   }


   int remoteHandle = -1;
   private GXBaseCollection<app.wwpbaseobjects.SdtDVB_SDTComboData_Item> SdtDVB_SDTComboData_Item_RESTInterfacetoGXObjectCollection( Vector<app.wwpbaseobjects.SdtDVB_SDTComboData_Item_RESTInterface> collection )
   {
      GXBaseCollection<app.wwpbaseobjects.SdtDVB_SDTComboData_Item> result = new GXBaseCollection<app.wwpbaseobjects.SdtDVB_SDTComboData_Item>(app.wwpbaseobjects.SdtDVB_SDTComboData_Item.class, "DVB_SDTComboData.Item", ".DVB_SDTComboData", remoteHandle);
      for (int i = 0; i < collection.size(); i++)
      {
         result.add((app.wwpbaseobjects.SdtDVB_SDTComboData_Item)collection.elementAt(i).getSdt());
      }
      return result ;
   }

   private Vector<app.wwpbaseobjects.SdtDVB_SDTComboData_Item_RESTInterface> SdtDVB_SDTComboData_Item_RESTInterfacefromGXObjectCollection( GXBaseCollection<app.wwpbaseobjects.SdtDVB_SDTComboData_Item> collection )
   {
      Vector<app.wwpbaseobjects.SdtDVB_SDTComboData_Item_RESTInterface> result = new Vector<app.wwpbaseobjects.SdtDVB_SDTComboData_Item_RESTInterface>();
      for (int i = 0; i < collection.size(); i++)
      {
         result.addElement(new app.wwpbaseobjects.SdtDVB_SDTComboData_Item_RESTInterface((app.wwpbaseobjects.SdtDVB_SDTComboData_Item)collection.elementAt(i)));
      }
      return result ;
   }

}

