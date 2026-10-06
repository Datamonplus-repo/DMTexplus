package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.mrcom", "/app.mrcom"})
@jakarta.servlet.annotation.MultipartConfig
public final  class mrcom extends GXWebObjectStub
{
   public mrcom( )
   {
   }

   public mrcom( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( mrcom.class ));
   }

   public mrcom( int remoteHandle ,
                 ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new mrcom_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new mrcom_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "Table MRCom (Repuestos Compatibles)";
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

