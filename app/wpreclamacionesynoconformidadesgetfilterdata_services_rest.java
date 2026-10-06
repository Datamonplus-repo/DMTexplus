package app ;
import app.*;
import com.genexus.servlet.*;
import com.genexus.servlet.http.*;
import java.util.*;
import com.genexus.*;
import com.genexus.Application;
import com.genexus.ws.rs.core.*;

@jakarta.ws.rs.Path("/WPReclamacionesyNoConformidadesGetFilterData")
public final  class wpreclamacionesynoconformidadesgetfilterdata_services_rest extends GxRestService
{
   @jakarta.ws.rs.POST
   @jakarta.ws.rs.Consumes({jakarta.ws.rs.core.MediaType.APPLICATION_JSON})
   @jakarta.ws.rs.Produces({jakarta.ws.rs.core.MediaType.APPLICATION_JSON + ";charset=UTF-8"})
   public jakarta.ws.rs.core.Response execute( app.wpreclamacionesynoconformidadesgetfilterdata_RESTInterfaceIN entity ) throws Exception
   {
      super.init( "POST" );
      String AV104DDOName;
      AV104DDOName = entity.getDDOName() ;
      String AV102SearchTxt;
      AV102SearchTxt = entity.getSearchTxt() ;
      String AV103SearchTxtTo;
      AV103SearchTxtTo = entity.getSearchTxtTo() ;
      String [] AV108OptionsJson = new String[] { "" };
      String [] AV111OptionsDescJson = new String[] { "" };
      String [] AV113OptionIndexesJson = new String[] { "" };
      if ( ! processHeaders("wpreclamacionesynoconformidadesgetfilterdata",myServletRequestWrapper,myServletResponseWrapper) )
      {
         builder = Response.notModifiedWrapped();
         cleanup();
         return (jakarta.ws.rs.core.Response) builder.build() ;
      }
      try
      {
         app.wpreclamacionesynoconformidadesgetfilterdata worker = new app.wpreclamacionesynoconformidadesgetfilterdata(remoteHandle, context);
         worker.execute(AV104DDOName,AV102SearchTxt,AV103SearchTxtTo,AV108OptionsJson,AV111OptionsDescJson,AV113OptionIndexesJson );
         app.wpreclamacionesynoconformidadesgetfilterdata_RESTInterfaceOUT data = new app.wpreclamacionesynoconformidadesgetfilterdata_RESTInterfaceOUT();
         data.setOptionsJson(AV108OptionsJson[0]);
         data.setOptionsDescJson(AV111OptionsDescJson[0]);
         data.setOptionIndexesJson(AV113OptionIndexesJson[0]);
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

