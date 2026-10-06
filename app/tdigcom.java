package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.tdigcom", "/app.tdigcom"})
@jakarta.servlet.annotation.MultipartConfig
public final  class tdigcom extends GXWebObjectStub
{
   public tdigcom( )
   {
   }

   public tdigcom( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( tdigcom.class ));
   }

   public tdigcom( int remoteHandle ,
                   ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new tdigcom_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new tdigcom_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "DIBUJOS y COMBINACIONES DIGITAL";
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

