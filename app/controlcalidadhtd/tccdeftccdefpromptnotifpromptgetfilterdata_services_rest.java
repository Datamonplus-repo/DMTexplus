package app.controlcalidadhtd ;
import app.*;
import com.genexus.servlet.*;
import com.genexus.servlet.http.*;
import java.util.*;
import com.genexus.*;
import com.genexus.Application;
import com.genexus.ws.rs.core.*;

@jakarta.ws.rs.Path("/ControlCalidadHTD/TCCDefTCCDEFPromptNotifPromptGetFilterData")
public final  class tccdeftccdefpromptnotifpromptgetfilterdata_services_rest extends GxRestService
{
   @jakarta.ws.rs.POST
   @jakarta.ws.rs.Consumes({jakarta.ws.rs.core.MediaType.APPLICATION_JSON})
   @jakarta.ws.rs.Produces({jakarta.ws.rs.core.MediaType.APPLICATION_JSON + ";charset=UTF-8"})
   public jakarta.ws.rs.core.Response execute( app.controlcalidadhtd.tccdeftccdefpromptnotifpromptgetfilterdata_RESTInterfaceIN entity ) throws Exception
   {
      super.init( "POST" );
      String AV32DDOName;
      AV32DDOName = entity.getDDOName() ;
      String AV33SearchTxt;
      AV33SearchTxt = entity.getSearchTxt() ;
      String AV34SearchTxtTo;
      AV34SearchTxtTo = entity.getSearchTxtTo() ;
      String [] AV35OptionsJson = new String[] { "" };
      String [] AV36OptionsDescJson = new String[] { "" };
      String [] AV37OptionIndexesJson = new String[] { "" };
      if ( ! processHeaders("controlcalidadhtd.tccdeftccdefpromptnotifpromptgetfilterdata",myServletRequestWrapper,myServletResponseWrapper) )
      {
         builder = Response.notModifiedWrapped();
         cleanup();
         return (jakarta.ws.rs.core.Response) builder.build() ;
      }
      try
      {
         app.controlcalidadhtd.tccdeftccdefpromptnotifpromptgetfilterdata worker = new app.controlcalidadhtd.tccdeftccdefpromptnotifpromptgetfilterdata(remoteHandle, context);
         worker.execute(AV32DDOName,AV33SearchTxt,AV34SearchTxtTo,AV35OptionsJson,AV36OptionsDescJson,AV37OptionIndexesJson );
         app.controlcalidadhtd.tccdeftccdefpromptnotifpromptgetfilterdata_RESTInterfaceOUT data = new app.controlcalidadhtd.tccdeftccdefpromptnotifpromptgetfilterdata_RESTInterfaceOUT();
         data.setOptionsJson(AV35OptionsJson[0]);
         data.setOptionsDescJson(AV36OptionsDescJson[0]);
         data.setOptionIndexesJson(AV37OptionIndexesJson[0]);
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

