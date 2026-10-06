package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.tmordenconsumo", "/app.tmordenconsumo"})
@jakarta.servlet.annotation.MultipartConfig
public final  class tmordenconsumo extends GXWebObjectStub
{
   public tmordenconsumo( )
   {
   }

   public tmordenconsumo( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( tmordenconsumo.class ));
   }

   public tmordenconsumo( int remoteHandle ,
                          ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new tmordenconsumo_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new tmordenconsumo_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "TMOrden Consumo";
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

