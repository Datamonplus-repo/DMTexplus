package app.controlcalidadhtd ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.controlcalidadhtd.arccaud", "/app.controlcalidadhtd.arccaud"})
@jakarta.servlet.annotation.MultipartConfig
public final  class arccaud extends GXWebObjectStub
{
   public arccaud( )
   {
   }

   public arccaud( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( arccaud.class ));
   }

   public arccaud( int remoteHandle ,
                   ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new arccaud_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new arccaud_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "CCAud";
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

