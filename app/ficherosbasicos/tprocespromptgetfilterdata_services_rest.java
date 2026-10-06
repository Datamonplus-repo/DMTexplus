package app.ficherosbasicos ;
import app.*;
import com.genexus.servlet.*;
import com.genexus.servlet.http.*;
import java.util.*;
import com.genexus.*;
import com.genexus.Application;
import com.genexus.ws.rs.core.*;

@jakarta.ws.rs.Path("/FicherosBasicos/TPROCESPromptGetFilterData")
public final  class tprocespromptgetfilterdata_services_rest extends GxRestService
{
   @jakarta.ws.rs.POST
   @jakarta.ws.rs.Consumes({jakarta.ws.rs.core.MediaType.APPLICATION_JSON})
   @jakarta.ws.rs.Produces({jakarta.ws.rs.core.MediaType.APPLICATION_JSON + ";charset=UTF-8"})
   public jakarta.ws.rs.core.Response execute( app.ficherosbasicos.tprocespromptgetfilterdata_RESTInterfaceIN entity ) throws Exception
   {
      super.init( "POST" );
      String AV31DDOName;
      AV31DDOName = entity.getDDOName() ;
      String AV32SearchTxt;
      AV32SearchTxt = entity.getSearchTxt() ;
      String AV33SearchTxtTo;
      AV33SearchTxtTo = entity.getSearchTxtTo() ;
      String [] AV34OptionsJson = new String[] { "" };
      String [] AV35OptionsDescJson = new String[] { "" };
      String [] AV36OptionIndexesJson = new String[] { "" };
      if ( ! processHeaders("ficherosbasicos.tprocespromptgetfilterdata",myServletRequestWrapper,myServletResponseWrapper) )
      {
         builder = Response.notModifiedWrapped();
         cleanup();
         return (jakarta.ws.rs.core.Response) builder.build() ;
      }
      try
      {
         app.ficherosbasicos.tprocespromptgetfilterdata worker = new app.ficherosbasicos.tprocespromptgetfilterdata(remoteHandle, context);
         worker.execute(AV31DDOName,AV32SearchTxt,AV33SearchTxtTo,AV34OptionsJson,AV35OptionsDescJson,AV36OptionIndexesJson );
         app.ficherosbasicos.tprocespromptgetfilterdata_RESTInterfaceOUT data = new app.ficherosbasicos.tprocespromptgetfilterdata_RESTInterfaceOUT();
         data.setOptionsJson(AV34OptionsJson[0]);
         data.setOptionsDescJson(AV35OptionsDescJson[0]);
         data.setOptionIndexesJson(AV36OptionIndexesJson[0]);
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

