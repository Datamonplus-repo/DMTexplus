package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.lprdes_trn", "/app.lprdes_trn"})
@jakarta.servlet.annotation.MultipartConfig
public final  class lprdes_trn extends GXWebObjectStub
{
   public lprdes_trn( )
   {
   }

   public lprdes_trn( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( lprdes_trn.class ));
   }

   public lprdes_trn( int remoteHandle ,
                      ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new lprdes_trn_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new lprdes_trn_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "LPRDES_TRN";
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

