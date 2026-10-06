package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.pcvcn04", "/app.pcvcn04"})
@jakarta.servlet.annotation.MultipartConfig
public final  class pcvcn04 extends GXWebObjectStub
{
   public pcvcn04( )
   {
   }

   public pcvcn04( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( pcvcn04.class ));
   }

   public pcvcn04( int remoteHandle ,
                   ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new pcvcn04_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new pcvcn04_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "Resumen Entradas/Salidas";
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

