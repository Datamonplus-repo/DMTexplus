package app.albaranesproduccion ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.albaranesproduccion.impresionguiamoda21", "/app.albaranesproduccion.impresionguiamoda21"})
@jakarta.servlet.annotation.MultipartConfig
public final  class impresionguiamoda21 extends GXWebObjectStub
{
   public impresionguiamoda21( )
   {
   }

   public impresionguiamoda21( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( impresionguiamoda21.class ));
   }

   public impresionguiamoda21( int remoteHandle ,
                               ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new impresionguiamoda21_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new impresionguiamoda21_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "Impresion Guia";
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

