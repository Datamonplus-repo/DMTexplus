package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.tmmovst", "/app.tmmovst"})
@jakarta.servlet.annotation.MultipartConfig
public final  class tmmovst extends GXWebObjectStub
{
   public tmmovst( )
   {
   }

   public tmmovst( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( tmmovst.class ));
   }

   public tmmovst( int remoteHandle ,
                   ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new tmmovst_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new tmmovst_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "Movimientos de Stock";
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

