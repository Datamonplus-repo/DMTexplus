package app.ingenieria ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.ingenieria.drecgeneral", "/app.ingenieria.drecgeneral"})
@jakarta.servlet.annotation.MultipartConfig
public final  class drecgeneral extends GXWebObjectStub
{
   public drecgeneral( )
   {
   }

   public drecgeneral( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( drecgeneral.class ));
   }

   public drecgeneral( int remoteHandle ,
                       ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new drecgeneral_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new drecgeneral_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "DRec General";
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

