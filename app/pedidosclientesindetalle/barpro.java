package app.pedidosclientesindetalle ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.pedidosclientesindetalle.barpro", "/app.pedidosclientesindetalle.barpro"})
@jakarta.servlet.annotation.MultipartConfig
public final  class barpro extends GXWebObjectStub
{
   public barpro( )
   {
   }

   public barpro( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( barpro.class ));
   }

   public barpro( int remoteHandle ,
                  ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new barpro_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new barpro_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "Procesos Produccion";
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

