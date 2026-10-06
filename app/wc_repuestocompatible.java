package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.wc_repuestocompatible", "/app.wc_repuestocompatible"})
@jakarta.servlet.annotation.MultipartConfig
public final  class wc_repuestocompatible extends GXWebObjectStub
{
   public wc_repuestocompatible( )
   {
   }

   public wc_repuestocompatible( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( wc_repuestocompatible.class ));
   }

   public wc_repuestocompatible( int remoteHandle ,
                                 ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new wc_repuestocompatible_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new wc_repuestocompatible_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "Lista de repuestos compatibles";
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

