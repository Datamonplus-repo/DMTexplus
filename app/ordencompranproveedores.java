package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.ordencompranproveedores", "/app.ordencompranproveedores"})
@jakarta.servlet.annotation.MultipartConfig
public final  class ordencompranproveedores extends GXWebObjectStub
{
   public ordencompranproveedores( )
   {
   }

   public ordencompranproveedores( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( ordencompranproveedores.class ));
   }

   public ordencompranproveedores( int remoteHandle ,
                                   ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new ordencompranproveedores_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new ordencompranproveedores_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return " Tabla PROPRV";
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

