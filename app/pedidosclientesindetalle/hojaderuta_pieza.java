package app.pedidosclientesindetalle ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.pedidosclientesindetalle.hojaderuta_pieza", "/app.pedidosclientesindetalle.hojaderuta_pieza"})
@jakarta.servlet.annotation.MultipartConfig
public final  class hojaderuta_pieza extends GXWebObjectStub
{
   public hojaderuta_pieza( )
   {
   }

   public hojaderuta_pieza( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( hojaderuta_pieza.class ));
   }

   public hojaderuta_pieza( int remoteHandle ,
                            ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new hojaderuta_pieza_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new hojaderuta_pieza_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "Modificacion";
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

