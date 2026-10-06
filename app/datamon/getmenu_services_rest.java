package app.datamon ;
import app.*;
import com.genexus.servlet.*;
import com.genexus.servlet.http.*;
import java.util.*;
import com.genexus.*;
import com.genexus.Application;
import com.genexus.ws.rs.core.*;

@jakarta.ws.rs.Path("/Datamon/GetMenu")
public final  class getmenu_services_rest extends GxRestService
{
   @jakarta.ws.rs.GET
   @jakarta.ws.rs.Produces({jakarta.ws.rs.core.MediaType.APPLICATION_JSON + ";charset=UTF-8"})
   public jakarta.ws.rs.core.Response execute( ) throws Exception
   {
      super.init( "GET" );
      if ( ! processHeaders("datamon.getmenu",myServletRequestWrapper,myServletResponseWrapper) )
      {
         builder = Response.notModifiedWrapped();
         cleanup();
         return (jakarta.ws.rs.core.Response) builder.build() ;
      }
      GXBaseCollection<app.datamon.SdtSdtMenu_ITEM> data;
      try
      {
         app.datamon.getmenu worker = new app.datamon.getmenu(remoteHandle, context);
         data = worker.executeUdp( );
         if ( data.size() == 0 )
         {
            builder = Response.okWrapped("[]");
         }
         else
         {
            GenericEntity<Vector< app.datamon.SdtSdtMenu_ITEM_RESTInterface >> ge = new GenericEntity<Vector< app.datamon.SdtSdtMenu_ITEM_RESTInterface >>( SdtSdtMenu_ITEM_RESTInterfacefromGXObjectCollection (data)) {};
            builder = Response.okWrapped(ge);
         }
         cleanup();
         return (jakarta.ws.rs.core.Response) builder.build() ;
      }
      catch ( Exception e )
      {
         cleanup();
         throw e;
      }
   }

   @jakarta.ws.rs.POST
   @jakarta.ws.rs.Path("gxobject")
   @jakarta.ws.rs.Produces({jakarta.ws.rs.core.MediaType.APPLICATION_JSON + ";charset=UTF-8"})
   public jakarta.ws.rs.core.Response Upload( ) throws Exception
   {
      super.init( "POST" );
      try
      {
         builder = new com.genexus.webpanels.GXObjectUploadServices().doInternalRestExecute(restHttpContext);
         cleanup();
         return (jakarta.ws.rs.core.Response) builder.build() ;
      }
      catch ( Exception e )
      {
         cleanup();
         throw e;
      }
   }

   private Vector<app.datamon.SdtSdtMenu_ITEM_RESTInterface> SdtSdtMenu_ITEM_RESTInterfacefromGXObjectCollection( GXBaseCollection<app.datamon.SdtSdtMenu_ITEM> collection )
   {
      Vector<app.datamon.SdtSdtMenu_ITEM_RESTInterface> result = new Vector<app.datamon.SdtSdtMenu_ITEM_RESTInterface>();
      for (int i = 0; i < collection.size(); i++)
      {
         result.addElement(new app.datamon.SdtSdtMenu_ITEM_RESTInterface((app.datamon.SdtSdtMenu_ITEM)collection.elementAt(i)));
      }
      return result ;
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

