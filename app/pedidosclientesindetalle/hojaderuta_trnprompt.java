package app.pedidosclientesindetalle ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.pedidosclientesindetalle.hojaderuta_trnprompt", "/app.pedidosclientesindetalle.hojaderuta_trnprompt"})
@jakarta.servlet.annotation.MultipartConfig
public final  class hojaderuta_trnprompt extends GXWebObjectStub
{
   public hojaderuta_trnprompt( )
   {
   }

   public hojaderuta_trnprompt( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( hojaderuta_trnprompt.class ));
   }

   public hojaderuta_trnprompt( int remoteHandle ,
                                ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new hojaderuta_trnprompt_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new hojaderuta_trnprompt_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "Seleccion de Producciones (Hdrs)";
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

