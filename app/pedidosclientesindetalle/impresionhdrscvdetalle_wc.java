package app.pedidosclientesindetalle ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.pedidosclientesindetalle.impresionhdrscvdetalle_wc", "/app.pedidosclientesindetalle.impresionhdrscvdetalle_wc"})
@jakarta.servlet.annotation.MultipartConfig
public final  class impresionhdrscvdetalle_wc extends GXWebObjectStub
{
   public impresionhdrscvdetalle_wc( )
   {
   }

   public impresionhdrscvdetalle_wc( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( impresionhdrscvdetalle_wc.class ));
   }

   public impresionhdrscvdetalle_wc( int remoteHandle ,
                                     ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new impresionhdrscvdetalle_wc_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new impresionhdrscvdetalle_wc_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return " Mantenimiento HDRs";
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

