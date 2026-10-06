package app.controlcalidadhtd ;
import app.*;
import com.genexus.servlet.*;
import com.genexus.servlet.http.*;
import java.util.*;
import com.genexus.*;
import com.genexus.Application;
import com.genexus.ws.rs.core.*;

@jakarta.ws.rs.Path("/ControlCalidadHTD/ControlCalidadVariableWWGetFilterData")
public final  class controlcalidadvariablewwgetfilterdata_services_rest extends GxRestService
{
   @jakarta.ws.rs.POST
   @jakarta.ws.rs.Consumes({jakarta.ws.rs.core.MediaType.APPLICATION_JSON})
   @jakarta.ws.rs.Produces({jakarta.ws.rs.core.MediaType.APPLICATION_JSON + ";charset=UTF-8"})
   public jakarta.ws.rs.core.Response execute( app.controlcalidadhtd.controlcalidadvariablewwgetfilterdata_RESTInterfaceIN entity ) throws Exception
   {
      super.init( "POST" );
      String AV60DDOName;
      AV60DDOName = entity.getDDOName() ;
      String AV61SearchTxt;
      AV61SearchTxt = entity.getSearchTxt() ;
      String AV62SearchTxtTo;
      AV62SearchTxtTo = entity.getSearchTxtTo() ;
      String [] AV63OptionsJson = new String[] { "" };
      String [] AV64OptionsDescJson = new String[] { "" };
      String [] AV65OptionIndexesJson = new String[] { "" };
      if ( ! processHeaders("controlcalidadhtd.controlcalidadvariablewwgetfilterdata",myServletRequestWrapper,myServletResponseWrapper) )
      {
         builder = Response.notModifiedWrapped();
         cleanup();
         return (jakarta.ws.rs.core.Response) builder.build() ;
      }
      try
      {
         app.controlcalidadhtd.controlcalidadvariablewwgetfilterdata worker = new app.controlcalidadhtd.controlcalidadvariablewwgetfilterdata(remoteHandle, context);
         worker.execute(AV60DDOName,AV61SearchTxt,AV62SearchTxtTo,AV63OptionsJson,AV64OptionsDescJson,AV65OptionIndexesJson );
         app.controlcalidadhtd.controlcalidadvariablewwgetfilterdata_RESTInterfaceOUT data = new app.controlcalidadhtd.controlcalidadvariablewwgetfilterdata_RESTInterfaceOUT();
         data.setOptionsJson(AV63OptionsJson[0]);
         data.setOptionsDescJson(AV64OptionsDescJson[0]);
         data.setOptionIndexesJson(AV65OptionIndexesJson[0]);
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

