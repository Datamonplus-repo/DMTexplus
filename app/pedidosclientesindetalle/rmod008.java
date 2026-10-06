package app.pedidosclientesindetalle ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.pedidosclientesindetalle.rmod008", "/app.pedidosclientesindetalle.rmod008"})
@jakarta.servlet.annotation.MultipartConfig
public final  class rmod008 extends GXWebObjectStub
{
   public rmod008( )
   {
   }

   public rmod008( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( rmod008.class ));
   }

   public rmod008( int remoteHandle ,
                   ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new rmod008_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new rmod008_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "Produccion en curso";
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

