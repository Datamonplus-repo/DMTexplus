package app.albaranes ;
import app.*;
import com.genexus.servlet.*;
import com.genexus.servlet.http.*;
import java.util.*;
import com.genexus.*;
import com.genexus.Application;
import com.genexus.ws.rs.core.*;

@jakarta.ws.rs.Path("/Albaranes/AlbaranGuia_PromptLoadDVCombo")
public final  class albaranguia_promptloaddvcombo_services_rest extends GxRestService
{
   @jakarta.ws.rs.POST
   @jakarta.ws.rs.Consumes({jakarta.ws.rs.core.MediaType.APPLICATION_JSON})
   @jakarta.ws.rs.Produces({jakarta.ws.rs.core.MediaType.APPLICATION_JSON + ";charset=UTF-8"})
   public jakarta.ws.rs.core.Response execute( app.albaranes.albaranguia_promptloaddvcombo_RESTInterfaceIN entity ) throws Exception
   {
      super.init( "POST" );
      String AV14ComboName;
      AV14ComboName = entity.getComboName() ;
      String AV15TrnMode;
      AV15TrnMode = entity.getTrnMode() ;
      String AV11SearchTxt;
      AV11SearchTxt = entity.getSearchTxt() ;
      String [] AV16Combo_DataJson = new String[] { "" };
      if ( ! processHeaders("albaranes.albaranguia_promptloaddvcombo",myServletRequestWrapper,myServletResponseWrapper) )
      {
         builder = Response.notModifiedWrapped();
         cleanup();
         return (jakarta.ws.rs.core.Response) builder.build() ;
      }
      try
      {
         app.albaranes.albaranguia_promptloaddvcombo worker = new app.albaranes.albaranguia_promptloaddvcombo(remoteHandle, context);
         worker.execute(AV14ComboName,AV15TrnMode,AV11SearchTxt,AV16Combo_DataJson );
         app.albaranes.albaranguia_promptloaddvcombo_RESTInterfaceOUT data = new app.albaranes.albaranguia_promptloaddvcombo_RESTInterfaceOUT();
         data.setCombo_DataJson(AV16Combo_DataJson[0]);
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

   protected boolean IntegratedSecurityEnabled( )
   {
      return false;
   }

   protected int IntegratedSecurityLevel( )
   {
      return 0;
   }

}

