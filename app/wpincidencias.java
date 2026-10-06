package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.wpincidencias", "/app.wpincidencias"})
@jakarta.servlet.annotation.MultipartConfig
public final  class wpincidencias extends GXWebObjectStub
{
   public wpincidencias( )
   {
   }

   public wpincidencias( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( wpincidencias.class ));
   }

   public wpincidencias( int remoteHandle ,
                         ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new wpincidencias_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new wpincidencias_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return " Control de Incidencias";
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

