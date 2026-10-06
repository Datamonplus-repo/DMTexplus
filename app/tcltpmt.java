package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.tcltpmt", "/app.tcltpmt"})
@jakarta.servlet.annotation.MultipartConfig
public final  class tcltpmt extends GXWebObjectStub
{
   public tcltpmt( )
   {
   }

   public tcltpmt( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( tcltpmt.class ));
   }

   public tcltpmt( int remoteHandle ,
                   ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new tcltpmt_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new tcltpmt_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "CLIENTE mas TIPO DE MUESTRA";
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

