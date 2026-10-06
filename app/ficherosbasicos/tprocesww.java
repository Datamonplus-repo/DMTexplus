package app.ficherosbasicos ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.ficherosbasicos.tprocesww", "/app.ficherosbasicos.tprocesww"})
@jakarta.servlet.annotation.MultipartConfig
public final  class tprocesww extends GXWebObjectStub
{
   public tprocesww( )
   {
   }

   public tprocesww( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( tprocesww.class ));
   }

   public tprocesww( int remoteHandle ,
                     ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new tprocesww_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new tprocesww_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return " PROCESOS DE PRODUCCION";
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

