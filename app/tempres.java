package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.tempres", "/app.tempres"})
@jakarta.servlet.annotation.MultipartConfig
public final  class tempres extends GXWebObjectStub
{
   public tempres( )
   {
   }

   public tempres( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( tempres.class ));
   }

   public tempres( int remoteHandle ,
                   ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new tempres_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new tempres_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "EMPRESAS";
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

