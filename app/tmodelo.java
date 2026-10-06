package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.tmodelo", "/app.tmodelo"})
@jakarta.servlet.annotation.MultipartConfig
public final  class tmodelo extends GXWebObjectStub
{
   public tmodelo( )
   {
   }

   public tmodelo( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( tmodelo.class ));
   }

   public tmodelo( int remoteHandle ,
                   ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new tmodelo_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new tmodelo_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "Modelos";
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

