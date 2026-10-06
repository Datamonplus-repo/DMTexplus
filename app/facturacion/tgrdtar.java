package app.facturacion ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.facturacion.tgrdtar", "/app.facturacion.tgrdtar"})
@jakarta.servlet.annotation.MultipartConfig
public final  class tgrdtar extends GXWebObjectStub
{
   public tgrdtar( )
   {
   }

   public tgrdtar( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( tgrdtar.class ));
   }

   public tgrdtar( int remoteHandle ,
                   ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new tgrdtar_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new tgrdtar_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "Custos Gerals";
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

