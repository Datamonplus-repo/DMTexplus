package app.formulaciontinte ;
import app.*;
import com.genexus.servlet.*;
import com.genexus.servlet.http.*;
import java.util.*;
import com.genexus.*;
import com.genexus.Application;
import com.genexus.ws.rs.core.*;

@jakarta.ws.rs.Path("/FormulacionTinte/VerAnyadidasGetFilterData")
public final  class veranyadidasgetfilterdata_services_rest extends GxRestService
{
   @jakarta.ws.rs.POST
   @jakarta.ws.rs.Consumes({jakarta.ws.rs.core.MediaType.APPLICATION_JSON})
   @jakarta.ws.rs.Produces({jakarta.ws.rs.core.MediaType.APPLICATION_JSON + ";charset=UTF-8"})
   public jakarta.ws.rs.core.Response execute( app.formulaciontinte.veranyadidasgetfilterdata_RESTInterfaceIN entity ) throws Exception
   {
      super.init( "POST" );
      String AV35DDOName;
      AV35DDOName = entity.getDDOName() ;
      String AV36SearchTxt;
      AV36SearchTxt = entity.getSearchTxt() ;
      String AV37SearchTxtTo;
      AV37SearchTxtTo = entity.getSearchTxtTo() ;
      String [] AV38OptionsJson = new String[] { "" };
      String [] AV39OptionsDescJson = new String[] { "" };
      String [] AV40OptionIndexesJson = new String[] { "" };
      if ( ! processHeaders("formulaciontinte.veranyadidasgetfilterdata",myServletRequestWrapper,myServletResponseWrapper) )
      {
         builder = Response.notModifiedWrapped();
         cleanup();
         return (jakarta.ws.rs.core.Response) builder.build() ;
      }
      try
      {
         app.formulaciontinte.veranyadidasgetfilterdata worker = new app.formulaciontinte.veranyadidasgetfilterdata(remoteHandle, context);
         worker.execute(AV35DDOName,AV36SearchTxt,AV37SearchTxtTo,AV38OptionsJson,AV39OptionsDescJson,AV40OptionIndexesJson );
         app.formulaciontinte.veranyadidasgetfilterdata_RESTInterfaceOUT data = new app.formulaciontinte.veranyadidasgetfilterdata_RESTInterfaceOUT();
         data.setOptionsJson(AV38OptionsJson[0]);
         data.setOptionsDescJson(AV39OptionsDescJson[0]);
         data.setOptionIndexesJson(AV40OptionIndexesJson[0]);
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

