package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.tcontin", "/app.tcontin"})
@jakarta.servlet.annotation.MultipartConfig
public final  class tcontin extends GXWebObjectStub
{
   public tcontin( )
   {
   }

   public tcontin( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( tcontin.class ));
   }

   public tcontin( int remoteHandle ,
                   ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new tcontin_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new tcontin_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "CONTROL TINTE";
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

