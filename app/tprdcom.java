package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.tprdcom", "/app.tprdcom"})
@jakarta.servlet.annotation.MultipartConfig
public final  class tprdcom extends GXWebObjectStub
{
   public tprdcom( )
   {
   }

   public tprdcom( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( tprdcom.class ));
   }

   public tprdcom( int remoteHandle ,
                   ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new tprdcom_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new tprdcom_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "Producto Compuesto";
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

