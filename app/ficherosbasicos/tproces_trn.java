package app.ficherosbasicos ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.ficherosbasicos.tproces_trn", "/app.ficherosbasicos.tproces_trn"})
@jakarta.servlet.annotation.MultipartConfig
public final  class tproces_trn extends GXWebObjectStub
{
   public tproces_trn( )
   {
   }

   public tproces_trn( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( tproces_trn.class ));
   }

   public tproces_trn( int remoteHandle ,
                       ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new tproces_trn_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new tproces_trn_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "Procesos Produccion";
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

