package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.tmcompraww", "/app.tmcompraww"})
@jakarta.servlet.annotation.MultipartConfig
public final  class tmcompraww extends GXWebObjectStub
{
   public tmcompraww( )
   {
   }

   public tmcompraww( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( tmcompraww.class ));
   }

   public tmcompraww( int remoteHandle ,
                      ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new tmcompraww_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new tmcompraww_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return " Compras";
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

