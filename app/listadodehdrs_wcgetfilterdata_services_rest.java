package app ;
import app.*;
import com.genexus.servlet.*;
import com.genexus.servlet.http.*;
import java.util.*;
import com.genexus.*;
import com.genexus.Application;
import com.genexus.ws.rs.core.*;

@jakarta.ws.rs.Path("/ListadodeHDRs_WCGetFilterData")
public final  class listadodehdrs_wcgetfilterdata_services_rest extends GxRestService
{
   @jakarta.ws.rs.POST
   @jakarta.ws.rs.Consumes({jakarta.ws.rs.core.MediaType.APPLICATION_JSON})
   @jakarta.ws.rs.Produces({jakarta.ws.rs.core.MediaType.APPLICATION_JSON + ";charset=UTF-8"})
   public jakarta.ws.rs.core.Response execute( app.listadodehdrs_wcgetfilterdata_RESTInterfaceIN entity ) throws Exception
   {
      super.init( "POST" );
      String AV48DDOName;
      AV48DDOName = entity.getDDOName() ;
      String AV46SearchTxt;
      AV46SearchTxt = entity.getSearchTxt() ;
      String AV47SearchTxtTo;
      AV47SearchTxtTo = entity.getSearchTxtTo() ;
      String [] AV52OptionsJson = new String[] { "" };
      String [] AV55OptionsDescJson = new String[] { "" };
      String [] AV57OptionIndexesJson = new String[] { "" };
      if ( ! processHeaders("listadodehdrs_wcgetfilterdata",myServletRequestWrapper,myServletResponseWrapper) )
      {
         builder = Response.notModifiedWrapped();
         cleanup();
         return (jakarta.ws.rs.core.Response) builder.build() ;
      }
      try
      {
         app.listadodehdrs_wcgetfilterdata worker = new app.listadodehdrs_wcgetfilterdata(remoteHandle, context);
         worker.execute(AV48DDOName,AV46SearchTxt,AV47SearchTxtTo,AV52OptionsJson,AV55OptionsDescJson,AV57OptionIndexesJson );
         app.listadodehdrs_wcgetfilterdata_RESTInterfaceOUT data = new app.listadodehdrs_wcgetfilterdata_RESTInterfaceOUT();
         data.setOptionsJson(AV52OptionsJson[0]);
         data.setOptionsDescJson(AV55OptionsDescJson[0]);
         data.setOptionIndexesJson(AV57OptionIndexesJson[0]);
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

