package app ;
import app.*;
import com.genexus.servlet.*;
import com.genexus.servlet.http.*;
import java.util.*;
import com.genexus.*;
import com.genexus.Application;
import com.genexus.ws.rs.core.*;

@jakarta.ws.rs.Path("/WebDatosPedidoColorGetFilterData")
public final  class webdatospedidocolorgetfilterdata_services_rest extends GxRestService
{
   @jakarta.ws.rs.POST
   @jakarta.ws.rs.Consumes({jakarta.ws.rs.core.MediaType.APPLICATION_JSON})
   @jakarta.ws.rs.Produces({jakarta.ws.rs.core.MediaType.APPLICATION_JSON + ";charset=UTF-8"})
   public jakarta.ws.rs.core.Response execute( app.webdatospedidocolorgetfilterdata_RESTInterfaceIN entity ) throws Exception
   {
      super.init( "POST" );
      String AV72DDOName;
      AV72DDOName = entity.getDDOName() ;
      String AV70SearchTxt;
      AV70SearchTxt = entity.getSearchTxt() ;
      String AV71SearchTxtTo;
      AV71SearchTxtTo = entity.getSearchTxtTo() ;
      String [] AV76OptionsJson = new String[] { "" };
      String [] AV79OptionsDescJson = new String[] { "" };
      String [] AV81OptionIndexesJson = new String[] { "" };
      if ( ! processHeaders("webdatospedidocolorgetfilterdata",myServletRequestWrapper,myServletResponseWrapper) )
      {
         builder = Response.notModifiedWrapped();
         cleanup();
         return (jakarta.ws.rs.core.Response) builder.build() ;
      }
      try
      {
         app.webdatospedidocolorgetfilterdata worker = new app.webdatospedidocolorgetfilterdata(remoteHandle, context);
         worker.execute(AV72DDOName,AV70SearchTxt,AV71SearchTxtTo,AV76OptionsJson,AV79OptionsDescJson,AV81OptionIndexesJson );
         app.webdatospedidocolorgetfilterdata_RESTInterfaceOUT data = new app.webdatospedidocolorgetfilterdata_RESTInterfaceOUT();
         data.setOptionsJson(AV76OptionsJson[0]);
         data.setOptionsDescJson(AV79OptionsDescJson[0]);
         data.setOptionIndexesJson(AV81OptionIndexesJson[0]);
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

