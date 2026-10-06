package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.wpwkgsupd", "/app.wpwkgsupd"})
@jakarta.servlet.annotation.MultipartConfig
public final  class wpwkgsupd extends GXWebObjectStub
{
   public wpwkgsupd( )
   {
   }

   public wpwkgsupd( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( wpwkgsupd.class ));
   }

   public wpwkgsupd( int remoteHandle ,
                     ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new wpwkgsupd_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new wpwkgsupd_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "Solicito Kilos y Volumen";
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

