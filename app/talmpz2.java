package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.talmpz2", "/app.talmpz2"})
@jakarta.servlet.annotation.MultipartConfig
public final  class talmpz2 extends GXWebObjectStub
{
   public talmpz2( )
   {
   }

   public talmpz2( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( talmpz2.class ));
   }

   public talmpz2( int remoteHandle ,
                   ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new talmpz2_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new talmpz2_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "ALMACEN DE PIEZAS - DETALLE";
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

