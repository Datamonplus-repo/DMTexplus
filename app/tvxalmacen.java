package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.tvxalmacen", "/app.tvxalmacen"})
@jakarta.servlet.annotation.MultipartConfig
public final  class tvxalmacen extends GXWebObjectStub
{
   public tvxalmacen( )
   {
   }

   public tvxalmacen( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( tvxalmacen.class ));
   }

   public tvxalmacen( int remoteHandle ,
                      ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new tvxalmacen_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new tvxalmacen_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "Estructura ALMACEN  en VERTEX";
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

