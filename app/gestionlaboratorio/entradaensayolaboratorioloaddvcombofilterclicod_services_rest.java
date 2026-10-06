package app.gestionlaboratorio ;
import app.*;
import com.genexus.servlet.*;
import com.genexus.servlet.http.*;
import java.util.*;
import com.genexus.*;
import com.genexus.Application;
import com.genexus.ws.rs.core.*;

@jakarta.ws.rs.Path("/GestionLaboratorio/EntradaEnsayoLaboratorioLoadDVComboFilterClicod")
public final  class entradaensayolaboratorioloaddvcombofilterclicod_services_rest extends GxRestService
{
   @jakarta.ws.rs.POST
   @jakarta.ws.rs.Consumes({jakarta.ws.rs.core.MediaType.APPLICATION_JSON})
   @jakarta.ws.rs.Produces({jakarta.ws.rs.core.MediaType.APPLICATION_JSON + ";charset=UTF-8"})
   public jakarta.ws.rs.core.Response execute( app.gestionlaboratorio.entradaensayolaboratorioloaddvcombofilterclicod_RESTInterfaceIN entity ) throws Exception
   {
      super.init( "POST" );
      String AV13ComboName;
      AV13ComboName = entity.getComboName() ;
      String AV15TrnMode;
      AV15TrnMode = entity.getTrnMode() ;
      String AV17EmprCod;
      AV17EmprCod = entity.getEmprCod() ;
      int AV28CliCod;
      AV28CliCod = entity.getCliCod() ;
      int AV18Lb_numero;
      AV18Lb_numero = (int)(GXutil.lval( entity.getLb_numero())) ;
      String [] AV12SelectedValue = new String[] { "" };
      @SuppressWarnings("unchecked")
      GXBaseCollection<app.wwpbaseobjects.SdtDVB_SDTComboData_Item> [] AV10Combo_Data = new GXBaseCollection[] { new GXBaseCollection<app.wwpbaseobjects.SdtDVB_SDTComboData_Item>() };
      if ( ! processHeaders("gestionlaboratorio.entradaensayolaboratorioloaddvcombofilterclicod",myServletRequestWrapper,myServletResponseWrapper) )
      {
         builder = Response.notModifiedWrapped();
         cleanup();
         return (jakarta.ws.rs.core.Response) builder.build() ;
      }
      try
      {
         app.gestionlaboratorio.entradaensayolaboratorioloaddvcombofilterclicod worker = new app.gestionlaboratorio.entradaensayolaboratorioloaddvcombofilterclicod(remoteHandle, context);
         worker.execute(AV13ComboName,AV15TrnMode,AV17EmprCod,AV28CliCod,AV18Lb_numero,AV12SelectedValue,AV10Combo_Data );
         app.gestionlaboratorio.entradaensayolaboratorioloaddvcombofilterclicod_RESTInterfaceOUT data = new app.gestionlaboratorio.entradaensayolaboratorioloaddvcombofilterclicod_RESTInterfaceOUT();
         data.setSelectedValue(AV12SelectedValue[0]);
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

