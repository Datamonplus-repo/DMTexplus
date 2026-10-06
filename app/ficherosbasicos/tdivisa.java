package app.ficherosbasicos ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.ficherosbasicos.tdivisa", "/app.ficherosbasicos.tdivisa"})
@jakarta.servlet.annotation.MultipartConfig
public final  class tdivisa extends GXWebObjectStub
{
   public tdivisa( )
   {
   }

   public tdivisa( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( tdivisa.class ));
   }

   public tdivisa( int remoteHandle ,
                   ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new tdivisa_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new tdivisa_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "DIVISAS";
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

