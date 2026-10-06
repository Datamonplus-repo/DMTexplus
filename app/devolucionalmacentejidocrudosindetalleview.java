package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.devolucionalmacentejidocrudosindetalleview", "/app.devolucionalmacentejidocrudosindetalleview"})
@jakarta.servlet.annotation.MultipartConfig
public final  class devolucionalmacentejidocrudosindetalleview extends GXWebObjectStub
{
   public devolucionalmacentejidocrudosindetalleview( )
   {
   }

   public devolucionalmacentejidocrudosindetalleview( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( devolucionalmacentejidocrudosindetalleview.class ));
   }

   public devolucionalmacentejidocrudosindetalleview( int remoteHandle ,
                                                      ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new devolucionalmacentejidocrudosindetalleview_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new devolucionalmacentejidocrudosindetalleview_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "Devolucion Almacen Tejido Crudosindetalle View";
   }

   protected boolean IntegratedSecurityEnabled( )
   {
      return false;
   }

   protected int IntegratedSecurityLevel( )
   {
      return 0;
   }

   protected String IntegratedSecurityPermissionPrefix( )
   {
      return "";
   }

   protected String EncryptURLParameters( )
   {
      return "NO";
   }

}

