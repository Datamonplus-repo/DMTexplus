package app.ficherosbasicos ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.ficherosbasicos.tcodrpsww", "/app.ficherosbasicos.tcodrpsww"})
@jakarta.servlet.annotation.MultipartConfig
public final  class tcodrpsww extends GXWebObjectStub
{
   public tcodrpsww( )
   {
   }

   public tcodrpsww( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( tcodrpsww.class ));
   }

   public tcodrpsww( int remoteHandle ,
                     ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new tcodrpsww_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new tcodrpsww_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return " TABLA RESPONSABILIDADES";
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

