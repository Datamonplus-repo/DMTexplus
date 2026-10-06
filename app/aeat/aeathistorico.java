package app.aeat ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.aeat.aeathistorico", "/app.aeat.aeathistorico"})
@jakarta.servlet.annotation.MultipartConfig
public final  class aeathistorico extends GXWebObjectStub
{
   public aeathistorico( )
   {
   }

   public aeathistorico( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( aeathistorico.class ));
   }

   public aeathistorico( int remoteHandle ,
                         ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new aeathistorico_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new aeathistorico_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "AEATHistorico";
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

