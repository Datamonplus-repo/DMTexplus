package app.ficherosbasicos ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.ficherosbasicos.ttubosww", "/app.ficherosbasicos.ttubosww"})
@jakarta.servlet.annotation.MultipartConfig
public final  class ttubosww extends GXWebObjectStub
{
   public ttubosww( )
   {
   }

   public ttubosww( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( ttubosww.class ));
   }

   public ttubosww( int remoteHandle ,
                    ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new ttubosww_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new ttubosww_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return " TUBOS";
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

