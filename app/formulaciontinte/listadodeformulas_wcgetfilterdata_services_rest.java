package app.formulaciontinte ;
import app.*;
import com.genexus.servlet.*;
import com.genexus.servlet.http.*;
import java.util.*;
import com.genexus.*;
import com.genexus.Application;
import com.genexus.ws.rs.core.*;

@jakarta.ws.rs.Path("/FormulacionTinte/ListadodeFormulas_WCGetFilterData")
public final  class listadodeformulas_wcgetfilterdata_services_rest extends GxRestService
{
   @jakarta.ws.rs.POST
   @jakarta.ws.rs.Consumes({jakarta.ws.rs.core.MediaType.APPLICATION_JSON})
   @jakarta.ws.rs.Produces({jakarta.ws.rs.core.MediaType.APPLICATION_JSON + ";charset=UTF-8"})
   public jakarta.ws.rs.core.Response execute( app.formulaciontinte.listadodeformulas_wcgetfilterdata_RESTInterfaceIN entity ) throws Exception
   {
      super.init( "POST" );
      String AV136DDOName;
      AV136DDOName = entity.getDDOName() ;
      String AV134SearchTxt;
      AV134SearchTxt = entity.getSearchTxt() ;
      String AV135SearchTxtTo;
      AV135SearchTxtTo = entity.getSearchTxtTo() ;
      String [] AV140OptionsJson = new String[] { "" };
      String [] AV143OptionsDescJson = new String[] { "" };
      String [] AV145OptionIndexesJson = new String[] { "" };
      if ( ! processHeaders("formulaciontinte.listadodeformulas_wcgetfilterdata",myServletRequestWrapper,myServletResponseWrapper) )
      {
         builder = Response.notModifiedWrapped();
         cleanup();
         return (jakarta.ws.rs.core.Response) builder.build() ;
      }
      try
      {
         app.formulaciontinte.listadodeformulas_wcgetfilterdata worker = new app.formulaciontinte.listadodeformulas_wcgetfilterdata(remoteHandle, context);
         worker.execute(AV136DDOName,AV134SearchTxt,AV135SearchTxtTo,AV140OptionsJson,AV143OptionsDescJson,AV145OptionIndexesJson );
         app.formulaciontinte.listadodeformulas_wcgetfilterdata_RESTInterfaceOUT data = new app.formulaciontinte.listadodeformulas_wcgetfilterdata_RESTInterfaceOUT();
         data.setOptionsJson(AV140OptionsJson[0]);
         data.setOptionsDescJson(AV143OptionsDescJson[0]);
         data.setOptionIndexesJson(AV145OptionIndexesJson[0]);
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

