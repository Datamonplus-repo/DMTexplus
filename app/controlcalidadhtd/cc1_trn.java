package app.controlcalidadhtd ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.controlcalidadhtd.cc1_trn", "/app.controlcalidadhtd.cc1_trn"})
@jakarta.servlet.annotation.MultipartConfig
public final  class cc1_trn extends GXWebObjectStub
{
   public cc1_trn( )
   {
   }

   public cc1_trn( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( cc1_trn.class ));
   }

   public cc1_trn( int remoteHandle ,
                   ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new cc1_trn_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new cc1_trn_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "Tabla CC1";
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

