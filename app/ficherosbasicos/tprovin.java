package app.ficherosbasicos ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.ficherosbasicos.tprovin", "/app.ficherosbasicos.tprovin"})
@jakarta.servlet.annotation.MultipartConfig
public final  class tprovin extends GXWebObjectStub
{
   public tprovin( )
   {
   }

   public tprovin( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( tprovin.class ));
   }

   public tprovin( int remoteHandle ,
                   ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new tprovin_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new tprovin_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "Provincias";
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

