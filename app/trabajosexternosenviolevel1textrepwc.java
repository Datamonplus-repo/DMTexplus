package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.trabajosexternosenviolevel1textrepwc", "/app.trabajosexternosenviolevel1textrepwc"})
@jakarta.servlet.annotation.MultipartConfig
public final  class trabajosexternosenviolevel1textrepwc extends GXWebObjectStub
{
   public trabajosexternosenviolevel1textrepwc( )
   {
   }

   public trabajosexternosenviolevel1textrepwc( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( trabajosexternosenviolevel1textrepwc.class ));
   }

   public trabajosexternosenviolevel1textrepwc( int remoteHandle ,
                                                ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new trabajosexternosenviolevel1textrepwc_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new trabajosexternosenviolevel1textrepwc_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "Trabajos Externos Envio Level1 TEXTREPWC";
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

