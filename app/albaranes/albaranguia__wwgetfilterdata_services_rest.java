package app.albaranes ;
import app.*;
import com.genexus.servlet.*;
import com.genexus.servlet.http.*;
import java.util.*;
import com.genexus.*;
import com.genexus.Application;
import com.genexus.ws.rs.core.*;

@jakarta.ws.rs.Path("/Albaranes/AlbaranGuia__WWGetFilterData")
public final  class albaranguia__wwgetfilterdata_services_rest extends GxRestService
{
   @jakarta.ws.rs.POST
   @jakarta.ws.rs.Consumes({jakarta.ws.rs.core.MediaType.APPLICATION_JSON})
   @jakarta.ws.rs.Produces({jakarta.ws.rs.core.MediaType.APPLICATION_JSON + ";charset=UTF-8"})
   public jakarta.ws.rs.core.Response execute( app.albaranes.albaranguia__wwgetfilterdata_RESTInterfaceIN entity ) throws Exception
   {
      super.init( "POST" );
      String AV76DDOName;
      AV76DDOName = entity.getDDOName() ;
      String AV77SearchTxt;
      AV77SearchTxt = entity.getSearchTxt() ;
      String AV78SearchTxtTo;
      AV78SearchTxtTo = entity.getSearchTxtTo() ;
      String [] AV79OptionsJson = new String[] { "" };
      String [] AV80OptionsDescJson = new String[] { "" };
      String [] AV81OptionIndexesJson = new String[] { "" };
      if ( ! processHeaders("albaranes.albaranguia__wwgetfilterdata",myServletRequestWrapper,myServletResponseWrapper) )
      {
         builder = Response.notModifiedWrapped();
         cleanup();
         return (jakarta.ws.rs.core.Response) builder.build() ;
      }
      try
      {
         app.albaranes.albaranguia__wwgetfilterdata worker = new app.albaranes.albaranguia__wwgetfilterdata(remoteHandle, context);
         worker.execute(AV76DDOName,AV77SearchTxt,AV78SearchTxtTo,AV79OptionsJson,AV80OptionsDescJson,AV81OptionIndexesJson );
         app.albaranes.albaranguia__wwgetfilterdata_RESTInterfaceOUT data = new app.albaranes.albaranguia__wwgetfilterdata_RESTInterfaceOUT();
         data.setOptionsJson(AV79OptionsJson[0]);
         data.setOptionsDescJson(AV80OptionsDescJson[0]);
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

