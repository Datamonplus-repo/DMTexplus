package app.formulaciontinte ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.formulaciontinte.colorproductos_trn", "/app.formulaciontinte.colorproductos_trn"})
@jakarta.servlet.annotation.MultipartConfig
public final  class colorproductos_trn extends GXWebObjectStub
{
   public colorproductos_trn( )
   {
   }

   public colorproductos_trn( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( colorproductos_trn.class ));
   }

   public colorproductos_trn( int remoteHandle ,
                              ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new colorproductos_trn_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new colorproductos_trn_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "Color Productos";
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

