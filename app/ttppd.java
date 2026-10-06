package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.ttppd", "/app.ttppd"})
@jakarta.servlet.annotation.MultipartConfig
public final  class ttppd extends GXWebObjectStub
{
   public ttppd( )
   {
   }

   public ttppd( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( ttppd.class ));
   }

   public ttppd( int remoteHandle ,
                 ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new ttppd_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new ttppd_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "TIPO PRODUCCION";
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

