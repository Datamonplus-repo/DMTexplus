package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.pverreccost", "/app.pverreccost"})
@jakarta.servlet.annotation.MultipartConfig
public final  class pverreccost extends GXWebObjectStub
{
   public pverreccost( )
   {
   }

   public pverreccost( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( pverreccost.class ));
   }

   public pverreccost( int remoteHandle ,
                       ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new pverreccost_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new pverreccost_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "Receta con Costes";
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

