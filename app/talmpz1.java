package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.talmpz1", "/app.talmpz1"})
@jakarta.servlet.annotation.MultipartConfig
public final  class talmpz1 extends GXWebObjectStub
{
   public talmpz1( )
   {
   }

   public talmpz1( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( talmpz1.class ));
   }

   public talmpz1( int remoteHandle ,
                   ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new talmpz1_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new talmpz1_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "ALMACEN DE PIEZAS - CABECERA";
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

