package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.tpdimest", "/app.tpdimest"})
@jakarta.servlet.annotation.MultipartConfig
public final  class tpdimest extends GXWebObjectStub
{
   public tpdimest( )
   {
   }

   public tpdimest( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( tpdimest.class ));
   }

   public tpdimest( int remoteHandle ,
                    ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new tpdimest_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new tpdimest_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "Llamada con parametro";
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

