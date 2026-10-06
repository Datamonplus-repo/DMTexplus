package app.formulaciontinte ;
import app.*;
import com.genexus.servlet.*;
import com.genexus.servlet.http.*;
import java.util.*;
import com.genexus.*;
import com.genexus.Application;
import com.genexus.ws.rs.core.*;

@jakarta.ws.rs.Path("/FormulacionTinte/ColorColorantes__WPGetFilterData")
public final  class colorcolorantes__wpgetfilterdata_services_rest extends GxRestService
{
   @jakarta.ws.rs.POST
   @jakarta.ws.rs.Consumes({jakarta.ws.rs.core.MediaType.APPLICATION_JSON})
   @jakarta.ws.rs.Produces({jakarta.ws.rs.core.MediaType.APPLICATION_JSON + ";charset=UTF-8"})
   public jakarta.ws.rs.core.Response execute( app.formulaciontinte.colorcolorantes__wpgetfilterdata_RESTInterfaceIN entity ) throws Exception
   {
      super.init( "POST" );
      String AV34DDOName;
      AV34DDOName = entity.getDDOName() ;
      String AV35SearchTxt;
      AV35SearchTxt = entity.getSearchTxt() ;
      String AV36SearchTxtTo;
      AV36SearchTxtTo = entity.getSearchTxtTo() ;
      String [] AV37OptionsJson = new String[] { "" };
      String [] AV38OptionsDescJson = new String[] { "" };
      String [] AV39OptionIndexesJson = new String[] { "" };
      if ( ! processHeaders("formulaciontinte.colorcolorantes__wpgetfilterdata",myServletRequestWrapper,myServletResponseWrapper) )
      {
         builder = Response.notModifiedWrapped();
         cleanup();
         return (jakarta.ws.rs.core.Response) builder.build() ;
      }
      try
      {
         app.formulaciontinte.colorcolorantes__wpgetfilterdata worker = new app.formulaciontinte.colorcolorantes__wpgetfilterdata(remoteHandle, context);
         worker.execute(AV34DDOName,AV35SearchTxt,AV36SearchTxtTo,AV37OptionsJson,AV38OptionsDescJson,AV39OptionIndexesJson );
         app.formulaciontinte.colorcolorantes__wpgetfilterdata_RESTInterfaceOUT data = new app.formulaciontinte.colorcolorantes__wpgetfilterdata_RESTInterfaceOUT();
         data.setOptionsJson(AV37OptionsJson[0]);
         data.setOptionsDescJson(AV38OptionsDescJson[0]);
         data.setOptionIndexesJson(AV39OptionIndexesJson[0]);
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

