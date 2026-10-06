package app.formulaciontinte ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.formulaciontinte.auditoriaproductosquimicos_wp", "/app.formulaciontinte.auditoriaproductosquimicos_wp"})
@jakarta.servlet.annotation.MultipartConfig
public final  class auditoriaproductosquimicos_wp extends GXWebObjectStub
{
   public auditoriaproductosquimicos_wp( )
   {
   }

   public auditoriaproductosquimicos_wp( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( auditoriaproductosquimicos_wp.class ));
   }

   public auditoriaproductosquimicos_wp( int remoteHandle ,
                                         ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new auditoriaproductosquimicos_wp_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new auditoriaproductosquimicos_wp_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "Auditoria Productos Quimicos";
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

