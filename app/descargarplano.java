package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.descargarplano", "/app.descargarplano"})
@jakarta.servlet.annotation.MultipartConfig
public final  class descargarplano extends GXWebObjectStub
{
   public descargarplano( )
   {
   }

   public descargarplano( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( descargarplano.class ));
   }

   public descargarplano( int remoteHandle ,
                          ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new descargarplano_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new descargarplano_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "Descargar Plano";
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

