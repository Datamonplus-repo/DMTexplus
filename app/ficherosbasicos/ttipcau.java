package app.ficherosbasicos ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.ficherosbasicos.ttipcau", "/app.ficherosbasicos.ttipcau"})
@jakarta.servlet.annotation.MultipartConfig
public final  class ttipcau extends GXWebObjectStub
{
   public ttipcau( )
   {
   }

   public ttipcau( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( ttipcau.class ));
   }

   public ttipcau( int remoteHandle ,
                   ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new ttipcau_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new ttipcau_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "Causas del Defecto";
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

