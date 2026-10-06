package app.formulaciontinte ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.formulaciontinte.tsolide", "/app.formulaciontinte.tsolide"})
@jakarta.servlet.annotation.MultipartConfig
public final  class tsolide extends GXWebObjectStub
{
   public tsolide( )
   {
   }

   public tsolide( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( tsolide.class ));
   }

   public tsolide( int remoteHandle ,
                   ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new tsolide_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new tsolide_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "Solidez";
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

