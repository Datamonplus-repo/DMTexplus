package app.ficherosbasicos ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.ficherosbasicos.ttipcaugeneral", "/app.ficherosbasicos.ttipcaugeneral"})
@jakarta.servlet.annotation.MultipartConfig
public final  class ttipcaugeneral extends GXWebObjectStub
{
   public ttipcaugeneral( )
   {
   }

   public ttipcaugeneral( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( ttipcaugeneral.class ));
   }

   public ttipcaugeneral( int remoteHandle ,
                          ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new ttipcaugeneral_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new ttipcaugeneral_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "TTIPCAUGeneral";
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

