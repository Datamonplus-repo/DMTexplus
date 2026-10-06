package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.trabajosexternosenviolevel1textsalwc", "/app.trabajosexternosenviolevel1textsalwc"})
@jakarta.servlet.annotation.MultipartConfig
public final  class trabajosexternosenviolevel1textsalwc extends GXWebObjectStub
{
   public trabajosexternosenviolevel1textsalwc( )
   {
   }

   public trabajosexternosenviolevel1textsalwc( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( trabajosexternosenviolevel1textsalwc.class ));
   }

   public trabajosexternosenviolevel1textsalwc( int remoteHandle ,
                                                ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new trabajosexternosenviolevel1textsalwc_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new trabajosexternosenviolevel1textsalwc_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "Trabajos Externos Envio Level1 TEXTSALWC";
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

