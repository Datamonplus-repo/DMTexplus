package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.tpriord", "/app.tpriord"})
@jakarta.servlet.annotation.MultipartConfig
public final  class tpriord extends GXWebObjectStub
{
   public tpriord( )
   {
   }

   public tpriord( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( tpriord.class ));
   }

   public tpriord( int remoteHandle ,
                   ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new tpriord_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new tpriord_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "PRIORIDAD DE LA ORDEN";
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

