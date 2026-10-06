package app.ficherosbasicos ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.ficherosbasicos.ttipmaqgeneral", "/app.ficherosbasicos.ttipmaqgeneral"})
@jakarta.servlet.annotation.MultipartConfig
public final  class ttipmaqgeneral extends GXWebObjectStub
{
   public ttipmaqgeneral( )
   {
   }

   public ttipmaqgeneral( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( ttipmaqgeneral.class ));
   }

   public ttipmaqgeneral( int remoteHandle ,
                          ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new ttipmaqgeneral_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new ttipmaqgeneral_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "TTIPMAQGeneral";
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

