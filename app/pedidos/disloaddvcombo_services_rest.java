package app.pedidos ;
import app.*;
import com.genexus.servlet.*;
import com.genexus.servlet.http.*;
import java.util.*;
import com.genexus.*;
import com.genexus.Application;
import com.genexus.ws.rs.core.*;

@jakarta.ws.rs.Path("/Pedidos/DisLoadDVCombo")
public final  class disloaddvcombo_services_rest extends GxRestService
{
   @jakarta.ws.rs.POST
   @jakarta.ws.rs.Consumes({jakarta.ws.rs.core.MediaType.APPLICATION_JSON})
   @jakarta.ws.rs.Produces({jakarta.ws.rs.core.MediaType.APPLICATION_JSON + ";charset=UTF-8"})
   public jakarta.ws.rs.core.Response execute( app.pedidos.disloaddvcombo_RESTInterfaceIN entity ) throws Exception
   {
      super.init( "POST" );
      String AV12ComboName;
      AV12ComboName = entity.getComboName() ;
      String AV13TrnMode;
      AV13TrnMode = entity.getTrnMode() ;
      String AV14EmprCod;
      AV14EmprCod = entity.getEmprCod() ;
      int AV15DisCod;
      AV15DisCod = (int)(GXutil.lval( entity.getDisCod())) ;
      String [] AV16SelectedValue = new String[] { "" };
      @SuppressWarnings("unchecked")
      GXBaseCollection<app.wwpbaseobjects.SdtDVB_SDTComboData_Item> [] AV10Combo_Data = new GXBaseCollection[] { new GXBaseCollection<app.wwpbaseobjects.SdtDVB_SDTComboData_Item>() };
      if ( ! processHeaders("pedidos.disloaddvcombo",myServletRequestWrapper,myServletResponseWrapper) )
      {
         builder = Response.notModifiedWrapped();
         cleanup();
         return (jakarta.ws.rs.core.Response) builder.build() ;
      }
      try
      {
         app.pedidos.disloaddvcombo worker = new app.pedidos.disloaddvcombo(remoteHandle, context);
         worker.execute(AV12ComboName,AV13TrnMode,AV14EmprCod,AV15DisCod,AV16SelectedValue,AV10Combo_Data );
         app.pedidos.disloaddvcombo_RESTInterfaceOUT data = new app.pedidos.disloaddvcombo_RESTInterfaceOUT();
         data.setSelectedValue(AV16SelectedValue[0]);
         data.setCombo_Data(SdtDVB_SDTComboData_Item_RESTInterfacefromGXObjectCollection(AV10Combo_Data[0]));
         builder = Response.okWrapped(data);
         cleanup();
         return (jakarta.ws.rs.core.Response) builder.build() ;
      }
      catch ( Exception e )
      {
         cleanup();
         throw e;
      }
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

   protected boolean IntegratedSecurityEnabled( )
   {
      return false;
   }

   protected int IntegratedSecurityLevel( )
   {
      return 0;
   }

}

