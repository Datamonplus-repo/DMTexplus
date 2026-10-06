package app.pedidosclientesindetalle ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.pedidosclientesindetalle.tmacrosgeneral", "/app.pedidosclientesindetalle.tmacrosgeneral"})
@jakarta.servlet.annotation.MultipartConfig
public final  class tmacrosgeneral extends GXWebObjectStub
{
   public tmacrosgeneral( )
   {
   }

   public tmacrosgeneral( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( tmacrosgeneral.class ));
   }

   public tmacrosgeneral( int remoteHandle ,
                          ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new tmacrosgeneral_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new tmacrosgeneral_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "TMACROSGeneral";
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

