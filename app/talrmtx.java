package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.talrmtx", "/app.talrmtx"})
@jakarta.servlet.annotation.MultipartConfig
public final  class talrmtx extends GXWebObjectStub
{
   public talrmtx( )
   {
   }

   public talrmtx( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( talrmtx.class ));
   }

   public talrmtx( int remoteHandle ,
                   ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new talrmtx_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new talrmtx_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "Mantenimiento de Piezas";
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

