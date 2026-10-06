package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.thisrex", "/app.thisrex"})
@jakarta.servlet.annotation.MultipartConfig
public final  class thisrex extends GXWebObjectStub
{
   public thisrex( )
   {
   }

   public thisrex( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( thisrex.class ));
   }

   public thisrex( int remoteHandle ,
                   ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new thisrex_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new thisrex_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "Hay campos DT";
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

