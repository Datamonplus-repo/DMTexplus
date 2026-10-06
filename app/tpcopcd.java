package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.tpcopcd", "/app.tpcopcd"})
@jakarta.servlet.annotation.MultipartConfig
public final  class tpcopcd extends GXWebObjectStub
{
   public tpcopcd( )
   {
   }

   public tpcopcd( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( tpcopcd.class ));
   }

   public tpcopcd( int remoteHandle ,
                   ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new tpcopcd_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new tpcopcd_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "PRECIO COLOR-PROCESO-CLIENTED";
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

