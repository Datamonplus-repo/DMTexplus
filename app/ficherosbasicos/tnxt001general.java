package app.ficherosbasicos ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.ficherosbasicos.tnxt001general", "/app.ficherosbasicos.tnxt001general"})
@jakarta.servlet.annotation.MultipartConfig
public final  class tnxt001general extends GXWebObjectStub
{
   public tnxt001general( )
   {
   }

   public tnxt001general( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( tnxt001general.class ));
   }

   public tnxt001general( int remoteHandle ,
                          ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new tnxt001general_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new tnxt001general_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "TNXT001 General";
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

