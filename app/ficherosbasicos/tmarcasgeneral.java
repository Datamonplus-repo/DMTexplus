package app.ficherosbasicos ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.ficherosbasicos.tmarcasgeneral", "/app.ficherosbasicos.tmarcasgeneral"})
@jakarta.servlet.annotation.MultipartConfig
public final  class tmarcasgeneral extends GXWebObjectStub
{
   public tmarcasgeneral( )
   {
   }

   public tmarcasgeneral( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( tmarcasgeneral.class ));
   }

   public tmarcasgeneral( int remoteHandle ,
                          ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new tmarcasgeneral_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new tmarcasgeneral_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "TMARCASGeneral";
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

