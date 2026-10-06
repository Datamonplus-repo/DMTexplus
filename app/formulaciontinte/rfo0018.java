package app.formulaciontinte ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.formulaciontinte.rfo0018", "/app.formulaciontinte.rfo0018"})
@jakarta.servlet.annotation.MultipartConfig
public final  class rfo0018 extends GXWebObjectStub
{
   public rfo0018( )
   {
   }

   public rfo0018( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( rfo0018.class ));
   }

   public rfo0018( int remoteHandle ,
                   ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new rfo0018_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new rfo0018_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "LISTADO PROCESOS TINTE";
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

