package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.webpartesproduccionins", "/app.webpartesproduccionins"})
@jakarta.servlet.annotation.MultipartConfig
public final  class webpartesproduccionins extends GXWebObjectStub
{
   public webpartesproduccionins( )
   {
   }

   public webpartesproduccionins( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( webpartesproduccionins.class ));
   }

   public webpartesproduccionins( int remoteHandle ,
                                  ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new webpartesproduccionins_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new webpartesproduccionins_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "Agregar Registro Parte Produccion";
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

