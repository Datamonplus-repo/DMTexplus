package app.ficherosbasicos ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.ficherosbasicos.ttipdisww", "/app.ficherosbasicos.ttipdisww"})
@jakarta.servlet.annotation.MultipartConfig
public final  class ttipdisww extends GXWebObjectStub
{
   public ttipdisww( )
   {
   }

   public ttipdisww( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( ttipdisww.class ));
   }

   public ttipdisww( int remoteHandle ,
                     ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new ttipdisww_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new ttipdisww_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return " Tipo de Disposicion";
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

