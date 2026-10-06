package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.webinformesproduccion", "/app.webinformesproduccion"})
@jakarta.servlet.annotation.MultipartConfig
public final  class webinformesproduccion extends GXWebObjectStub
{
   public webinformesproduccion( )
   {
   }

   public webinformesproduccion( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( webinformesproduccion.class ));
   }

   public webinformesproduccion( int remoteHandle ,
                                 ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new webinformesproduccion_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new webinformesproduccion_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "Informes de Produccion";
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

