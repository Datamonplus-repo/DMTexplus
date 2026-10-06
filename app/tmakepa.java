package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.tmakepa", "/app.tmakepa"})
@jakarta.servlet.annotation.MultipartConfig
public final  class tmakepa extends GXWebObjectStub
{
   public tmakepa( )
   {
   }

   public tmakepa( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( tmakepa.class ));
   }

   public tmakepa( int remoteHandle ,
                   ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new tmakepa_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new tmakepa_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "HACER PASTA";
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

