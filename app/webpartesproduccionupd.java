package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.webpartesproduccionupd", "/app.webpartesproduccionupd"})
@jakarta.servlet.annotation.MultipartConfig
public final  class webpartesproduccionupd extends GXWebObjectStub
{
   public webpartesproduccionupd( )
   {
   }

   public webpartesproduccionupd( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( webpartesproduccionupd.class ));
   }

   public webpartesproduccionupd( int remoteHandle ,
                                  ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new webpartesproduccionupd_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new webpartesproduccionupd_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "Modificacion Parte de Produccion";
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

