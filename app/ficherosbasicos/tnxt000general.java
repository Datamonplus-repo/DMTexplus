package app.ficherosbasicos ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.ficherosbasicos.tnxt000general", "/app.ficherosbasicos.tnxt000general"})
@jakarta.servlet.annotation.MultipartConfig
public final  class tnxt000general extends GXWebObjectStub
{
   public tnxt000general( )
   {
   }

   public tnxt000general( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( tnxt000general.class ));
   }

   public tnxt000general( int remoteHandle ,
                          ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new tnxt000general_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new tnxt000general_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "TNXT000 General";
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

