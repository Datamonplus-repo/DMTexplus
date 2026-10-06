package app.ficherosbasicos ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.ficherosbasicos.tproces_trnww", "/app.ficherosbasicos.tproces_trnww"})
@jakarta.servlet.annotation.MultipartConfig
public final  class tproces_trnww extends GXWebObjectStub
{
   public tproces_trnww( )
   {
   }

   public tproces_trnww( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( tproces_trnww.class ));
   }

   public tproces_trnww( int remoteHandle ,
                         ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new tproces_trnww_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new tproces_trnww_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return " Procesos Produccion";
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

