package app.trabajosexternos ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.trabajosexternos.trabajoexterno__impresion_wc", "/app.trabajosexternos.trabajoexterno__impresion_wc"})
@jakarta.servlet.annotation.MultipartConfig
public final  class trabajoexterno__impresion_wc extends GXWebObjectStub
{
   public trabajoexterno__impresion_wc( )
   {
   }

   public trabajoexterno__impresion_wc( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( trabajoexterno__impresion_wc.class ));
   }

   public trabajoexterno__impresion_wc( int remoteHandle ,
                                        ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new trabajoexterno__impresion_wc_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new trabajoexterno__impresion_wc_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "Trabajo Externo (Impresion)";
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

