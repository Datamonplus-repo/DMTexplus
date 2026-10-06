package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.tcolscc", "/app.tcolscc"})
@jakarta.servlet.annotation.MultipartConfig
public final  class tcolscc extends GXWebObjectStub
{
   public tcolscc( )
   {
   }

   public tcolscc( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( tcolscc.class ));
   }

   public tcolscc( int remoteHandle ,
                   ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new tcolscc_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new tcolscc_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "Colores Cuardeno Encargo CC";
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

