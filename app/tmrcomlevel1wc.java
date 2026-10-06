package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.tmrcomlevel1wc", "/app.tmrcomlevel1wc"})
@jakarta.servlet.annotation.MultipartConfig
public final  class tmrcomlevel1wc extends GXWebObjectStub
{
   public tmrcomlevel1wc( )
   {
   }

   public tmrcomlevel1wc( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( tmrcomlevel1wc.class ));
   }

   public tmrcomlevel1wc( int remoteHandle ,
                          ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new tmrcomlevel1wc_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new tmrcomlevel1wc_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "TMRCom Level1 WC";
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

