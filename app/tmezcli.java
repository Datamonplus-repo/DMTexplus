package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.tmezcli", "/app.tmezcli"})
@jakarta.servlet.annotation.MultipartConfig
public final  class tmezcli extends GXWebObjectStub
{
   public tmezcli( )
   {
   }

   public tmezcli( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( tmezcli.class ));
   }

   public tmezcli( int remoteHandle ,
                   ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new tmezcli_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new tmezcli_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "MAESTRO MEZCLAS CLIENTE";
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

