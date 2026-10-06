package app.mantenimientomaquina ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.mantenimientomaquina.tmordcolevel1wc", "/app.mantenimientomaquina.tmordcolevel1wc"})
@jakarta.servlet.annotation.MultipartConfig
public final  class tmordcolevel1wc extends GXWebObjectStub
{
   public tmordcolevel1wc( )
   {
   }

   public tmordcolevel1wc( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( tmordcolevel1wc.class ));
   }

   public tmordcolevel1wc( int remoteHandle ,
                           ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new tmordcolevel1wc_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new tmordcolevel1wc_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "TMOrd Co Level1 WC";
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

