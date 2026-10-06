package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.st0013exportcsv", "/app.st0013exportcsv"})
@jakarta.servlet.annotation.MultipartConfig
public final  class st0013exportcsv extends GXWebObjectStub
{
   public st0013exportcsv( )
   {
   }

   public st0013exportcsv( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( st0013exportcsv.class ));
   }

   public st0013exportcsv( int remoteHandle ,
                           ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new st0013exportcsv_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new st0013exportcsv_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "ST0013 Export CSV";
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

