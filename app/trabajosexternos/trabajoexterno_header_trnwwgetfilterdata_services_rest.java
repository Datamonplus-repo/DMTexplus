package app.trabajosexternos ;
import app.*;
import com.genexus.servlet.*;
import com.genexus.servlet.http.*;
import java.util.*;
import com.genexus.*;
import com.genexus.Application;
import com.genexus.ws.rs.core.*;

@jakarta.ws.rs.Path("/TrabajosExternos/TrabajoExterno_Header_TRNWWGetFilterData")
public final  class trabajoexterno_header_trnwwgetfilterdata_services_rest extends GxRestService
{
   @jakarta.ws.rs.POST
   @jakarta.ws.rs.Consumes({jakarta.ws.rs.core.MediaType.APPLICATION_JSON})
   @jakarta.ws.rs.Produces({jakarta.ws.rs.core.MediaType.APPLICATION_JSON + ";charset=UTF-8"})
   public jakarta.ws.rs.core.Response execute( app.trabajosexternos.trabajoexterno_header_trnwwgetfilterdata_RESTInterfaceIN entity ) throws Exception
   {
      super.init( "POST" );
      String AV37DDOName;
      AV37DDOName = entity.getDDOName() ;
      String AV38SearchTxt;
      AV38SearchTxt = entity.getSearchTxt() ;
      String AV39SearchTxtTo;
      AV39SearchTxtTo = entity.getSearchTxtTo() ;
      String [] AV40OptionsJson = new String[] { "" };
      String [] AV41OptionsDescJson = new String[] { "" };
      String [] AV42OptionIndexesJson = new String[] { "" };
      if ( ! processHeaders("trabajosexternos.trabajoexterno_header_trnwwgetfilterdata",myServletRequestWrapper,myServletResponseWrapper) )
      {
         builder = Response.notModifiedWrapped();
         cleanup();
         return (jakarta.ws.rs.core.Response) builder.build() ;
      }
      try
      {
         app.trabajosexternos.trabajoexterno_header_trnwwgetfilterdata worker = new app.trabajosexternos.trabajoexterno_header_trnwwgetfilterdata(remoteHandle, context);
         worker.execute(AV37DDOName,AV38SearchTxt,AV39SearchTxtTo,AV40OptionsJson,AV41OptionsDescJson,AV42OptionIndexesJson );
         app.trabajosexternos.trabajoexterno_header_trnwwgetfilterdata_RESTInterfaceOUT data = new app.trabajosexternos.trabajoexterno_header_trnwwgetfilterdata_RESTInterfaceOUT();
         data.setOptionsJson(AV40OptionsJson[0]);
         data.setOptionsDescJson(AV41OptionsDescJson[0]);
         data.setOptionIndexesJson(AV42OptionIndexesJson[0]);
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

