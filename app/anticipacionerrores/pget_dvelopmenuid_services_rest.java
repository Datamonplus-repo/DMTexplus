package app.anticipacionerrores ;
import app.*;
import com.genexus.servlet.*;
import com.genexus.servlet.http.*;
import java.util.*;
import com.genexus.*;
import com.genexus.Application;
import com.genexus.ws.rs.core.*;

@jakarta.ws.rs.Path("/AnticipacionErrores/pget_DVelopMenuID")
public final  class pget_dvelopmenuid_services_rest extends GxRestService
{
   @jakarta.ws.rs.POST
   @jakarta.ws.rs.Consumes({jakarta.ws.rs.core.MediaType.APPLICATION_JSON})
   @jakarta.ws.rs.Produces({jakarta.ws.rs.core.MediaType.APPLICATION_JSON + ";charset=UTF-8"})
   public jakarta.ws.rs.core.Response execute( app.anticipacionerrores.pget_dvelopmenuid_RESTInterfaceIN entity ) throws Exception
   {
      super.init( "POST" );
      String AV14UsurCod;
      AV14UsurCod = entity.getUsurCod() ;
      @SuppressWarnings("unchecked")
      GXBaseCollection<app.wwpbaseobjects.SdtDVelop_Menu_Item> [] AV8DVelop_Menu = new GXBaseCollection[] { new GXBaseCollection<app.wwpbaseobjects.SdtDVelop_Menu_Item>() };
      if ( ! processHeaders("anticipacionerrores.pget_dvelopmenuid",myServletRequestWrapper,myServletResponseWrapper) )
      {
         builder = Response.notModifiedWrapped();
         cleanup();
         return (jakarta.ws.rs.core.Response) builder.build() ;
      }
      try
      {
         app.anticipacionerrores.pget_dvelopmenuid worker = new app.anticipacionerrores.pget_dvelopmenuid(remoteHandle, context);
         worker.execute(AV14UsurCod,AV8DVelop_Menu );
         app.anticipacionerrores.pget_dvelopmenuid_RESTInterfaceOUT data = new app.anticipacionerrores.pget_dvelopmenuid_RESTInterfaceOUT();
         data.setDVelop_Menu(SdtDVelop_Menu_Item_RESTInterfacefromGXObjectCollection(AV8DVelop_Menu[0]));
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

   private Vector<app.wwpbaseobjects.SdtDVelop_Menu_Item_RESTInterface> SdtDVelop_Menu_Item_RESTInterfacefromGXObjectCollection( GXBaseCollection<app.wwpbaseobjects.SdtDVelop_Menu_Item> collection )
   {
      Vector<app.wwpbaseobjects.SdtDVelop_Menu_Item_RESTInterface> result = new Vector<app.wwpbaseobjects.SdtDVelop_Menu_Item_RESTInterface>();
      for (int i = 0; i < collection.size(); i++)
      {
         result.addElement(new app.wwpbaseobjects.SdtDVelop_Menu_Item_RESTInterface((app.wwpbaseobjects.SdtDVelop_Menu_Item)collection.elementAt(i)));
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

