package app.albaranes ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.albaranes.albaran", "/app.albaranes.albaran"})
@jakarta.servlet.annotation.MultipartConfig
public final  class albaran extends GXWebObjectStub
{
   public albaran( )
   {
   }

   public albaran( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( albaran.class ));
   }

   public albaran( int remoteHandle ,
                   ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new albaran_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new albaran_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "Albaranes";
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

