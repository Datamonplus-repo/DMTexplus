package app.pedidosclientesindetalle ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.pedidosclientesindetalle.hojaderuta_fases", "/app.pedidosclientesindetalle.hojaderuta_fases"})
@jakarta.servlet.annotation.MultipartConfig
public final  class hojaderuta_fases extends GXWebObjectStub
{
   public hojaderuta_fases( )
   {
   }

   public hojaderuta_fases( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( hojaderuta_fases.class ));
   }

   public hojaderuta_fases( int remoteHandle ,
                            ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new hojaderuta_fases_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new hojaderuta_fases_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "Fases";
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

