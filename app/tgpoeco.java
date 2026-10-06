package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.tgpoeco", "/app.tgpoeco"})
@jakarta.servlet.annotation.MultipartConfig
public final  class tgpoeco extends GXWebObjectStub
{
   public tgpoeco( )
   {
   }

   public tgpoeco( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( tgpoeco.class ));
   }

   public tgpoeco( int remoteHandle ,
                   ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new tgpoeco_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new tgpoeco_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "Grupos Económicos";
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

