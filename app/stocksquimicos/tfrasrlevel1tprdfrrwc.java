package app.stocksquimicos ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.stocksquimicos.tfrasrlevel1tprdfrrwc", "/app.stocksquimicos.tfrasrlevel1tprdfrrwc"})
@jakarta.servlet.annotation.MultipartConfig
public final  class tfrasrlevel1tprdfrrwc extends GXWebObjectStub
{
   public tfrasrlevel1tprdfrrwc( )
   {
   }

   public tfrasrlevel1tprdfrrwc( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( tfrasrlevel1tprdfrrwc.class ));
   }

   public tfrasrlevel1tprdfrrwc( int remoteHandle ,
                                 ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new tfrasrlevel1tprdfrrwc_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new tfrasrlevel1tprdfrrwc_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "TFRASRLevel1 TPRDFRRWC";
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

