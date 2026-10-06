package app.ingenieria ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.ingenieria.mras", "/app.ingenieria.mras"})
@jakarta.servlet.annotation.MultipartConfig
public final  class mras extends GXWebObjectStub
{
   public mras( )
   {
   }

   public mras( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( mras.class ));
   }

   public mras( int remoteHandle ,
                ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new mras_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new mras_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "Rastro - Seguimiento - Bitacora";
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

