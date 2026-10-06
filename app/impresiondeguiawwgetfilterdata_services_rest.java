package app ;
import app.*;
import com.genexus.servlet.*;
import com.genexus.servlet.http.*;
import java.util.*;
import com.genexus.*;
import com.genexus.Application;
import com.genexus.ws.rs.core.*;

@jakarta.ws.rs.Path("/ImpresionDeGuiawwGetFilterData")
public final  class impresiondeguiawwgetfilterdata_services_rest extends GxRestService
{
   @jakarta.ws.rs.POST
   @jakarta.ws.rs.Consumes({jakarta.ws.rs.core.MediaType.APPLICATION_JSON})
   @jakarta.ws.rs.Produces({jakarta.ws.rs.core.MediaType.APPLICATION_JSON + ";charset=UTF-8"})
   public jakarta.ws.rs.core.Response execute( app.impresiondeguiawwgetfilterdata_RESTInterfaceIN entity ) throws Exception
   {
      super.init( "POST" );
      String AV121DDOName;
      AV121DDOName = entity.getDDOName() ;
      String AV122SearchTxt;
      AV122SearchTxt = entity.getSearchTxt() ;
      String AV123SearchTxtTo;
      AV123SearchTxtTo = entity.getSearchTxtTo() ;
      String [] AV124OptionsJson = new String[] { "" };
      String [] AV125OptionsDescJson = new String[] { "" };
      String [] AV126OptionIndexesJson = new String[] { "" };
      if ( ! processHeaders("impresiondeguiawwgetfilterdata",myServletRequestWrapper,myServletResponseWrapper) )
      {
         builder = Response.notModifiedWrapped();
         cleanup();
         return (jakarta.ws.rs.core.Response) builder.build() ;
      }
      try
      {
         app.impresiondeguiawwgetfilterdata worker = new app.impresiondeguiawwgetfilterdata(remoteHandle, context);
         worker.execute(AV121DDOName,AV122SearchTxt,AV123SearchTxtTo,AV124OptionsJson,AV125OptionsDescJson,AV126OptionIndexesJson );
         app.impresiondeguiawwgetfilterdata_RESTInterfaceOUT data = new app.impresiondeguiawwgetfilterdata_RESTInterfaceOUT();
         data.setOptionsJson(AV124OptionsJson[0]);
         data.setOptionsDescJson(AV125OptionsDescJson[0]);
         data.setOptionIndexesJson(AV126OptionIndexesJson[0]);
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

