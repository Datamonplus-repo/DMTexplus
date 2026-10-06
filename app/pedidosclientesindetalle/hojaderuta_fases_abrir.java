package app.pedidosclientesindetalle ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.pedidosclientesindetalle.hojaderuta_fases_abrir", "/app.pedidosclientesindetalle.hojaderuta_fases_abrir"})
@jakarta.servlet.annotation.MultipartConfig
public final  class hojaderuta_fases_abrir extends GXWebObjectStub
{
   public hojaderuta_fases_abrir( )
   {
   }

   public hojaderuta_fases_abrir( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( hojaderuta_fases_abrir.class ));
   }

   public hojaderuta_fases_abrir( int remoteHandle ,
                                  ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new hojaderuta_fases_abrir_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new hojaderuta_fases_abrir_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "Abrir Fase";
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

