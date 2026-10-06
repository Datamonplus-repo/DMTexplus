package app.ficherosbasicos ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.ficherosbasicos.wdupserconfirm", "/app.ficherosbasicos.wdupserconfirm"})
@jakarta.servlet.annotation.MultipartConfig
public final  class wdupserconfirm extends GXWebObjectStub
{
   public wdupserconfirm( )
   {
   }

   public wdupserconfirm( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( wdupserconfirm.class ));
   }

   public wdupserconfirm( int remoteHandle ,
                          ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new wdupserconfirm_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new wdupserconfirm_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "Duplicidade Series";
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

